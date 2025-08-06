package Sample;

	import java.io.FileInputStream;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.LinkedHashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Optional;

	import org.apache.poi.ss.usermodel.*;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class VerifySectionwise {	    
	    /* --------- LOGIN / HEADER DETAILS --------- */
	    private static final String BASE_URL   = "https://myworld.metaagrow.com/login-view";
	    private static final String USERNAME   = "alex@gmail.com";
	    private static final String PASSWORD   = "Alex@123";
	 
	    private static final String PROPERTY   = "SuperNova Gaming Hub";
	    private static final String FREQUENCY  = "Monthly";
	    private static final String START_DATE = "17/07/2025";
	    private static final String END_DATE   = "31/12/2026";
	 
	    /* --------- USER FLAGS --------- */
	    private static final boolean USE_SELECT_ALL =
	            Boolean.parseBoolean(System.getProperty("selectAll", "false"));
	 
	    private static final List<String> SPECIFIC_USERS = Optional
	            .ofNullable(System.getProperty("users"))
	            .map((String s) -> Arrays.asList(s.split("\\s*,\\s*")))
	            .orElse(Arrays.asList(
	                    "Kiran Pathare",
	                    "Sachin Gayake"
	            ));
	    
	    /* --------- SECTIONS & QUESTIONS (loaded from Excel) --------- */
	    private static LinkedHashMap<String, List<String>> DATA = new LinkedHashMap<>();

	    /* ----------------- MAIN ----------------- */
	    public static void main(String[] args) {
	 
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	 
	        String templateName = "Z-Force" + System.currentTimeMillis();

	        // Load sections & questions from Excel before starting
	        loadSectionsFromExcel("./TestData/PMTest.xlsx");
	 
	        try {
	            /* 1??  LOGIN ------------------------------------------------ */
	            System.out.println("1??  Opening login page …");
	            driver.get(BASE_URL);
	            driver.manage().window().maximize();
	            driver.findElement(By.id("username")).sendKeys(USERNAME);
	            driver.findElement(By.id("password")).sendKeys(PASSWORD);
	            driver.findElement(By.cssSelector("button.btn-primary")).click();
	            dismissIfPresent(wait, By.xpath("//button[text()='Later']"), "   • subscription pop-up closed");
	 
	            /* 1??  Select one property From Overall Property Dropdown ------------------------------------------------ */
	            new Select(waitVisible(wait, By.id("language"))).selectByVisibleText(PROPERTY);

	            /* 2??  NAVIGATION ------------------------------------------ */
	            System.out.println("2??  Navigating ? Maintenance ? PM Template ? New");
	            click(wait, By.id("maintenance"));
	            click(wait, By.id("pmTemplate"));
	            click(wait, By.id("createButton"));
	            click(wait, By.id("createFreshTemplate"));
	 
	            /* 3??  HEADER ---------------------------------------------- */
//	            System.out.println("3??  Filling header …");
//	            new Select(waitVisible(wait, By.id("language"))).selectByVisibleText(PROPERTY);
	 
	            WebElement nameBox = waitVisible(wait, By.xpath("//input[@formcontrolname='name']"));
	            nameBox.clear();  nameBox.sendKeys(templateName);
	            if (alertPresent(wait,2)) retryName(wait,nameBox,templateName+"_1");
	 
	            setDate(js, wait, By.id("pmStartDate"), START_DATE);
	            setDate(js, wait, By.id("pmEndDate"),   END_DATE);
	            new Select(waitVisible(wait, By.xpath("//select[@formcontrolname='selectFrequency']")))
	                    .selectByVisibleText(FREQUENCY);
	            System.out.println("   • header done");
	 
	            /* 4??  USERS ----------------------------------------------- */
	            System.out.println("4??  Assigning users …");
	            assignUsers(js, wait);
	 
	            /* 5??  SECTIONS & QUESTIONS -------------------------------- */
	            System.out.println("5??  Adding sections & questions …");
	 
	            boolean firstSec = true;
	            for (Map.Entry<String,List<String>> sec : DATA.entrySet()) {
	 
	                if (!firstSec) addSection(wait, js);
	                firstSec = false;
	 
	                /* find the NEWEST section card (contains sectionName input) */
	                WebElement sectionCard = latestSectionCard(wait);
	 
	                /* section title input lives inside that card */
	                WebElement secInput = sectionCard.findElement(By.id("checklistSectionName"));
	                secInput.clear();
	                secInput.sendKeys(sec.getKey());
	                System.out.println("   • Section: " + sec.getKey());
	 
	                /* loop questions */
	                int qIdx = 1;
	                for (String qText : sec.getValue()) {
	 
	                    if (qIdx > 1) addQuestion(wait, js, sectionCard);
	                    qIdx++;
	 
	                    WebElement qRow   = latestRowInSection(sectionCard);
	                    WebElement qInput = qRow.findElement(By.xpath(".//input[@formcontrolname='name']"));
	                    qInput.sendKeys(qText);
	 
	                    pickWorkingNotWorking(js, wait, qRow);
	                }
	            }
	            /* 6️⃣  SAVE ------------------------------------------------- */
	            System.out.println("6️⃣  Saving & submitting …");
	            click(wait, By.id("pmnext"));
	     /*       click(wait, By.id("pmSubmit"));
	            waitVisible(wait, By.xpath("//p[contains(text(),'Maintenance created successfully')]"));
	            click(wait, By.id("okbutton"));
	 
	         */   System.out.println("🎉  DONE – template created: " + templateName);
	 
	        } catch (Throwable t) {
	            System.err.println("❌  TEST FAILED");
	            t.printStackTrace();
	        } finally {
	           // driver.quit();
	        }
	    }
	 
	    /* ─────────── helper blocks ─────────── */
	 
	    /* clickable helpers */
	    private static void click(WebDriverWait w, By by){
	        w.until(ExpectedConditions.elementToBeClickable(by)).click();
	    }
//	    private static WebElement waitVisible(WebDriverWait w, By by){
//	        return w.until(ExpectedConditions.visibilityOfElementLocated(by));
//	    }
	   
	    private static WebElement waitVisible(WebDriverWait w, By locator) {
	        WebElement element = w.until(ExpectedConditions.visibilityOfElementLocated(locator));
	        w.until(ExpectedConditions.elementToBeClickable(locator));
	        return element;
	    }

	    private static void dismissIfPresent(WebDriverWait w, By loc, String msg){
	        try { click(w, loc); System.out.println(msg); } catch (Exception ignored) {}
	    }
	 
	    /* alert retry */
	    private static boolean alertPresent(WebDriverWait w,int sec){
	        try { w.withTimeout(Duration.ofSeconds(sec)).until(ExpectedConditions.alertIsPresent()); return true; }
	        catch (TimeoutException e){ return false; }
	    }
	    private static void retryName(WebDriverWait w, WebElement box, String newVal){
	        Alert a = w.until(ExpectedConditions.alertIsPresent());
	        System.out.println("⚠️  Alert handled: " + a.getText());
	        a.accept();
	        box.clear(); box.sendKeys(newVal);
	    }
	 
	    /* date via JS */
	    private static void setDate(JavascriptExecutor js, WebDriverWait w, By field,String ddMMyyyy){
	        WebElement e = waitVisible(w, field);
	        js.executeScript("arguments[0].value='"+ddMMyyyy+"'; arguments[0].dispatchEvent(new Event('input'));", e);
	    }
	 
	    /* ---- SECTION / ROW helpers ---- */
	 
	    /** newest section card (input[formcontrolname='sectionName']) */
	    private static WebElement latestSectionCard(WebDriverWait w){
	        List<WebElement> cards = w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
	            By.xpath("//input[@formcontrolname='sectionName']/ancestor::li[contains(@class,'card')]")));
	        return cards.get(cards.size()-1);
	    }
	 
	    /** newest question row inside that section‑card */
	    private static WebElement latestRowInSection(WebElement sectionCard){
	        List<WebElement> rows = sectionCard.findElements(
	            By.cssSelector("ul.ticket-list > li.card"));
	        return rows.get(rows.size()-1);
	    }
	 
	    /** add new section (global button) */
	    private static void addSection(WebDriverWait w, JavascriptExecutor js){
	        WebElement btn = w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.addChecklistSection")));
	        js.executeScript("arguments[0].scrollIntoView(true);", btn);
	        btn.click();
	    }
	 
	    /** add new question *inside the given section‑card* */
	    private static void addQuestion(WebDriverWait w, JavascriptExecutor js, WebElement sectionCard){
	        WebElement btn = sectionCard.findElement(By.cssSelector("a.addChecklistQuestion"));
	        js.executeScript("arguments[0].scrollIntoView(true);", btn);
	        w.until(ExpectedConditions.elementToBeClickable(btn)).click();
	    }
	 
	    /* pick “Working / Not Working” in row‑local dropdown */
	    private static void pickWorkingNotWorking(JavascriptExecutor js, WebDriverWait w, WebElement row){
	        WebElement respBtn = row.findElement(By.cssSelector("button.selectFreq"));
	        js.executeScript("arguments[0].click();", respBtn);
	 
	        WebElement multi   = row.findElement(By.xpath(".//a[normalize-space()='Multiple Choice']"));
	        w.until(ExpectedConditions.elementToBeClickable(multi)).click();
	 
	        WebElement working = row.findElement(By.xpath(".//button[.//span[normalize-space()='Working / Not Working']]"));
	        w.until(ExpectedConditions.elementToBeClickable(working)).click();
	    }
	 
	    /* user dropdown */
	    private static void assignUsers(JavascriptExecutor js, WebDriverWait w){
	        click(w, By.xpath("//button[contains(@class,'serviceTeamDetailsAssignedUser')]"));
	        if (USE_SELECT_ALL) {
	            click(w, By.xpath("//a[normalize-space()='Select All']"));
	            System.out.println("   • ALL users selected");
	        } else {
	            List<WebElement> labels = w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
	                By.xpath("//li[@id='custom']//span")));
	            for (WebElement lbl : labels) {
	                String name = lbl.getText().trim();
	                if (SPECIFIC_USERS.contains(name)) {
	                    WebElement cb = lbl.findElement(By.xpath("./ancestor::li[@id='custom']//input[@type='checkbox']"));
	                    if (!cb.isSelected()) js.executeScript("arguments[0].click();", cb);
	                    System.out.println("       ✔ " + name);
	                }
	            }
	            System.out.println("   • user assignment done");
	        }
	        js.executeScript("document.querySelector('.select-container button').click();");
	    }

	    /* Load sections & questions from Excel file */
	    private static void loadSectionsFromExcel(String filePath) {
	        DATA.clear();
	        try (FileInputStream fis = new FileInputStream(filePath);
	             Workbook workbook = WorkbookFactory.create(fis)) {

	            Sheet sheet = workbook.getSheetAt(0);
	            for (Row row : sheet) {
	                if (row.getRowNum() == 0) continue; // skip header
	                Cell sectionCell = row.getCell(0);
	                Cell questionCell = row.getCell(1);

	                if (sectionCell != null && questionCell != null) {
	                    String section = sectionCell.getStringCellValue().trim();
	                    String question = questionCell.getStringCellValue().trim();

	                    if (!section.isEmpty() && !question.isEmpty()) {
	                        DATA.computeIfAbsent(section, k -> new ArrayList<>()).add(question);
	                    }
	                }
	            }
	            System.out.println("Loaded sections & questions from Excel: " + DATA.keySet());

	        } catch (Exception e) {
	            e.printStackTrace();
	            throw new RuntimeException("Failed to load sections/questions from Excel");
	        }
	    }

}



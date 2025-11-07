package com.Metaagrow.Inspetions;
import java.time.Duration;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import io.github.bonigarcia.wdm.WebDriverManager;
public class EditPM {
	
	
	    private static final Logger logger = Logger.getLogger(EditPM.class.getName());
	 
	    static {

	        Logger.getLogger("").setLevel(Level.INFO);

	    }
	 
	    public static void main(String[] args) {

	        WebDriverManager.chromedriver().setup();

	        WebDriver driver = new ChromeDriver();
	 
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	        driver.manage().window().maximize();
	 
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        Actions actions = new Actions(driver);
	 
	        try {

	            // Step 1: Launch application

	            logger.info("Launching application...");

	            driver.get("https://myworld.metaagrow.com/login-view");
	 
	            // Step 2: Handle notification popup

	            handleNotificationPopup(driver, wait);
	 
	            // Step 3: Login

	            logger.info("Logging in...");

	            login(driver, wait);
	 
	            // Step 4: Navigate to Maintenance and Today tab

	            logger.info("Navigating to Maintenance > Today tab...");

	            navigateToMaintenanceTodayTab(driver, wait);
	 
	            // Step 5: Open Edit on first PM Checklist safely

	            logger.info("Opening edit menu for first PM checklist...");

	            openEditPMChecklist(driver, wait, js);
	 
	            // Step 6: Click on Edit link

	            logger.info("Clicking edit link...");

	            clickEditLink(driver, wait, js);
	 
	            Thread.sleep(1000); // small wait for Overview load
	 
	            // Step 7: Handle all questions

	            logger.info("Handling questions...");

	            handleQuestionsWithRetry(driver, wait, actions, js, 3);
	 
	            // Step 8: Enter reason and update

	            logger.info("Entering reason and updating...");

	            enterReasonAndUpdate(driver, wait, js);
	 
	            logger.info("✅ Test completed successfully!");
	 
	        } catch (Exception e) {

	            logger.severe("❌ Test execution failed: " + e.getMessage());

	            e.printStackTrace();

	        } finally {

	            driver.quit();

	            logger.info("Driver quit successfully");

	        }

	    }
	 
	    private static void handleNotificationPopup(WebDriver driver, WebDriverWait wait) {

	        try {

	            WebElement laterBtn = wait.until(ExpectedConditions

	                    .visibilityOfElementLocated(By.id("onesignal-slidedown-cancel-button")));

	            laterBtn.click();

	            logger.info("Notification popup handled");

	        } catch (Exception e) {

	            logger.info("Notification popup not present or already handled");

	        }

	    }
	 
	    private static void login(WebDriver driver, WebDriverWait wait) {

	        WebElement usernameField = wait.until(ExpectedConditions

	                .visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter Username']")));

	        usernameField.sendKeys("rushikesh@metaagrow.com");
	 
	        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));

	        passwordField.sendKeys("RKVFDC");
	 
	        WebElement loginButton = driver.findElement(By.xpath("//button[@class='button btn-primary d-flex w-100']"));

	        loginButton.click();
	 
	        wait.until(ExpectedConditions.urlContains("myworld"));

	    }
	 
	    private static void navigateToMaintenanceTodayTab(WebDriver driver, WebDriverWait wait) {

	        WebElement maintenanceTab = wait.until(ExpectedConditions

	                .elementToBeClickable(By.id("inspection")));

	        maintenanceTab.click();
	 
	        WebElement todayTab = wait.until(ExpectedConditions

	                .elementToBeClickable(By.id("today")));

	        todayTab.click();

	    }

	
	 
	private static void openEditPMChecklist(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
	        try {
	            WebElement changeBtn = wait.until(ExpectedConditions.refreshed(
	                    ExpectedConditions.elementToBeClickable(By.xpath("(//img[@id='changeBUton'])[1]"))));
	            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", changeBtn);
	            Thread.sleep(500);
	            js.executeScript("arguments[0].click();", changeBtn);
	            logger.info("Clicked change button successfully");
	        } catch (StaleElementReferenceException | InterruptedException e) {
	            logger.warning("Change button stale, retrying...");
	            WebElement changeBtnRetry = wait.until(ExpectedConditions.refreshed(
	                    ExpectedConditions.elementToBeClickable(By.xpath("(//img[@id='changeBUton'])[1]"))));
	            js.executeScript("arguments[0].click();", changeBtnRetry);
	            logger.info("Retry click on change button successful");
	        }
	    }
	 
	    private static void clickEditLink(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
	        try {
	            WebElement editBtn = wait.until(ExpectedConditions.refreshed(
	                    ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Edit'])[1]"))));
	            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", editBtn);
	            Thread.sleep(500);
	            js.executeScript("arguments[0].click();", editBtn);
	            logger.info("Clicked edit link successfully");
	        } catch (StaleElementReferenceException | InterruptedException e) {
	            logger.warning("Edit link stale, retrying...");
	            WebElement editBtnRetry = wait.until(ExpectedConditions.refreshed(
	                    ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Edit'])[1]"))));
	            js.executeScript("arguments[0].click();", editBtnRetry);
	            logger.info("Retry click on edit link successful");
	        }
	 
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='dropContentMain']")));
	    }
	 
	    private static void handleQuestionsWithRetry(WebDriver driver, WebDriverWait wait,
	            Actions actions, JavascriptExecutor js, int maxRetries) {
	 
	        List<WebElement> questions = wait.until(ExpectedConditions
	                .presenceOfAllElementsLocatedBy(By.xpath("//div[@class='row' and @style='padding: 10px;']")));
	 
	        logger.info("Total Questions Found: " + questions.size());
	 
	        for (int i = 0; i < questions.size(); i++) {
	            boolean handled = false;
	            int retryCount = 0;
	 
	            while (!handled && retryCount < maxRetries) {
	                try {
	                    List<WebElement> currentQuestions = driver.findElements(
	                            By.xpath("//div[contains(@class,'response-wrap')]"));
	 
	                    if (i >= currentQuestions.size()) {
	                        logger.warning("Question index " + i + " is out of bounds after DOM changes");
	                        break;
	                    }
	 
	                    WebElement question = currentQuestions.get(i);
	                    js.executeScript("arguments[0].scrollIntoView({block: 'center', behavior: 'smooth'});", question);
	 
	                    handleQuestion(question, i+1, actions);
	                    handled = true;
	 
	                } catch (StaleElementReferenceException e) {
	                    retryCount++;
	                    logger.warning("Stale element on question " + (i+1) + ", retry " + retryCount);
	 
	                    if (retryCount >= maxRetries) {
	                        logger.severe("Failed to handle question " + (i+1) + " after " + maxRetries + " retries");
	                    }
	 
	                    try { Thread.sleep(1000); } catch (InterruptedException ie) { Thread.currentThread().interrupt(); }
	                }
	            }
	        }
	 
	        logger.info("Finished handling all questions");
	    }
	 
	    private static void handleQuestion(WebElement question, int questionNum, Actions actions) {
	        List<WebElement> buttons = question.findElements(By.xpath(".//button[contains(@class,'Button')]"));
	        if (!buttons.isEmpty()) {
	            buttons.get(0).click();
	            logger.info("Q" + questionNum + ": Clicked button");
	            return;
	        }
	 
	        List<WebElement> textInputs = question.findElements(By.xpath(".//input[@placeholder='Enter Text']"));
	        if (!textInputs.isEmpty()) {
	            WebElement input = textInputs.get(0);
	            input.clear();
	            input.sendKeys("Automation Test Response Q" + questionNum);
	            logger.info("Q" + questionNum + ": Entered text");
	            return;
	        }
	 
	        // Case 3: Digital Signature button
	        List<WebElement> digiButtons = question.findElements(By.xpath(".//button[span[contains(text(),'Digital Signature')]]"));
	        if (!digiButtons.isEmpty()) {
	            digiButtons.get(0).click(); // open signature modal
	            try {
	                WebDriver driver = ((WrapsDriver) question).getWrappedDriver();
	                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	                // Wait for canvas in popup
	                WebElement canvas = wait.until(ExpectedConditions
	                        .visibilityOfElementLocated(By.tagName("canvas")));
	 
	                int xOffset = canvas.getSize().getWidth() / 4;
	                int yOffset = canvas.getSize().getHeight() / 2;
	 
	                actions.moveToElement(canvas, xOffset, yOffset)
	                        .clickAndHold()
	                        .moveByOffset(60, 0)
	                        .moveByOffset(0, 40)
	                        .moveByOffset(-60, 0)
	                        .release()
	                        .perform();
	 
	                // Click Save inside signature modal
	                try {
	                    WebElement saveBtn = wait.until(ExpectedConditions
	                            .elementToBeClickable(By.xpath("//button[contains(text(),'Save')]")));
	                    saveBtn.click();
	                    logger.info("✅ Digital Signature saved for Q" + questionNum);
	                } catch (Exception e) {
	                    logger.warning("⚠️ Save button not found in Digital Signature modal for Q" + questionNum);
	                }
	 
	            } catch (Exception e) {
	                logger.severe("❌ Failed to perform Digital Signature for Q" + questionNum + ": " + e.getMessage());
	            }
	            return;
	        }
	    }
	 
	    private static void enterReasonAndUpdate(WebDriver driver, WebDriverWait wait, JavascriptExecutor js) {
	        WebElement reasonField = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//textarea[@placeholder='Enter reason* ']")));
	        reasonField.clear();
	        reasonField.sendKeys("Automated Reason for checklist update");
	 
	        WebElement updateBtn = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[normalize-space()='Update']")));
	        js.executeScript("arguments[0].click();", updateBtn);
	 
	        // --- Handle "Yes" confirmation popup ---
	        try {
	            WebElement confirmBtn = wait.until(ExpectedConditions.refreshed(
	                    ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Yes']"))));
	            js.executeScript("arguments[0].scrollIntoView({block:'center'});", confirmBtn);
	            js.executeScript("arguments[0].click();", confirmBtn);
	            logger.info("Clicked Yes on confirmation popup");
	        } catch (TimeoutException e) {
	            logger.info("No Yes confirmation popup displayed");
	        }
	 
	        // --- Handle "Ok" success popup ---
	        try {
	            // Wait for popup container to appear
	            WebElement popup = new WebDriverWait(driver, Duration.ofSeconds(20))
	                    .until(ExpectedConditions.visibilityOfElementLocated(By.id("successPopUp3")));
	            logger.info("Success popup displayed");
	 
	            // Then wait for Ok button inside it
	            WebElement okBtn = popup.findElement(By.id("backClicked"));
	            new WebDriverWait(driver, Duration.ofSeconds(10))
	                    .until(ExpectedConditions.elementToBeClickable(okBtn));
	 
	            js.executeScript("arguments[0].scrollIntoView({block:'center'});", okBtn);
	            js.executeScript("arguments[0].click();", okBtn);
	            logger.info("Clicked Ok on success popup");
	 
	        } catch (TimeoutException e) {
	            logger.severe("Ok success popup did not appear in time");
	        } catch (StaleElementReferenceException se) {
	            logger.warning("Ok popup went stale, retrying...");
	            try {
	                WebElement okBtnRetry = wait.until(ExpectedConditions.elementToBeClickable(By.id("backClicked")));
	                js.executeScript("arguments[0].click();", okBtnRetry);
	                logger.info("Retry click on Ok popup successful");
	            } catch (Exception finalEx) {
	                logger.severe("Failed to click Ok popup even after retry: " + finalEx.getMessage());
	            }
	        }
	    }
	 
	
	 

}

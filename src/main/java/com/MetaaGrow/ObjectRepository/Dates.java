package com.MetaaGrow.ObjectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Dates {

	    public void startDate(WebDriver driver, String targetMonth, String targetDay) throws InterruptedException {
	        // Click on the Start Date input field to open the date picker
	        driver.findElement(By.xpath("//input[@placeholder='Start Date']")).click();
	        Thread.sleep(3000);

	        // Loop until the target month is displayed
	        while (true) {
	            // Extract the text of the currently displayed month in the date picker
	            String displayedMonth = driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[2]")).getText();

	            // Check if the displayed month matches the target month
	            if (displayedMonth.equals(targetMonth)) {
	                break; // Exit the loop if the target month is reached
	            } else {
	                // Click on the left arrow to navigate to the previous month
	                driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
	            }
	        }

	        // Click on the day in the date picker
	        driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
	    }
	    
	    

	        public void End_Date(WebDriver driver, String targetMonth, String targetDay) {
	            // Click on the End Date input field to open the date picker
	            driver.findElement(By.xpath("//input[@placeholder='End Date']")).click();

	            // Loop until the target month is displayed
	            while (true) {
	                // Extract the text of the currently displayed month in the date picker
	                String displayedMonth = driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).getText();

	                // Check if the displayed month matches the target month
	                if (displayedMonth.equals(targetMonth)) {
	                    break; // Exit the loop if the target month is reached
	                } else {
	                    // Click on the right arrow to navigate to the next month
	                    driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
	                }
	            }
	            System.out.println("before click");

	            // Click on the day in the date picker
	            driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
	            System.out.println("after click");

	        }
	        
	        public void Expiration_Date(WebDriver driver, String targetMonth, String targetDay) {
	            // Click on the End Date input field to open the date picker
	            driver.findElement(By.xpath("//input[@placeholder='Expiration Date']")).click();

	            // Loop until the target month is displayed
	            while (true) {
	                // Extract the text of the currently displayed month in the date picker
	                String displayedMonth = driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).getText();

	                // Check if the displayed month matches the target month
	                if (displayedMonth.equals(targetMonth)) {
	                    break; // Exit the loop if the target month is reached
	                } else {
	                    // Click on the right arrow to navigate to the next month
	                    driver.findElement(By.xpath("//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
	                }
	            }
	            System.out.println("before click");

	            // Click on the day in the date picker
	            driver.findElement(By.xpath("//span[normalize-space()='" + targetDay + "']")).click();
	            System.out.println("after click");

	        }
	    

	

}


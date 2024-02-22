package test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testTextFieldState {
	 @Disabled
	    void testChrome() throws  InterruptedException {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.coding-midcareer.com/");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.className("theme-btn")).click();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,2000)", "");

	        Boolean receipt_name_tf =driver.findElement(By.name("receipt_name")).isEnabled();
	        assertFalse(receipt_name_tf);
	        
	        
	        Thread.sleep(5000);

	        driver.quit();
	    }
	 @Test
	    void testButton() throws InterruptedException {
	        WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://mflowthai.com/mflow/consent");
	        Boolean confirm_1_False =driver.findElement(By.id("confirmModalButton")).isEnabled();
	        assertFalse(confirm_1_False);
	        
	        driver.findElement(By.id("0")).click();
	        driver.findElement(By.id("1")).click();
	        driver.findElement(By.id("2")).click();
	        driver.findElement(By.id("3")).click();
	        
	        Boolean confirm_2_True =driver.findElement(By.id("confirmModalButton")).isEnabled();
	        assertTrue(confirm_2_True);
	        
	        driver.findElement(By.id("confirmModalButton")).click();
	        
	        Thread.sleep(1000);
	        Boolean confirm_3_False =driver.findElement(By.id("confirmModalButton")).isEnabled();
	        assertFalse(confirm_3_False);
	        
	        
	        driver.quit();
	        
	 }

}

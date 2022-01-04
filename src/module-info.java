package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;


public class firstclass {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://play.google.com/store/apps");
		Thread.sleep(5000);
		assertTrue(driver.getTitle().contains("Android Apps"));
		driver.findElement(By.id("action-dropdown-parent-Categories")).click();
		driver.findElement(By.xpath("//*[@id=\"action-dropdown-children-Categories\"]/div/ul/li[1]/ul/li[11]/a ")).click();
		Thread.sleep(2000);
		assertTrue(driver.getTitle().contains("Education"));
		Thread.sleep(5000);
		driver.quit();
	}
}	

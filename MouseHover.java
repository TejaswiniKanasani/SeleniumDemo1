package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		WebElement element1 = driver.findElement(By.linkText("Electronics"));
		WebElement e3 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element1).perform();
		Thread.sleep(2000);
		action.moveToElement(e3).perform();
		
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.linkText("Industrial equipment"));
		action.moveToElement(element2).perform();
		
	}

}

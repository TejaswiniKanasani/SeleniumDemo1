package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement source = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]"));
		
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]"));
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform(); //select the source element and performs select and copy operation
		Thread.sleep(2000);
		action.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();////select the source element and performs select and paste operation
		Thread.sleep(2000);
		driver.close();
	}

}

package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		WebElement radio = driver.findElement(By.xpath("//input[@value='Request a Demo']"));
		//here actions class is used to scroll up and down
		Actions action = new Actions(driver);
		action.moveToElement(radio);
		action.perform();
		driver.findElement(By.name("interest_market_c")).click();
		driver.findElement(By.name("interest_serve_c")).click();
	}

}

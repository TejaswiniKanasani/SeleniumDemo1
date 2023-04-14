package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select = new Select(ddown);
		select.selectByIndex(1);
		select.selectByValue("level3");
		select.selectByVisibleText("251 - 500 employees");
	}

}

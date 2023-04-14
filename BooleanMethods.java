package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BooleanMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement pageOne =driver.findElement(By.linkText("Page One"));
		boolean displayed =pageOne.isDisplayed();
		System.out.println(displayed);
		if(displayed) {
			pageOne.click();
		}else {
			driver.close();
		}
		
		WebElement button2 =driver.findElement(By.id("but2"));
		boolean enabled = button2.isEnabled();
		System.out.println(enabled);
		if(enabled==true) {
			button2.click();
		}else
		{
			driver.close();
		}
		
		WebElement button1 = driver.findElement(By.id("but1"));
		boolean disabled = button1.isEnabled();
		System.out.println(disabled);
		if(disabled) {
			button1.click();
		}else
		{
			//driver.quit();
			System.out.println("button 1 is disabled");
		}
		
		WebElement radio2 = driver.findElement(By.id("radio2"));
		radio2.click();
		boolean selected =radio2.isSelected();
		System.out.println(selected);
		if(selected) {
			System.out.println("Radio 2 is selected");
		}else {
			System.out.println("Radio 2 is not selected");
		}
		
		radio2.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}

package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
		driver.switchTo().frame("iframeResult");
		
		
		driver.findElement(By.xpath("/html/body/button")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		

	}

}

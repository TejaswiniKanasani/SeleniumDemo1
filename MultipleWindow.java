package ui;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/a")).click();
		Set<String> windowHandle = driver.getWindowHandles(); //to get all the open windows
		Iterator<String> iterator = windowHandle.iterator();  //to iterate through windows
		String parentWindow = iterator.next();
		System.out.println("Parent Window :" +parentWindow);
		String childWindow=iterator.next();
		System.out.println("Child Window " +childWindow);
		driver.switchTo().window(childWindow);
		
		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
		driver.switchTo().window(parentWindow);
		
		
	}

}

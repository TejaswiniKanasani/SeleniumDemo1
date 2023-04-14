package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[1]")).sendKeys("Teju");
		//driver.findElement(By.id("crcrtg")).click();
		driver.switchTo().frame("iframe4");
		
		//driver.switchTo().window("xyz");
		//driver.findElement(By.id("prompt")).click();
		//String alertText = driver.switchTo().alert().getText();
		//System.out.println("The Alert text is "+alertText);
		
		//driver.switchTo().alert().accept();
		
		/*Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.sendKeys("Teju Kanasani");
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		//alert.dismiss();*/
		//driver.close();
	}

}

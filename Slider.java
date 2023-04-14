package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		//WebElement resize = driver.findElement(By.id("resizable"));
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"red\"]/span"));

		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDropBy(slider, -130,79).perform();	

	}

}

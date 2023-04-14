package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		WebElement button = driver.findElement(By.xpath("//input[@value='Request a Demo']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(button);
		action1.perform();
		//Thread.sleep(5000);
		WebElement radio1 = driver.findElement(By.id("doi0"));
		WebElement radio2 = driver.findElement(By.id("doi1"));
		radio1.click();
		System.out.println("Book fights is selected: "+radio1.isSelected());
		System.out.println("Reedeem flights is selected:"+radio2.isSelected());
		//Thread.sleep(5000);
		radio2.click();
		System.out.println("Book fights is selected: "+radio1.isSelected());
		System.out.println("Reedeem flights is selected:"+radio2.isSelected());
		//Thread.sleep(5000);
		driver.close();

	}

}

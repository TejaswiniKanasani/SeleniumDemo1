package ui;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PrintAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		List<WebElement> link = driver.findElementsByTagName("a");
		System.out.println("The no of links are "+link.size());
		
		for(int i=0;i<link.size();i++)
		{
			System.out.println(i+"."+link.get(i).getAttribute("href"));//prints the link
			System.out.println(i+"."+link.get(i).getText());//prints the text

		}
	}

}

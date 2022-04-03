package Assignment_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sushant\\Desktop\\Java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("http://qatechhub.com");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}
}

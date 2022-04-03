package Assignment_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_IEdriver 
{
	public static void main(String[] args) throws InterruptedException 
	{
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub  
			System.setProperty("webdriver.ie.driver","C:\\Users\\Sushant\\Desktop\\Java\\IEDriverServer.exe");
			//InternetExplorerDriver options = new InternetExplorerDriver();
			//options.addArguments("--disable-notifications"); 		 
			WebDriver driver=new InternetExplorerDriver();   
			driver.manage().window().maximize(); // Maximize browser window
			driver.get("https://www.myntra.com/"); // Navigate to Myntra.com
	        Thread.sleep(3000);
	        WebElement Women = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a"));
	        Actions action = new Actions(driver); 
	        //Thread.sleep(3000);
	        action.moveToElement(Women).click().perform();
	        WebElement Sarees = driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div/div[6]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/a"));
	        //Thread.sleep(3000);
	        Sarees.click();  
	        WebElement SortBy = driver.findElement(By.className("sort-sortBy"));
	        //Thread.sleep(3000);
	        action.moveToElement(SortBy).perform();
	        WebElement WhatsNew = driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[1]/div/div/div/ul/li[1]/label"));
	        Thread.sleep(3000);
	        WhatsNew.click();    
	        //Select Brand
	        WebElement Brand = driver.findElement(By.name("Unnati Silks"));
	        Thread.sleep(3000);
	        Brand.click(); 
	        //Select Discount
	        WebElement Discount = driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[5]/ul/li[2]/label/input"));
	        Thread.sleep(3000);
	        Discount.click(); 
	        //Select Green Color
	        WebElement Color = driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[4]/ul/li[1]/label/input"));
	        Thread.sleep(3000);
	        Color.click(); 
	}

}





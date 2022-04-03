package Assignment_Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Scenario_4 
{ 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sushant\\Desktop\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); 

		WebDriver driver = new ChromeDriver(options); // Open Browser 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize(); // Maximize browser window
		driver.get("https://www.myntra.com/"); // Navigate to Myntra.com
		Thread.sleep(3000);
		WebElement Women = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a"));
		Actions action = new Actions(driver); 
		Thread.sleep(3000);
		action.moveToElement(Women).click().perform();
		WebElement Category = driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div/div[14]/div/div/div/div/div[2]/div/div/div/div/div/a"));
		Category.click();   
		WebElement SortBy = driver.findElement(By.className("sort-sortBy"));
		Thread.sleep(3000);
		action.moveToElement(SortBy).perform();

		WebElement WhatsNew = driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[1]/div/div/div/ul/li[1]/label"));
		Thread.sleep(3000);
		WhatsNew.click(); 
		driver.findElement(By.xpath("//li[@class='colour-listItem']")).click();	
		driver.findElement(By.xpath("//div[@class='vertical-filters-filters brand-container']//ul[1]//li[1]")).click();	        
		Thread.sleep(3000);
		// click on the compose button as soon as the "compose" button is visible
		driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[2]/a/div[2]/div/span[1]/span[1]")).click();
		Set<String>windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator(); 
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid); 
		driver.findElement(By.xpath("//*[@id=\"sizeButtonsContainer\"]/div[2]/div[1]/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("pdp-add-to-bag")).click();
		driver.findElement(By.className("desktop-iconBag")).click();
		driver.findElement(By.className("itemContainer-base-selectionIndicator")).click();
		driver.findElement(By.className("bulkActionStrip-desktopBulkWishlist")).click();
		driver.findElement(By.cssSelector(".inlinebuttonV2-base-actionButton.bulkActionStrip-waterMelon")).click();
		driver.quit();
	}
}

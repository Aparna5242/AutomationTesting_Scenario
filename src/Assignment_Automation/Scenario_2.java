package Assignment_Automation;
 
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Scenario_2 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sushant\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		WebElement trending1 = driver.findElement(By.xpath("//*[@id=\"bd\"]/ol[2]/li/div/div/ul/li/div[1]/h4"));
		String title = trending1.getText();
		
		if(title.equals("Trending Now"))
		{ 
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("Title not verified");
		}
		
		System.out.println("Links under trending now :");
		WebElement trending = driver.findElement(By.cssSelector(".spl.d-ib.w-100p")); 
		List<WebElement>link = trending.findElements(By.tagName("a"));
		int count=link.size();
		System.out.println("Number of links="+count);
	    for(int i=0;i<link.size();i++)
		{
			
			System.out.println(link.get(i).getText());
			link.get(i).click();
			Thread.sleep(3000);
			driver.navigate().back();
			trending = driver.findElement(By.cssSelector(".spl:nth-child(1)"));
			link = trending.findElements(By.tagName("a"));
		}
	
	    WebElement link1 = driver.findElement(By.xpath("//*[@id=\"bd\"]/ol[2]/li/div/div/ul/li/div[2]/ul/li[1]/a"));
        link1.click();
        System.out.println("Country -"+driver.findElement(By.xpath("//*[@class='dd coronavirusTable']//tbody/tr/td[1]")).getText());
        System.out.println("Cases -"+driver.findElement(By.xpath("//*[@class='dd coronavirusTable']//tbody/tr/td[2]")).getText());
        System.out.println("Deaths -"+driver.findElement(By.xpath("//*[@class='dd coronavirusTable']//tbody/tr/td[4]")).getText());
        driver.quit();

		        
	}
	
}



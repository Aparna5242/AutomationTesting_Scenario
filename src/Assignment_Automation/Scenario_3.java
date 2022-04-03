package Assignment_Automation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_3 
{



	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sushant\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		
	   WebElement trending = driver.findElement(By.xpath("//*[@id=\"bd\"]/ol[2]/li/div/div/ul/li/div[1]/h4"));
		
		String title = trending.getText();
		
      
		if(title.equals("Trending Now"))
		{ 
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("Title not verified");
		}
		
		System.out.println("Links under trending now :");
		WebElement trending1 = driver.findElement(By.xpath("//li[@class='spl d-ib w-100p']"));
		List<WebElement>links = trending1.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			
			System.out.println(links.get(i).getText());
			links.get(i).click();
			driver.navigate().back();
			trending = driver.findElement(By.xpath("//li[@class='spl d-ib w-100p']"));
			links = trending.findElements(By.tagName("a"));
	
            
		}
		WebElement link1 = driver.findElement(By.cssSelector("#bd > ol.reg.searchBottom > li > div > div > ul > li > div.compList.lh-l.fz-s.pl-10.pr-10 > ul > li:nth-child(1) > a"));
		link1.click();
        System.out.println("Country -"+driver.findElement(By.xpath("//*[@class='dd coronavirusTable']//tbody/tr/td[1]")).getText());
        System.out.println("Cases -"+driver.findElement(By.xpath("//*[@class='dd coronavirusTable']//tbody/tr/td[2]")).getText());
        System.out.println("Deaths -"+driver.findElement(By.xpath("//*[@class='dd coronavirusTable']//tbody/tr/td[4]")).getText());
        driver.quit();
	   
	}

}
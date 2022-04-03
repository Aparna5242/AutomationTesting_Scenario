import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction 
{
	

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sushant\\Desktop\\Java\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver(); 
		 driver.get("https://www.amazon.in/");
		 
		 
	}

}

package my_selenium_project;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButtonEx {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\my_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://spicejet.com");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("div[@class='css-1dbjc4n r-184aecr r-18u37iz r-1777fci r-1w50u8q r-184en5c']")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-15d164r r-1otgn73'])[5]")).click();
	}

}

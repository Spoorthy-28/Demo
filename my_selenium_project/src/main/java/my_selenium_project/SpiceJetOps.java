package my_selenium_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJetOps {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\my_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
	//	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://spicejet.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'])[11]")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'])[5]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
		driver.findElement(By.xpath("//div[@style='flex: 0.4 1 0%; -webkit-box-flex: 0.4;']")).click();
		WebDriverWait d = new WebDriverWait(driver,3);
		d.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='css-1dbjc4n r-1d09ksm r-18u37iz'])[2]")));
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1d09ksm r-18u37iz'])[2]")).click();
	}

}

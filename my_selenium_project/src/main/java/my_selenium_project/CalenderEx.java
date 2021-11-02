package my_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\my_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
	}

}

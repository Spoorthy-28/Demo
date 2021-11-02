package my_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\my_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		int c = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		for(int i=0;i<c;i++) {
			driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			Thread.sleep(1000);
		}
	}

}

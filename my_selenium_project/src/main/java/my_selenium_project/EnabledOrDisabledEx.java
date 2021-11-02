package my_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnabledOrDisabledEx {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\my_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://spicejet.com");
		Thread.sleep(1000);
//		String style1 = driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]")).getAttribute("style");
//		System.out.println(style1);
		if(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]")).getAttribute("style").contains("1")) {	
			System.out.println("It is Enabled");
		}
		else {
			System.out.println("It is Disabled");
		}
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[2]")).click();	
		if(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]")).getAttribute("style").contains("1")) {	
			System.out.println("It is Enabled");
		}
		else {
			System.out.println("It is Disabled");
		}
//		String style2 = driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e'])[2]")).getAttribute("style");
//		System.out.println(style2);

	}

}

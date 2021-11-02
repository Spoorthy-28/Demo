package my_selenium_project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\my_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	//	driver.get("https://www.google.com");
		driver.get("https://gmail.com");
		driver.findElement(By.cssSelector("input[aria-label='Email or phone']")).sendKeys("spooooo@gmail.com");
		driver.findElement(By.cssSelector("span.VfPpkd-vQzf8d")).click();
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello user");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("myemail@");
//		driver.findElement(By.cssSelector("#pass")).sendKeys("mypw");
	//	driver.findElement(By.linkText("Create a Page")).click();
	}
}
package my_selenium_project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\my_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//Get the count of links in the webpage:
		//System.out.println(driver.findElements(By.tagName("a")).size());
		//Get the count of links in specified area in the webpage:
	//	System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG'] //a")).size());
//		WebElement eledriver = driver.findElement(By.xpath("(//table[@class='gf-t'] //ul)[1]"));
//		System.out.println(eledriver.findElements(By.tagName("a")).size());
		//Opening links in seperate tabs and getting their title
		Actions a = new Actions(driver);
		for(int i=1;i<5;i++) {
			a.moveToElement(driver.findElements(By.xpath("((//table[@class='gf-t'] //ul)[1]) //a")).get(i)).keyDown(Keys.CONTROL).click().build().perform();
		}
		Set<String>set = driver.getWindowHandles();
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			driver.switchTo().window((String) i.next());
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}
	}

}

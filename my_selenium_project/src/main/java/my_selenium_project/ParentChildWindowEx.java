package my_selenium_project;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ParentChildWindowEx  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\my_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("decor").sendKeys(Keys.ENTER).build().perform();
		//Hovering on to the element in parent window;
		a.moveToElement(driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"))).build().perform();
		Set<String> set= driver.getWindowHandles();
		Iterator<String> i = set.iterator();
		String pid = i.next();
		System.out.println("parent id: "+pid);
		String cid = i.next();
		System.out.println("child id: "+cid);
		driver.switchTo().window(cid);
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"))).build().perform();
	}

}


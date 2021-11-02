package my_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenTextEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\my_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.findElement(By.id("yschsp")).sendKeys("spoor");
		Thread.sleep(1000);
	//	driver.findElement(By.id("yschsp")).sendKeys(Keys.ARROW_DOWN);
		//System.out.println(driver.findElement(By.id("yschsp")).getText());  //Unable to get the text because it is hidden. So use javascript Executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0;i<10;i++) {
			driver.findElement(By.id("yschsp")).sendKeys(Keys.ARROW_DOWN);
			String text = "return document.getElementById('yschsp').value;";
			String res = (String) js.executeScript(text);
			if(res.equalsIgnoreCase("spoorthy")) {
				System.out.println(res);
				break;
			}
		}
	}

}

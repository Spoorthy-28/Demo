package my_selenium_project;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderEx2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Month: ");
		String month = s.nextLine();
		System.out.println("Enter date: ");
		String date = s.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spoorthy\\eclipse-workspace\\my_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
	//	Thread.sleep(5000);
		driver.findElement(By.id("travel_date")).click();
		driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).click();;
		WebElement currmonth = driver.findElement(By.xpath("//span[@class='month active']"));
		if(month.equalsIgnoreCase(currmonth.getText())) {
			currmonth.click();
		}
		else {
			List<WebElement> remmonths = driver.findElements(By.className("month"));
			for(int i=0;i<remmonths.size();i++) {
				if((remmonths.get(i).getText()).equalsIgnoreCase(month)) {
					remmonths.get(i).click();
					break;
				}
			}
		}
		List<WebElement> list= driver.findElements(By.className("day"));
		for(int i=0;i<list.size();i++) {
			if((list.get(i).getText()).equals(date)) {
				list.get(i).click();
				break;
			}
		}
	}

}

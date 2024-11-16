package seleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("9309810235");
        driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
	}
    
	public static void switchToswitch(String winID) {
		 Set<String> windowIDS = driver.getWindowHandles();
		 for(String e:windowIDS) {
			 driver.switchTo().window(e);
			 if(!e.equals(winID)) {
				 break;
			 }
		 }
	}
}

package WindowsHandles;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String OHomeWin = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement linkdln = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		linkdln.click();
		Thread.sleep(1000);
		WebElement faceBook = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		faceBook.click();
		Thread.sleep(1000);
		WebElement twitTer = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twitTer.click();
		Thread.sleep(1000);
		WebElement youTube = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		youTube.click();
		
		switchToWindows("OrangeHRM | LinkedIn");
		System.out.println(driver.getCurrentUrl());
		
		
		
		
	}
	
	public static void switchToWindows(String winTitle) {
		Set<String> windowIDS = driver.getWindowHandles();
		for(String windowid:windowIDS) {
			driver.switchTo().window(windowid);
		    String actTitle = driver.getTitle();
			System.out.println(actTitle);
			if(actTitle.equals(winTitle)) {
				break;
			}
		}
	}

}

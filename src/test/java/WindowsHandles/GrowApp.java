package WindowsHandles;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowApp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://groww.in/");
		Thread.sleep(2000);
		String hWin = driver.getWindowHandle();
		WebElement LoginBtn = driver.findElement(By.xpath("//span[text()='Login/Register']"));
		LoginBtn.click();
		switchWindow(hWin);
		
		WebElement emailBox = driver.findElement(By.xpath("//input[@id=\"login_email1\"]"));
		emailBox.sendKeys("roshangiri@gmail.com");
		
		}
	
	
	public static void switchWindow(String Win) {
		   Set<String> winIDS = driver.getWindowHandles();
		   for(String e:winIDS) {
			    driver.switchTo().window(e);
			    if(!winIDS.equals(Win)) {
			    	break;
			    }
		   }
	}
	
	
	

}

package WindowsHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowwApp {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://groww.in/");
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
		String winID = driver.getWindowHandle();
		switchToWindows(winID);
		driver.findElement(By.xpath("//input[@id=\"login_email1\"]")).sendKeys("roshan");

	}

	public static void switchToWindows(String winID) {
		Set<String> windowIDS = driver.getWindowHandles();
		String popWin = null;
		for (String windowid : windowIDS) {
			driver.switchTo().window(windowid);
			if (!windowid.equals(winID)) {
				break;

			}
		}

	}
}

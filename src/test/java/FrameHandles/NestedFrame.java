package FrameHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.findElement(By.xpath("//a[contains(@href,'Single')]")).click();
		//driver.switchTo().frame("SingleFrame");
		//driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("roshan");
		
		
		driver.findElement(By.xpath("//a[contains(@href, 'Multiple')]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")))
		
		.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Test@123");
		
		
	}

}

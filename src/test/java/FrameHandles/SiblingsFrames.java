package FrameHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingsFrames {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		WebElement leftFrame = driver.switchTo().frame("frame-top").switchTo().frame("frame-left").findElement(By.tagName("body"));
		System.out.println(leftFrame.getText());
		
		WebElement middleFrame = driver.switchTo().parentFrame().switchTo().frame("frame-middle").findElement(By.tagName("body"));
		System.out.println(middleFrame.getText());
		
		WebElement rightFrame = driver.switchTo().parentFrame().switchTo().frame("frame-right").findElement(By.tagName("body"));
		System.out.println(rightFrame.getText());
		
		WebElement bottamFrame = driver.switchTo().defaultContent().switchTo().frame("frame-bottom").findElement(By.tagName("body"));
		System.out.println(bottamFrame.getText());
		
		
	}

}

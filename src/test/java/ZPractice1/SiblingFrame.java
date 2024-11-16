package ZPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SiblingFrame {
	
	WebDriver driver;
		
	@Test
	
	public void handlingFrame() throws InterruptedException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	Thread.sleep(2000);
	WebElement leftText = driver.switchTo().frame("frame-top").switchTo().frame("frame-left").findElement(By.tagName("body"));
	System.out.println(leftText.getText());
	
	WebElement MIDText = driver.switchTo().parentFrame().switchTo().frame("frame-middle").findElement(By.tagName("body"));
	System.out.println(MIDText.getText());

	WebElement righText = driver.switchTo().parentFrame().switchTo().frame("frame-right").findElement(By.tagName("body"));
	System.out.println(righText.getText());
	
	WebElement bottamFrame = driver.switchTo().defaultContent().switchTo().frame("frame-bottom").findElement(By.tagName("body"));
	System.out.println(bottamFrame.getText());
	
	
	
	
	
		

}}

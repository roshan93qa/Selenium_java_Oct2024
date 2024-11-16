package ZPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multipleFrame {
	@Test
	public void frameHandling() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
	    WebElement frameBtn = driver.findElement(By.xpath("//a[contains(text(),' in an Iframe')]"));
	    frameBtn.click();
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")))
	    .switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));
	    
	    WebElement textBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		textBox.sendKeys("Roshan");
		
		
}
}
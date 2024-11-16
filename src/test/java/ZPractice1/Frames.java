package ZPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {

	@Test
	public void frameHandling() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]")));
		WebElement inputBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	    inputBox.sendKeys("Roshan");
	}
}

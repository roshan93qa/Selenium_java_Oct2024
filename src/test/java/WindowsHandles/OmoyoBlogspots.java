package WindowsHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OmoyoBlogspots {
	static WebDriver driver;
	@Test
	public void windowHandles() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String Hwin = driver.getWindowHandle();
		WebElement textAreaBox = driver.findElement(By.xpath("//textarea[@id=\"ta1\"]"));
		textAreaBox.sendKeys("RoshanGiri");
		Thread.sleep(2000);
		WebElement popWindIDS = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		popWindIDS.click();
		
		switchWindow(Hwin);
		WebElement newWindowText  = driver.findElement(By.xpath("//h3[text()='New Window']"));
		System.out.println(newWindowText.getText());
		
	}
	
	public static void switchWindow(String win) {
		   Set<String> winIDS = driver.getWindowHandles();
		   for(String e:winIDS) {
			    if(!e.equals(win)) {
				   driver.switchTo().window(e);
				   break;
			   }
		   }
	}
	

}

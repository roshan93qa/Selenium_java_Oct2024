package WindowsHandles;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OragenHrm {
	static WebDriver driver;
	
	@Test
	public void windHandles() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		String orageHrm = driver.getWindowHandle();
		WebElement lindbtn = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		lindbtn.click();
		Thread.sleep(2000);
		WebElement facebtn = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		facebtn.click();
		WebElement twibtn = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twibtn.click();
		WebElement youbtn = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		youbtn.click();
		switchWind("OrangeHRM |Linkedin");
		}
	
	public static void switchWind(String winTitle) {
		Set<String> winIDS = driver.getWindowHandles();
		for(String e:winIDS) {
			driver.switchTo().window(e);
	        String actTitle = driver.getTitle();
	        System.out.println(actTitle);
			if(actTitle.equals(winTitle)) {
				break;
			}
			
		}
	}
	
	
}

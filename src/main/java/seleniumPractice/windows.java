package seleniumPractice;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.getWindowHandle();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//======================================================================================
		Thread.sleep(2000);
        WebElement linkBtn = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
        linkBtn.click();
        WebElement faceBtn = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
        faceBtn.click();
        //=====================================================================================
        		switchToWindow("OrangeHRM | LinkedIn");
		
		
	}
	public static void switchToWindow(String WinTitle) {
		    Set<String> windowIDs = driver.getWindowHandles();
		    for(String e:windowIDs) {
		    	driver.switchTo().window(e);
		        String actTitle = driver.getTitle();
		        System.out.println(actTitle);
		        if(actTitle.equals(WinTitle)) {
		        	break;
		        }
		    }
	}

}

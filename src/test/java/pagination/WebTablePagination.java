package pagination;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	static WebDriver driver;

	public static void main(String[] args) throws AWTException, InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
	    Robot robot=new Robot();
	    robot.mouseWheel(20);
	    
	    
	    while(true) {
	    	if(driver.findElements(By.xpath("//td[text()='Hong Kong']")).size()>0){
	    		selectCountry("Hong Kong");
	    		break;
	    	}else {
	    		//pagination logic
	    		WebElement Next = driver.findElement(By.xpath("//a[text()='Next']"));
	    		Next.click();
	    		Thread.sleep(2000);
	    	}
	    }
	    
	   }

	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']//preceding-sibling::td//input[@type='checkbox']")).click();
	}
	
	
	  

}

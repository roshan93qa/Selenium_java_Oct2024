package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardAction {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/draggable/");
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
	    WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	    Actions action =new Actions(driver);
	    action.clickAndHold(drag).moveByOffset(200, 100).build().perform();
		
	    
	    
	}

}

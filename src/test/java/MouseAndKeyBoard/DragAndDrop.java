package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
	driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
	Actions action=new Actions(driver);
	WebElement asloBox = driver.findElement(By.xpath("(//div[@id=\"box1\"])[1]"));
	WebElement norwayBox = driver.findElement(By.xpath("//div[@id=\"box101\"]"));
	action.dragAndDrop(asloBox, norwayBox).build().perform();
	
	}

}

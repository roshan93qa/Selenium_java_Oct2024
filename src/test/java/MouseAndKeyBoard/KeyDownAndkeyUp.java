package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownAndkeyUp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.get("https://omayo.blogspot.com/");
        Actions action=new Actions(driver);
        
        WebElement jLink = driver.findElement(By.xpath("//a[text()='jqueryui']"));
        //jlink open in new tab
     //   action.keyDown(Keys.CONTROL).moveToElement(jLink).click().keyUp(Keys.CONTROL).build().perform();
        
        //right click open on pop-up
        action.keyDown(Keys.CONTROL).moveToElement(jLink).contextClick(jLink).keyUp(Keys.CONTROL).build().perform();


}
}
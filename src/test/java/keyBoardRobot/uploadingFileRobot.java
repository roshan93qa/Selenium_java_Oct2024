package keyBoardRobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadingFileRobot {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/upload");
		Robot robot=new Robot();
		String path=System.getProperty("user.dir")+"\\screenshots/robot.png";
		StringSelection Stringselection=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Stringselection, null);
		robot.delay(2000);
		
		//============
		WebElement chooseFileWeb = driver.findElement(By.xpath("//input[@name=\"file\"]"));
		//=========================
		
		Actions action =new Actions(driver);
		action.moveToElement(chooseFileWeb).click().build().perform();
		
		
		
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//
		driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
		
		
		
		
		

	}

}

package keyBoardRobot;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://omayo.blogspot.com/");
		Robot robot=new Robot();
		robot.mouseWheel(15);//veryical 
		robot.delay(2000);
		robot.mouseWheel(-8);

	}

}

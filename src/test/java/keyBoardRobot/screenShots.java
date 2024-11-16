package keyBoardRobot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShots {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("HP");
		Robot robot=new Robot();
		Thread.sleep(3000);
		Rectangle rectangle=new Rectangle(25,50,1000,300);
		BufferedImage sImages = robot.createScreenCapture(rectangle);
		ImageIO.write(sImages, "PNG",new File("./screenshots/robot.png"));
		
		
	}

}

package Screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FileScreenshots {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		WebElement dropDown = driver.findElement(By.xpath("//select[@class=\"dropdown\"]"));
		String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		try {
		    File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    FileHandler.copy(source, new File("screenshots/images1"+timestamp +".png"));  // Relative path
		} catch (IOException e) {
		    System.out.println("Error while saving screenshot: " + e.getMessage());
		}
		

}
}
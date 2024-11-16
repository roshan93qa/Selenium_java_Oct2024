package WaitHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("123");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='My Account']")));
		email.click();
		
		
		
		

	}

}

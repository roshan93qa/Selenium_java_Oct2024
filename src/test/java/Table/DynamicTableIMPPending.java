package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableIMPPending {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/index.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("");
		
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" (//a[contains(text(), 'Sales')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" (//a[contains(text(), 'Orders')])[1]")).click();
		
		
		while (true) {
            // Check if "Hong Kong" is present
            if (driver.findElements(By.xpath("//td[text()='S p']")).size() > 0) {
                selectCountry("S p");
                break;
            } else {
                // Check if "Next" button is present
                List<WebElement> nextButton = driver.findElements(By.xpath("//a[text()='>']"));
                if (nextButton.size() > 0) {
                    nextButton.get(0).click();
                    Thread.sleep(2000);
                } else {
                    System.out.println("Reached the end of pagination without finding 'Hong Kong'");
                    break;
                }
            }
        }

       // driver.quit();
    }

    public static void selectCountry(String cusName) {
        WebElement checkbox = driver.findElement(By.xpath("//td[text()='"+cusName+"']//preceding-sibling::td/input[@type='checkbox']"));
        checkbox.click();
    }

		
		
	}



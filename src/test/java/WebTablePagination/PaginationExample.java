package WebTablePagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class PaginationExample {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		List<WebElement> pages = driver.findElements(By.xpath("//ul[@class=\"pagination\"]/li"));
		

		for (int i = 1; i <= pages.size(); i++) {
			Thread.sleep(2000);

			// Check if the item "Smartphone" exists on the current page
			if (driver.findElements(By.xpath("//td[text()='Wireless Mouse 20']")).size() > 0) {
				selectPhone("Wireless Mouse 20");
				break;
			} else {
				// Navigate to the next page by clicking on the page number
				WebElement page = driver.findElement(By.xpath("//a[text()='" + (i + 1) + "']"));
				page.click();
				Thread.sleep(2000);
			}
		}
	}

	// Method to select the checkbox for a given phone
	public static void selectPhone(String phone) {
		driver.findElement(By.xpath("(//td[text()='" + phone + "']//following::input[@type='checkbox'])[1]")).click();
	}
}

package pagination;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationOpenCart {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/index.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(" //a[text()='Customers']")).click();
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		robot.mouseWheel(8);
		// String s ="Showing 1 to 10 of 925 (93 Pages)";
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		// String total_pages = text.substring(text.indexOf("(")+1,
		// text.indexOf("pages")-1);
		// convert into integer==parse.integer
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("pages") - 1));

		// repeatating pages
		for (int p = 1; p <= 5; p++) {
			if (p > 1) {
				WebElement active_page = driver
						.findElement(By.xpath("//ul[@class=\"pagination\"]//*[text()='" + p + "']"));
				active_page.click();
			}
			//re=ading the data from the pages
			int noRows=driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr")).size();
			for(int r=1;r<=noRows;r++) {
				String Cusname = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+r+"]/td[2]")).getText();
			}
			

		}

	}

}

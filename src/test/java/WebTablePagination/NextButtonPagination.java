package WebTablePagination;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextButtonPagination {

	static WebDriver driver;
    public static void main(String[] args) throws AWTException, InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.mouseWheel(20);
		Thread.sleep(2000);
        while (true) {
        	Thread.sleep(2000);
			if (driver.findElements(By.xpath("//td[text()='Denmark']")).size() > 0) {
				selectCountry("Denmark");
				break;
			} else {
				// pagination logic
				WebElement Next = driver.findElement(By.xpath("//a[text()='Next']"));
				Next.click();
				Thread.sleep(2000);
			}}}

	public static void selectCountry(String countryName) {
		driver.findElement(
				By.xpath("//td[text()='" + countryName + "']//preceding-sibling::td//input[@type='checkbox']")).click();
	}}

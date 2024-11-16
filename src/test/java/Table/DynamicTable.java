package Table;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);
		Robot robot =new Robot();
		robot.mouseWheel(2);
		selectEmpName("Employee Name");
		
		
		}
	
public static void selectEmpName(String EmpName) {
WebElement UserBox
= driver.findElement(By.xpath("//div[text()='"+EmpName+"']//parent::div//preceding-sibling::div//span[@class=\"oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input\"]"));
UserBox.click();
}


	
	
	
	

}

package DropDownHandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("selenium");
		List<WebElement> getList = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
		System.out.println(getList.size());
		for(WebElement e:getList) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}

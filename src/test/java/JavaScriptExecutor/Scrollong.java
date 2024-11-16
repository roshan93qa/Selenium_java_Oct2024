package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollong {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement bikeText= driver.findElement(By.xpath("(//input[@value=\"Pen\"])[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].scrollIntoView()", bikeText);
		//jse.executeScript("window.scrollTo(0,200)", args);
		//jse.executeAsyncScript("window.srcollTo(0,document.body.scrollHeight)");
		jse.executeAsyncScript("window.scrollTo(0, document.body.scrollHeight);");
	}

}

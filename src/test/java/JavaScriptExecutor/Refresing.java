package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		//jse.executeScript("history.go(0)");
		jse.executeScript("location.reload()");

	}

}

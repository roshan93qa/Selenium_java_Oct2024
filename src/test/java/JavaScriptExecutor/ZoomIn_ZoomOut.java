package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZoomIn_ZoomOut {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//only for chrome --edge--safari
	//jse.executeScript("document.body.style.zoom='50.0%'");
		
		//firefox
		jse.executeScript("document.body.style.  transform = 'scale(0.5)'");

	}

}

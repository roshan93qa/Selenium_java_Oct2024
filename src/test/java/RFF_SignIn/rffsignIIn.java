package RFF_SignIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class rffsignIIn {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://rewardflightfinder.com/");

	}

}

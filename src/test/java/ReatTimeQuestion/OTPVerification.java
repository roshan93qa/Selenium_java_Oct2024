package ReatTimeQuestion;

import java.io.IOException;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class OTPVerification {
	
	static WebDriver driver;
	
	String apiKey = "NANYqtSL5fZpEobr3WgbcEW73VZeAXCA";
    String serverId = "l1v0bimh";
    String serverDomain = "l1v0bimh.mailosaur.net";
    
    public String getRandomEmail() {
		return "user" + System.currentTimeMillis()+"@"+serverDomain;
    	
    }
    

	@Test
	public void OTPverification() throws IOException, MailosaurException {
		String eamilId =getRandomEmail();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groww.in/");
		// Get the current window handle
		String currentWindowHandle = driver.getWindowHandle();
		// Call the generic method to switch to another window
		switchToWindow(currentWindowHandle);
	    driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
	    driver.findElement(By.xpath("//input[@id=\"login_email1\"]")).sendKeys("eamilId");
	    driver.findElement(By.xpath("//span[text()='Continue']")).click();
	   //==================================== 
	    MailosaurClient mailosaur = new MailosaurClient(apiKey);  
	    MessageSearchParams params = new MessageSearchParams();
	    params.withServer(serverId);
	    SearchCriteria criteria = new SearchCriteria();
	    criteria.withSentTo("blanket-military@" + serverDomain);
	    Message message = mailosaur.messages().get(params, criteria);
	    
	    String subject=message.subject();
	    System.out.println(subject);
	    System.out.println("get otp ------");
	    
	    
	    Pattern pattern=Pattern.compile(" .*([0-9]{6}).*");
	    Matcher matcher=pattern.matcher(message.text().body());
	    matcher.find();
	    
	    System.out.println(matcher.group(1));
	    String otp=matcher.group(1);
	    System.out.println(otp);
	    
	    driver.findElement(By.xpath("//input[@id=\"signup_otp1\"]")).sendKeys(otp);
	    
	    
	    
	    
	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

	

	public static void switchToWindow(String currentWindowHandle) {
		Set<String> windowsIDS = driver.getWindowHandles(); // Get all window handles
        for (String windowID : windowsIDS) {
        	driver.switchTo().window(windowID);
			if (!windowID.equals(currentWindowHandle)) { // Switch to the window that is not the current one
				//driver.switchTo().window(windowID);
				break; // Exit the loop after switching
			}
		}
	}

}

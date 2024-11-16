package ReatTimeQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class growAppOTP {
	
	String apiKey = "NANYqtSL5fZpEobr3WgbcEW73VZeAXCA";
    String serverId = "l1v0bimh";
    String serverDomain = "l1v0bimh.mailosaur.net";
    
    public String getRandomEmail() {
		return "user" + System.currentTimeMillis()+"@"+serverDomain;
    	
    }
    
    @Test
    public void testEmail() {
    	String eamilId =getRandomEmail();
    	WebDriver driver =new ChromeDriver();
    	driver.get("https://groww.in/");
    	driver.switchTo().frame(0);
    	driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
    	
    	
    }
    
	

}

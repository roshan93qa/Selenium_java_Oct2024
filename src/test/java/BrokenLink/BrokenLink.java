package BrokenLink;




import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> getallBrokenLink = driver.findElements(By.xpath("//a"));
		System.out.println("No of links are  ==> "+getallBrokenLink.size());
		for(WebElement e:getallBrokenLink) {
			String url = e.getAttribute("href");
			System.out.println(url);
			checkBrokenLink(url);
			
		}
	}
	
	public static void checkBrokenLink(String linkUrl) throws IOException {
		try {
			URL url=new URL(linkUrl);
			HttpURLConnection httpUrlConnection=(HttpURLConnection) url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();
			
			if(httpUrlConnection.getResponseCode()>=400) {
				System.out.println(url  +"--->"+httpUrlConnection.getResponseMessage()+" is a broken link");
			}else {
				System.out.println(url +"---->"+httpUrlConnection.getResponseMessage());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

package DropDownHandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapsDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//span[@class=\"multiselect-selected-text\"]")).click();
	    List<WebElement> getlist = driver.findElements(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]/li"));
	    //System.out.println(getlist.size());
//	    for(WebElement e:getlist) {
//	    	  String text = e.getText();
//	    	  System.out.println(text);
//	    }
	    
	    //======Select Multiple option
	    for(WebElement e:getlist) {
	    	 String text = e.getText();
	    	if(text.equals("Java") || text.equals("Python") ||text.equals("MySQL")){
	    	 e.click(); 
	    	}
	    }
	    
	    
	}

}

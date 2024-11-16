package DropDownHandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Skip1_3option {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
	//===========================indecBased======================================================
		Select select =new Select(driver.findElement(By.xpath("//select[@class=\"dropdown\"]")));
		//select.selectByIndex(3);
  //==============Print All and Count  option under Select ======================================
	List<WebElement> getAllOption = select.getOptions();
//		System.out.println(getAllOption.size());
//		for(WebElement e:getAllOption) {
//			String text = e.getText();
//			System.out.println(text);
//		}
//=================Select Option based on the index and print ====================================
		for(int i=0;i<getAllOption.size();i++) {
			if(i==0 ||i==2||i==3) {
				select.selectByIndex(i);
			}}
		 List<WebElement> selectOption = select.getAllSelectedOptions();
		 for(WebElement e:selectOption) {
			 String text1 = e.getText();
			 System.out.println(text1);
		 }
		
	
		
	}
}

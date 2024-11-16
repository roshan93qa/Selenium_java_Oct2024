package CalendarHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleCalendar {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		//seleteDate("29");
		
		selectfutureDate("January 2025", 10);
		
		

	}
   
	public static void seleteDate(int day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}

	public static void selectfutureDate(String expMonYear,int day ) {
		// Extract the year from expMonthYear
	    int year = Integer.parseInt(expMonYear.split(" ")[1]);

	    // Check if it's a leap year
	    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	    // Validate day for February based on leap year
	    if (expMonYear.contains("February")) {
	        if ((isLeapYear && day > 29) || (!isLeapYear && day > 28)) {
	            System.out.println("Invalid day for February: " + day);
	            return;
	        }
	    }

	    // General day validation
	    if (day > 31) {
	        System.out.println("Invalid day: " + day);
	        return;
	    }

	    if (day <= 0) {
	        System.out.println("Invalid day: " + day);
	        return;
	    }
	    
		
		String actMonYear = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText();
		System.out.println(actMonYear);//oct 10 2024
		while(!actMonYear.equals(expMonYear)) {
			//click on next icon 
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			//i have updated actual month years
			actMonYear = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText();
		}
		seleteDate(day);
	}
	
}

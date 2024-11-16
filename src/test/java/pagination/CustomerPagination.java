package pagination;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.InputEvent;

public class CustomerPagination {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException, AWTException {
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.opencart.com/admin/index.php");
            Thread.sleep(3000);

            // Login
            driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("");
            driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
            Thread.sleep(3000);

            // Navigate to Customers section
            driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath(" //a[text()='Customers']")).click();
            Thread.sleep(2000);

            // Scroll down to load pagination
            Robot robot = new Robot();
            robot.mouseWheel(8);

            // Retrieve total pages
            String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
            int total_pages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1).trim());

            // Loop through pages and retrieve customer names
            for (int p = 1; p <= total_pages; p++) {
                if (p > 1) {
                    WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//a[text()='" + p + "']"));
                    active_page.click();
                    Thread.sleep(2000);
                }

                // Retrieve and print customer names from the current page
                int noRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
                for (int r = 1; r <= noRows; r++) {
                    String Cusname = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[" + r + "]/td[2]")).getText();
                    System.out.println("Customer Name on page " + p + ": " + Cusname);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}


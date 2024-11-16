package pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTableIMPPending {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.opencart.com/admin/index.php");
            Thread.sleep(3000);

            // Login
            driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("");
            driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
            Thread.sleep(2000);

            // Navigate to Orders under Sales
            driver.findElement(By.xpath("(//a[contains(text(), 'Sales')])[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[contains(text(), 'Orders')])[1]")).click();
            Thread.sleep(2000);

            // Search for the customer name "S p"
            String customerName = "S p";
            while (true) {
                if (driver.findElements(By.xpath("//td[text()='" + customerName + "']")).size() > 0) {
                    selectCustomerByName(customerName);
                    System.out.println("Customer '" + customerName + "' found and selected.");
                    break;
                } else {
                    // Check if "Next" button is present
                    List<WebElement> nextButton = driver.findElements(By.xpath("//a[text()='>']"));
                    if (nextButton.size() > 0) {
                        nextButton.get(0).click();
                        Thread.sleep(2000);
                    } else {
                        System.out.println("Reached the end of pagination without finding '" + customerName + "'");
                        break;
                    }
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

    // Method to select a customer by name
    public static void selectCustomerByName(String cusName) {
        WebElement checkbox = driver.findElement(By.xpath("//td[text()='" + cusName + "']//preceding-sibling::td/input[@type='checkbox']"));
        checkbox.click();
    }
}

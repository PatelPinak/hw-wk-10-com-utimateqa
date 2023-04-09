package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Open the given URL in Chrome browser
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        // Get the title of the page
        System.out.println(driver.getTitle());
        // Get the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Get page source
        System.out.println("Page source: " + driver.getPageSource());
        // Find the email field element
        driver.findElement(By.name("user[email]")).sendKeys("Prime101@nomail.com");
        // Type the password in the element
        driver.findElement(By.name("user[password]")).sendKeys("NoPassword");
        // Close the browser
        driver.close();

    }
}

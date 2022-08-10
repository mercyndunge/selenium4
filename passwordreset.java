package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passwordreset {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Forgot your password?")).click();

        //check if "Forgot Your Password?" text exists in page
        String t = "Forgot your password?";
        // getPageSource() to get page source
        if ( driver.getPageSource().contains("Forgot Your Password?")){
            System.out.println("Text: " + t + " is present. ");
        } else {
            System.out.println("Text: " + t + " is not present. ");
        }

        driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin");
        driver.findElement(By.id("btnSearchValues")).click();

        //check if "Please contact HR admin in order to reset the password" is displayed after clicking reset
        String m = "Please contact HR admin in order to reset the password";
        // getPageSource() to get page source
        if ( driver.getPageSource().contains("Please contact HR admin in order to reset the password")){
            System.out.println("Text: " + m + " is present. ");
        } else {
            System.out.println("Text: " + m + " is not present. ");
        }





    }
}

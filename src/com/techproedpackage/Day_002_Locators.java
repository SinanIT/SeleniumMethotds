package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day_002_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/sinan/OneDrive/SeleniumDependencies/drivers/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:/Users/sinan/OneDrive/SeleniumDependencies/drivers/geckodriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("testtechproed@gmail.com");
        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("Test1234!");
        WebElement signIn = driver.findElement(By.name("commit"));
        signIn.click();
        String title = driver.getTitle();
        String expectedTitle= "Address Book";
        if (expectedTitle.equals(title)) {
            System.out.println("Title is matched==> : "+ title);
        } else {
            System.out.println("Title in not matched " + expectedTitle);
        }
        String header = driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Address Book')]")).getText();
        String expectedHeader = "Welcome to Address Book";
        if (expectedHeader.equals(header)) {
            System.out.println("Header is matched==> : "+ header);
        } else {
            System.out.println("Header is not matched " + expectedHeader);
        }
        WebElement userId = driver.findElement(By.className("navbar-text"));
        String userIdText = userId.getText();
        String expectedUserId = "testtechproed@gmail.com";
        if(userIdText.equals(expectedUserId)){
            System.out.println("User Id is matched==> : " + userIdText);
        }else{
            System.out.println("User Id is not matched==> : " + expectedUserId);
        }
        //driver.findElement(By.className("navbar-toggler-icon")).click();
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        for (WebElement e:elements) {
            System.out.println(elements);
        }
        System.out.println("Total number of page links are: " + elements.size());
        WebElement logout = driver.findElement(By.linkText("Sign out"));
        logout.click();
        driver.quit();

    }
}

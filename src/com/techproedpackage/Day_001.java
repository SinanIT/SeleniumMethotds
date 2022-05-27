package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day_001 {
    public static void main(String[] args) {
        System.out.println("hello");
        System.setProperty("webdriver.chrome.driver", "C:/Users/sinan/OneDrive/SeleniumDependencies/drivers/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:/Users/sinan/OneDrive/SeleniumDependencies/drivers/geckodriver.exe");

        WebDriver driver = new ChromeDriver();
       // WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.navigate().back();

        String title = driver.getTitle();
        String expectedTitle ="Google";
        if (title.equals(expectedTitle)){
            System.out.println("Expected title '" + expectedTitle + "' is matched with actual title: " + title);

        }else {
            System.out.println("Actual title is not matched with expected title");
            System.out.println("Actual title: " + title);
            System.out.println("Expected title: " + expectedTitle);
        }

        //driver.close();// current browser

        driver.quit();
    }
}

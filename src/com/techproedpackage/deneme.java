package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class deneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/sinan/OneDrive/SeleniumDependencies/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.randallreilly.com/");
        driver.manage().window().maximize();

        Actions actions =  new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("menu-item-41604"))).perform();

        //System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-item-41604\"]/ul")).getText());
        List<WebElement> dropList = driver.findElements(By.xpath("//*[@id=\"menu-item-41604\"]/ul/li"));
        System.out.println("Dropdown list size : "+ dropList.size());

        List<String> expectedUrls = new ArrayList<String>(Arrays.asList("https://www.randallreilly.com/talent-intelligence/",
                "https://www.randallreilly.com/talent-intelligence/stratas/",
                "https://www.randallreilly.com/talent-intelligence/recruiting-services/",
                "https://www.randallreilly.com/talent-intelligence/recruiting-campaigns/",
                "https://www.randallreilly.com/talent-intelligence/driver-media/"));

        List<String> actualURLS = new ArrayList<>();
        for(int i =0 ; i<dropList.size(); i++){
            dropList.get(i).click();
            actualURLS.add(driver.getCurrentUrl());
            driver.navigate().back();
        }

    }
}

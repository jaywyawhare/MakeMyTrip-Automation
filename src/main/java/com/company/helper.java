package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class helper {

    public static void originCity(String from, WebDriver driver) {
        WebElement fromElement = driver.findElement(By.xpath("//input[@id='fromCity']"));

        fromElement.click();
        wait.waitForTime(300);

        WebElement fromCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
        fromCity.sendKeys(from);
        wait.waitForTime(1500);

        WebElement firstFrom = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"));
        firstFrom.click();
        wait.waitForTime(1500);
    }   

    public static void destinationCity(String tocity, WebDriver driver) {
        WebElement toCity = driver.findElement(By.xpath("//input[@placeholder='To']"));
        toCity.sendKeys(tocity);
        wait.waitForTime(1500);

        WebElement firstTo = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"));
        firstTo.click();
        wait.waitForTime(1500);
    }

    public static void date(String date, WebDriver driver) {
        WebElement nextMonth = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));

        for (int i = 0; i < 3; i++) {
            nextMonth.click();
            wait.waitForTime(300);
        }

        WebElement dateElement = driver.findElement(By.xpath("//div[@aria-label='" + date + "']"));
        dateElement.click();
        wait.waitForTime(300);
    }

    public static void Class(String AC, WebDriver driver) {
        WebElement ACClass = driver.findElement(By.xpath("//li[@data-cy='" + AC + "']"));
        ACClass.click();
        wait.waitForTime(300);
    }

    public static void searchButton(WebDriver driver) {
        WebElement searchButton = driver.findElement(By.xpath("//a[@data-cy='submit']"));
        searchButton.click();
        wait.waitForTime(1500);
    }
}

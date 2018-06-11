package seleniumTesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import javafx.application.Application;


public class TestClass{

    public WebDriver driver = null;

    @Test
    public void test0() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("http://www.store.demoqa.com");
        System.out.println(driver.getTitle());
        System.out.println("Succefully opened the website ");

        Thread.sleep(5000);

        driver.quit();

        test1();

    }


    @Test
    public void test1() {
        driver = new ChromeDriver();
        String url = "http://store.demoqa.com/";
        driver.get(url);
        System.out.println("Page title Name: " + driver.getTitle());
        System.out.println("Page title lenght = " + driver.getTitle().length());
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(url)) {
            System.out.println("Test passes  The correct url is opened. ");
        } else {
            System.out.println("Test failed");
            System.out.println("Current url=" + currentUrl);
            System.out.println("Expected url=" + url);
        }
        driver.quit();
    }


}

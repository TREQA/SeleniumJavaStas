package seleniumTesting.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import  seleniumTesting.PageObjects.webElements;

public class DashBoard {

    public static WebElement we=null;
            public webElements pageObjects ;


    public static WebElement findSearchTab(WebDriver wd){
        we=wd.findElement(By.className("form-control quick-search-box js-quick-search tt-input"));
        return we;
    }

    public static void searchCoin(WebDriver wd, String name){
         //we=wd.findElement(By.xpath("//DIV[@id='navbar-collapse-1']//INPUT[@type='text']"));

        webElements.inputName(wd).sendKeys(name);
        webElements.searchButton(wd).click();

    }

    public static void CheckName(WebDriver wd, String name){
       Assert.assertEquals(webElements.icoName(wd).getText(),name);
    }

    public static void checkTime(WebDriver wd){

        webElements.day(wd).click();
        webElements.week(wd).click();
        webElements.month(wd).click();
        webElements.season(wd).click();
        webElements.year(wd).click();
        webElements.ytd(wd).click();
        webElements.all(wd).click();

    }
}

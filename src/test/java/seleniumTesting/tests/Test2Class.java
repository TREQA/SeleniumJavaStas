package seleniumTesting.tests;

import com.sun.org.apache.regexp.internal.RE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import seleniumTesting.PageObjects.RegisterPage;
import seleniumTesting.PageObjects.webElements;
import seleniumTesting.Users;

public class Test2Class {

    public WebDriver wd ;

    @Test
    public void test01() {
        wd = new ChromeDriver();
        String url = "http://awful-valentine.com/purchase-forms/slow-ajax/";
        wd.get(url);
      //  wd.manage().window().maximize();
       /* Dimension dm= new Dimension(1024,786);
        wd.manage().window().setSize(dm);*/

        String title = wd.findElement(By.xpath("//H1[@class='category-title'][text()='Slow Ajax']/self::H1")).getText();
        System.out.println(title);
        Assert.assertEquals(title,"Slow Ajax");

        wd.findElement(By.id("name")).sendKeys("Antananarivo");
        wd.findElement(By.id("cc")).sendKeys("13215341853");
        wd.findElement(By.id("month")).sendKeys("6");
        wd.findElement(By.id("year")).sendKeys("2018");
        wd.findElement(By.id("go")).click();

        wd.close();
        wd.quit();

    }

    @Test
    public void test02(){
        wd = new ChromeDriver();
        // webElements we = new webElements();
        wd.get("http://Newtours.Demoaut.Com/");
        RegisterPage.registerButton(wd).click();
        Users user = new Users();
        System.out.println("firstName "+user.firstName);
        System.out.println("lastName "+user.lastName);
        System.out.println("emailtName "+user.email);
        System.out.println("userName "+user.user);

        try{
            RegisterPage.firstNameInput(wd).sendKeys(user.firstName);
            RegisterPage.lastNameInput(wd).sendKeys(" "+user.lastName);
            RegisterPage.phoneInput(wd).sendKeys("0123456789");
            RegisterPage.emailInput(wd).sendKeys(" "+user.email);
            RegisterPage.addressInput(wd).sendKeys("strada primaverii");
            RegisterPage.address2Input(wd).sendKeys("bloc 5, scara 1, apt 58");
            RegisterPage.cityInput(wd).sendKeys("Cluj");
            RegisterPage.stateInput(wd).sendKeys("strada primaverii");
            RegisterPage.postalCodeInput(wd).sendKeys("121251");
            Select country = new Select(RegisterPage.countryDropDown(wd));
            country.selectByValue("3");
            RegisterPage.userNameInput(wd).sendKeys(""+user.email);
            RegisterPage.passwordInput(wd).sendKeys("password");
            RegisterPage.confirmPasswordInput(wd).sendKeys("password");
            RegisterPage.submitButton(wd).click();
        }catch (Exception e) {
           // System.out.println(e);
            System.err.println("Caught Exception: " + e.getMessage());
        }
        finally {
            wd.close();
            wd.quit();
        }
    }
}


package seleniumTesting.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.bind.Element;


public class webElements {
    public static WebElement we;

    public static WebElement inputName(WebDriver driver){
        we=driver.findElement(By.xpath("//DIV[@id='navbar-collapse-1']//INPUT[@type='text']"));
        return we;
    }

    public static WebElement searchButton(WebDriver driver){
        we=driver.findElement(By.xpath("(//INPUT[@type='text'])[2]/../../..//BUTTON[@class='btn btn-primary']"));
        return  we;
    }

    public static WebElement icoName(WebDriver driver){
        we=driver.findElement(By.xpath("//H1[@class='text-large']/self::H1"));
        return we;
    }

    public static WebElement buyInstantly(WebDriver driver){
        we=driver.findElement(By.xpath("//DIV[@class='btn btn-primary']/self::DIV"));
        return we;
    }

    public static WebElement day(WebDriver driver){
        we=driver.findElement(By.xpath("//*[@transform='translate(126,0)']"));
        return we;
    }
    public static WebElement week(WebDriver driver){
        we=driver.findElement(By.xpath("//*[@transform='translate(163,0)']"));
        return we;
    }
    public static WebElement month(WebDriver driver){
        we=driver.findElement(By.xpath("//*[@transform='translate(200,0)']"));
        return we;
    }
    public static WebElement season(WebDriver driver){
        we=driver.findElement(By.xpath("//*[@transform='translate(237,0)']"));
        return we;
    }
    public static WebElement year(WebDriver driver){
        we=driver.findElement(By.xpath("//*[@transform='translate(274,0)']"));
        return we;
    }
    public static WebElement ytd(WebDriver driver){
        we=driver.findElement(By.xpath("//*[@transform='translate(311,0)']"));
        return we;
    }
    public static WebElement all(WebDriver driver){
        we=driver.findElement(By.xpath("//*[@transform='translate(348,0)']"));
        return we;
    }
}

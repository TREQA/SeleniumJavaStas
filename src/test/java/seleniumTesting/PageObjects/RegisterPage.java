package seleniumTesting.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private static WebElement element =null;

    public static WebElement registerButton(WebDriver driver){
        element = driver.findElement(By.xpath("//A[text()='REGISTER']/self::A"));
        return element;
    }
    public static WebElement firstNameInput(WebDriver driver){
        element = driver.findElement(By.name("firstName"));
        return element;
    }
    public static WebElement lastNameInput(WebDriver driver){
        element = driver.findElement(By.name("lastName"));
        return element;
    }
    public static WebElement phoneInput(WebDriver driver){
        element = driver.findElement(By.name("phone"));
        return element;
    }
    public static WebElement emailInput(WebDriver driver){
        element = driver.findElement(By.name("userName"));
        return element;
    }
    public static WebElement addressInput(WebDriver driver){
        element = driver.findElement(By.name("address1"));
        return element;
    }
    public static WebElement address2Input(WebDriver driver){
        element = driver.findElement(By.name("address2"));
        return element;
    }
    public static WebElement cityInput(WebDriver driver){
        element = driver.findElement(By.name("city"));
        return element;
    }
    public static WebElement stateInput(WebDriver driver){
        element = driver.findElement(By.name("state"));
        return element;
    }
    public static WebElement postalCodeInput(WebDriver driver){
        element = driver.findElement(By.name("postalCode"));
        return element;
    }
    public static WebElement countryDropDown(WebDriver driver){
        element = driver.findElement(By.name("country"));
        return element;
    }
    public static WebElement userNameInput(WebDriver driver){
        element = driver.findElement(By.name("email"));
        return element;
    }
    public static WebElement passwordInput(WebDriver driver){
        element = driver.findElement(By.name("password"));
        return element;
    }
    public static WebElement confirmPasswordInput(WebDriver driver){
        element = driver.findElement(By.name("confirmPassword"));
        return element;
    }
    public static WebElement submitButton(WebDriver driver){
        element = driver.findElement(By.name("register"));
        return element;
    }

}

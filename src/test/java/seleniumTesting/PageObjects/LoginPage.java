package seleniumTesting.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;

public class LoginPage {

    private static WebElement element =null;

    public static WebElement LoginButton(WebDriver driver){
        element = driver.findElement(By.className("login"));
        return element;
    }

    protected void switchTabsUsingPartOfUrl(WebDriver driver,String platform) {
        String currentHandle = null;
        try {
            final Set<String> handles = driver.getWindowHandles();
            if (handles.size() > 1) {
                currentHandle = driver.getWindowHandle();
            }
            if (currentHandle != null) {
                for (final String handle : handles) {
                    driver.switchTo().window(handle);
                    if (driver.getCurrentUrl().contains(platform) && !currentHandle.equals(handle)) {
                        break;
                    }
                }
            } else {
                for (final String handle : handles) {
                    driver.switchTo().window(handle);
                    if (driver.getCurrentUrl().contains(platform)) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Switching tabs failed");
        }
    }

    public static WebElement emailAddressInput(WebDriver driver){
        element= driver.findElement(By.id("inputEmail"));
        return element;
    }

    public static WebElement passwordInput(WebDriver driver){
        element= driver.findElement(By.id("inputPassword"));
        return element;
    }
    public static WebElement loginButton(WebDriver driver){
        element= driver.findElement(By.id("login"));
        return element;
    }
    public static WebElement ForgotPasswordButton(WebDriver driver){
        element= driver.findElement(By.cssSelector("a[href=\"pwreset.php\"]"));
        return element;
    }



}

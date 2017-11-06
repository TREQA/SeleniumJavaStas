import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.store.demoqa.com");

        System.out.println("Succefully opened the website ");

        Thread.sleep(5);

        driver.quit();

    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.client5.http.impl.routing.SystemDefaultRoutePlanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Login {



    @Test
    public void login_test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        List<WebElement> dropDownList = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
        System.out.println(dropDownList.size());

        for (int i=0;i< dropDownList.size();i++){
            System.out.println(dropDownList.get(i).getText());
        }












        //driver.quit();


    }
}
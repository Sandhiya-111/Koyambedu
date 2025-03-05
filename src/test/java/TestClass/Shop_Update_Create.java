package TestClass;

import BaseClass.BaseClass;
import PageObjectsClass.Shop_Update;
import actionclass.actionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import java.awt.*;
import java.time.Duration;


@Listeners(Utilities.Listeners.class)
public class Shop_Update_Create extends BaseClass {
    static actionClass act = new actionClass();
   public  static void shopUpdate_Create() throws InterruptedException, AWTException {




        PageFactory.initElements(driver,Shop_Update.class);
         Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cssload-container")));

        // Find the element to click
        WebElement element = driver.findElement(By.xpath("//*[@id='menu']/li[1]/a"));
        element.click();
        js.executeScript("arguments[0].scrollIntoView(true);",Shop_Update.getTrader());
        act.click(Shop_Update.getTrader());
        act.click(Shop_Update.getShopUpdate());
        Thread.sleep(3000);
        act.click(Shop_Update.getCreate());
        act.click(Shop_Update.getSelectCategory());






    }



}

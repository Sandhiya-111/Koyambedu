package TestClass;

import BaseClass.BaseClass;
import PageObjectsClass.Website;
import actionclass.actionClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class Website_CMS extends BaseClass {
    actionClass act =new actionClass();


    @Test
    public void Website_CMS() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        PageFactory.initElements(driver, Website.class);
        Thread.sleep(3000);
        act.click(Website.getWebsite_CMS());
        Thread.sleep(2000);
        act.click(Website.getBanner());
        Thread.sleep(2000);

    }



}

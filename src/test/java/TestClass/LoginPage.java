package TestClass;

import BaseClass.BaseClass;
import PageObjectsClass.Website;
import PageObjectsClass.loginPageObject;
import actionclass.actionClass;
import configFileReader.configFileRead;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.time.Duration;

public class LoginPage extends BaseClass {
    actionClass act = new actionClass();
    boolean redirection=true;
    int Banner=0;


    public static void loginPage(WebDriver driver,  actionClass act) {
        loginPageObject loginPageObject = PageFactory.initElements(BaseClass.driver, loginPageObject.class);
      BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        act.sendKeys(loginPageObject.getEmail(), configFileRead.getUserName());
      BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        act.sendKeys(loginPageObject.getPassword(), configFileRead.getPassword());
        BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        act.click(loginPageObject.getSubmit());
       // act.click(loginPageObject.getSubmit());
     BaseClass.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        System.out.println("Hello URL Launched");
        System.out.println("Title of the Page " +driver.getTitle());
        if (driver.getTitle().equalsIgnoreCase("MMC-Koyambedu"))
        {
            System.out.println("Successful Login");
        }
        else
        {
            System.out.println("UnSuccess Login");
        }
    }

 //  @Test(priority = 2,groups = {"A"},dependsOnMethods = {"loginPage"})
    //@Test
    public void Website_CMS() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        PageFactory.initElements(driver, Website.class);
        Thread.sleep(3000);
        act.click(Website.getWebsite_CMS());
        Thread.sleep(2000);
        act.click(Website.getBanner());
        Thread.sleep(2000);

    }


//@Test(priority = 3, dependsOnMethods =  {"bannerBase"})
      public void bannerCreate() throws InterruptedException {
        act.click(Website.getCreate());
        Thread.sleep(2000);
        // input parameter

        act.sendKeys(Website.getCreateBanner(),"Banner"+Banner);
        act.sendKeys(Website.getUploadBanner(),"C:\\Users\\Intel\\Desktop\\Images of Different size for testing\\KCL");
        if(redirection=true) {
            act.click(Website.getRedirectionYes());
            redirection = false;


        }
    }





}

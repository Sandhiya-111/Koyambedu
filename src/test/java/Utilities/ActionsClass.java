package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class ActionsClass {
    static Select select;
    static Actions action;



    public static void explicitwaits(WebDriver driver,Long sec)
    {
        WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(sec));
    }

    public static void implicitwaits(WebDriver driver,Long sec)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

    }


    public static void sendkeyFunction( String text, WebElement element)

    {
        element.sendKeys(text);
    }




    public static void takeScreenshots(WebDriver driver,String file) throws IOException {
        TakesScreenshot screenshot=(TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File destination=new File(file);
        FileUtils.copyFile(source,destination);
    }





    public static String alertMessage(WebDriver driver)
    {
        Alert alert =driver.switchTo().alert();
        String alertMessage = alert.getText();
        return  alertMessage;
    }

    public static void selectByindexFunction(WebElement element,int options)
    {
     select = new Select(element);
        select.selectByIndex(options);
    }

    public  static void  selectByValueFunction(WebElement element,String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }

    public static void selectByVisibleTextFunction(WebElement element,String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }



    public static List<WebElement> listOfSelectOptions(WebElement element)
    {
        select =new Select(element);
        List<WebElement> listOfOptions = select.getOptions();
        for(int i=0;i<listOfOptions.size();i++)
        {
            System.out.println(listOfOptions.get(i).getText());
        }
        return listOfOptions;
    }


    public static void mousehoverFunction(WebDriver driver,WebElement element)
    {
        action = new Actions(driver);
        action.moveToElement(element).build().perform();
        element.click();
    }

    public static void mouseClick(WebElement element)
    {
        element.click();
    }

    public static void mouseDoubleClickFuntion(WebDriver driver,WebElement element)

    {

       action = new Actions(driver);
       action.doubleClick(element).build().perform();
    }


    public static void contextClickFunction(WebDriver driver,WebElement element)
    {
        action = new Actions(driver);
        action.contextClick(element).build().perform();

    }

    public static void dragAndDropFunctions(WebDriver driver, WebElement element1,WebElement element2)
    {
        action = new Actions(driver);
        action.dragAndDrop(element1,element2).build().perform();
    }

    public static void function(WebDriver driver,WebElement element)
    {
        action = new Actions(driver);
        action.clickAndHold(element);
    }
}


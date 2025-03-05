package TestClass;

import BaseClass.BaseClass;
import PageObjectsClass.CommodityCateogry;
import PageObjectsClass.loginPageObject;
import actionclass.actionClass;
import configFileReader.configFileRead;
import excelDataProvider.ExcelDataProvider_LoginPage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

@Listeners(Utilities.Listeners.class)
public class commodity extends BaseClass {
    actionClass act = new actionClass();
    FileInputStream fileInputStream;
    XSSFWorkbook workbook;
    static ExcelDataProvider_LoginPage excel = new ExcelDataProvider_LoginPage(driver);

    public static List<String> select_Category;



 /*   public void dataProviderMethod1() {
        ExcelDataProvider_LoginPage excelDataProvider = new ExcelDataProvider_LoginPage(driver);
        List<String> data = excelDataProvider.readFromExcel();

       Sheet sheet = workbook.getSheetAt(0); // Get the first sheet
       Iterator<Row> rowIterator = sheet.iterator();

       // Skip header row
       rowIterator.next();

       // Loop through each row and fill the form
       while (rowIterator.hasNext()) {
           Row row = rowIterator.next();
           Shop_Update.getSelectCategory().sendKeys(row.getCell(0).getStringCellValue());
           Shop_Update.getTrader().sendKeys();
           Shop_Update.getShopNo().sendKeys(row.getCell(0).getStringCellValue());

           driver.findElement(By.name("field_2")).sendKeys(row.getCell(1).getStringCellValue());
           driver.findElement(By.name("field_3")).sendKeys(row.getCell(2).getStringCellValue());
        }
    }*/

public static void se()
{
    select_Category= excel.readFromExcel();
    for (String category : select_Category) {
        System.out.println(category);
    }


}
    @Test(priority =1)
    public void loginPage() {
        loginPageObject loginPageObject = PageFactory.initElements(driver, loginPageObject.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        act.sendKeys(loginPageObject.getEmail(), configFileRead.getUserName());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        act.sendKeys(loginPageObject.getPassword(), configFileRead.getPassword());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        act.click(loginPageObject.getSubmit());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        System.out.println("Hello URL Launched");

    }
    @Test(priority = 2,groups = {"A"},dependsOnMethods = {"loginPage"})
    public void commodity() throws InterruptedException, AWTException {

/*
        test = reports.createTest("Login Page");
        test.log(Status.INFO,"URL Launching...");
*/
     /*
    --   ExcelDataProvider_LoginPage excelDataProvider = new ExcelDataProvider_LoginPage(driver);
    --   List<String> data = excelDataProvider.readFromExcel();
    */
        PageFactory.initElements(driver, CommodityCateogry.class);
Thread.sleep(2000);

        act.click(CommodityCateogry.getMainMaster());
       act.click(CommodityCateogry.getCommodity());

        try {
            fileInputStream = new FileInputStream(configFileRead.getCommodityFile());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheetAt(0); // Get the first sheet
        Iterator<Row> rowIterator = sheet.iterator();

        // Skip header row
        rowIterator.next();

        // Loop through each row and fill the form
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            //act.selectByVisibleText(Shop_Update.getSelectCategory(), String.valueOf(row.getCell(0)));
            act.click(CommodityCateogry.getCreateCommodity());
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)", "");
            //act.sendKeys(Shop_Update.getRegistrationCertificate(),String.valueOf(row.getCell(14)));
            act.sendKeys(CommodityCateogry.getCategoryInEnglish(),String.valueOf(row.getCell(0)));
            String value = String.valueOf(row.getCell(1));
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].value=arguments[1];",CommodityCateogry.getCategoryInTamil(),value);
           act.sendKeys(CommodityCateogry.getCategoryInTamil()," ");

            act.click(CommodityCateogry.getPriceUpdateYes());
            act.click(CommodityCateogry.getSubmitButton());
            driver.navigate().refresh();








        }




    }



}

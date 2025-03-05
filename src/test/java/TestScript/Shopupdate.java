package TestScript;


import BaseClass.BaseClass;
import TestClass.LoginPage;
import TestClass.Shop_Update_Create;
import Utilities.ExtractFromExcel_ShopUpdate;
import actionclass.actionClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import configFileReader.configFileRead;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.List;

@Listeners(Utilities.Listeners.class)
    public class Shopupdate extends BaseClass {
        actionClass act = new actionClass();
    private static ExtentReports extent;
    private ExtentTest test;

    static {
        // Create the ExtentReports instance before any tests run
        extent = new ExtentReports();
        // Optional: specify the location of the report file
        extent.setSystemInfo("OS", "Koyambedu");
        extent.setSystemInfo("Browser", "Koyambedu");
    }
        @Test(priority = 1)
        public void loginPageExecute() {
            LoginPage.loginPage(driver, act);
        }

        //@Test(priority = 2,  dependsOnMethods = {"loginPageExecute"})
        public void shopUpdateTest() throws IOException, InterruptedException, AWTException {
        Shop_Update_Create.shopUpdate_Create();
            test = extent.createTest("Shop Update Test");
            test.log(Status.INFO, "Shop Update Test Started");

            // Initialize the Shop Update page
            PageFactory.initElements(driver, PageObjectsClass.Shop_Update.class);

            // Read data from Excel
            List<String[]> shopData = ExtractFromExcel_ShopUpdate.readExcelData(configFileRead.getShopUpdateFile());

            // Fill the shop update form with the data
            ExtractFromExcel_ShopUpdate.fillShopUpdateForm(driver, act, shopData);

            test.log(Status.INFO, "Shop Update Test Completed Successfully");
        }

       // @Test(priority = 3, groups = {"PriceUpdate"}, dependsOnMethods = {"loginPage"})
        public void priceUpdateTest() {
            test = extent.createTest("Price Update Test");
            test.log(Status.INFO, "Price Update Test Started");


            test.log(Status.INFO, "Price Update Test Completed Successfully");
        }
}

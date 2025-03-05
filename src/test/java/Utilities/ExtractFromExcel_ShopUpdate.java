package Utilities;

import PageObjectsClass.Shop_Update;
import actionclass.actionClass;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExtractFromExcel_ShopUpdate {
    public static List<String[]> readExcelData(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);  // Assuming data is in the first sheet
        Iterator<Row> rowIterator = sheet.iterator();
        List<String[]> data = new ArrayList<>();

        rowIterator.next(); // Skip header row

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            String[] rowData = new String[row.getPhysicalNumberOfCells()];
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                rowData[i] = String.valueOf(row.getCell(i));
            }
            data.add(rowData);
        }

        workbook.close();
        return data;
    }
    public static void fillShopUpdateForm(WebDriver driver, actionClass act, List<String[]> data) {
        for (String[] row : data) {
            System.out.println(row[0]);
            act.selectByVisibleText(Shop_Update.getSelectCategory(), row[0]);
            act.selectByVisibleText(Shop_Update.getShopNo(), row[1]);
            act.selectByVisibleText(Shop_Update.getBusinessMode(), row[2]);
            act.selectByVisibleText(Shop_Update.getOwnerShipType(), row[3]);
            act.sendKeys(Shop_Update.getUploadLicenseCertificate(), row[4]);
            act.sendKeys(Shop_Update.getRegistrationNumber(), row[5]);
            act.sendKeys(Shop_Update.getRegDate(), row[6]);
            act.sendKeys(Shop_Update.getFileNo(), row[7]);
            act.sendKeys(Shop_Update.getAllotmentNo(), row[8]);
            act.sendKeys(Shop_Update.getLicenseHolderName(), row[9]);
            act.sendKeys(Shop_Update.getLicenseNum(), row[10]);
            act.sendKeys(Shop_Update.getLicenseHolderAddress(), row[11]);
            act.sendKeys(Shop_Update.getCity(), row[12]);
            act.sendKeys(Shop_Update.getPincode(), row[13]);

            // Handle scrolling and form filling
            act.scrollDown(driver);
            act.sendKeys(Shop_Update.getRegistrationCertificate(), row[14]);
            act.selectByVisibleText(Shop_Update.getPrimary(), row[15]);
            act.sendKeys(Shop_Update.getAlloteeName(), row[16]);
            act.sendKeys(Shop_Update.getGender(), row[17]);
            act.selectByVisibleText(Shop_Update.getRelationName(), row[18]);
            act.sendKeys(Shop_Update.getMobileNumber(), row[19]);
            act.sendKeys(Shop_Update.getEmailAddress(), row[20]);
            act.sendKeys(Shop_Update.getUploadPhoto(), row[21]);
            act.selectByVisibleText(Shop_Update.getidProof(), row[22]);
            act.sendKeys(Shop_Update.getIdProofDocument(), row[23]);
            act.selectByVisibleText(Shop_Update.getActiveStatus(), row[24]);
            if(row[25].equalsIgnoreCase("pending"))
            {
                act.click(Shop_Update.getLicenseRenewalPending());
                act.selectByVisibleText(Shop_Update.getPendingLicenseBlockYear(),row[26]);
                act.sendKeys(Shop_Update.getReceivedLicenseFee(),row[27]);
                act.sendKeys(Shop_Update.getReceivedLicenseFine(),row[28]);
                act.sendKeys(Shop_Update.getReceivedLicensePenalty(),row[29]);
            }
            else
            {
                act.click(Shop_Update.getLicenseRenewalRenewed());

            }
            if(row[30].equalsIgnoreCase("pending"))
            {
                act.click(Shop_Update.getLicenseRenewalPending());
            }
            else
            {
                act.click(Shop_Update.getLicenseRenewalRenewed());

            }

        }
}}
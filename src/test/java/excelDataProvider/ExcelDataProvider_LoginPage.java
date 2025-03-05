package excelDataProvider;

import configFileReader.configFileRead;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExcelDataProvider_LoginPage {
    WebDriver driver;

    public ExcelDataProvider_LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    String value;
    FileInputStream fileInputStream;
    XSSFWorkbook workbook;

    LinkedList<String> dataList;

    public ExcelDataProvider_LoginPage() {

    }

    public List<String> readFromExcel() {

    {
        List<String> data = new ArrayList<>();
        try {
            fileInputStream = new FileInputStream(configFileRead.getShopUpdateFile());


            workbook = new XSSFWorkbook(fileInputStream);


    XSSFSheet sheet = workbook.getSheetAt(Integer.parseInt(configFileRead.getSheetNo()));
    XSSFRow row1 = sheet.getRow(1);

    //To get number of rows
    int noOfRows = sheet.getLastRowNum();

    //To get number of columns
    int noOfColumns = sheet.getRow(1).getLastCellNum();
    /*    System.out.println("No Of Rows:" +noOfRows+"No  Of  Columns"+noOfColumns);
    dataList  = new LinkedList<String>();
        Object[][] data = new Object[noOfRows][noOfColumns];
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {

               // System.out.println(sheet.getRow(i).getCell(j).toString());
                dataList.add(String.valueOf(sheet.getRow(i).getCell(j)));
               // data[i - 1][j] =String.valueOf(sheet.getRow(i).getCell(j));
               // System.out.println("The added Data is  : "+ data[i-1][j]);
                System.out.println(dataList.element());


            }
            System.out.println("********************");

*/



            for (Row row : sheet) {
                String[] rowData = new String[noOfRows]; // Assume max 100 columns
                for (int col = 0; col < noOfColumns; col++) {  // Adjust as necessary for actual column count
                    Cell cell = row.getCell(col);
                    if (cell != null) {
                        rowData[col] = cell.toString();  // Convert cell to string
                    }
                }
                data.add(String.valueOf(rowData));  // Add each row of data to the list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
    }




}








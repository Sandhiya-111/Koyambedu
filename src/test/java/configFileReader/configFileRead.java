package configFileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configFileRead {

   static FileInputStream fileInputStream;
    static Properties properties;

    {
        try {
            fileInputStream = new FileInputStream("src/test/resources/configfile.properties");
             properties = new Properties();
            try {
                properties.load(fileInputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getURL()
    {
         String getUrl = properties.getProperty("url");

        return getUrl;
    }
    public  static String getBrowser()
    {
        String browser = properties.getProperty("browser");
        return browser;
    }
    public static  String getUserName()
    {
        String userName = properties.getProperty("username");
        return userName;
    }

    public static  String getPassword()
    {
        String password = properties.getProperty("password");
        return password;
    }

    public static  String getShopUpdateFile()
    {
        String shopUpdateFile = properties.getProperty("getShopUpdateFile");
        return shopUpdateFile;
    }
    public static  String getCommodityFile()
    {
        String shopUpdateFile = properties.getProperty("getCommodityFile");
        return shopUpdateFile;
    }

    public static  String getSheetNo()
    {
        String sheetNo = properties.getProperty("sheet_no");
        return sheetNo;
    }


}

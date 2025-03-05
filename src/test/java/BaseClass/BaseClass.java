package BaseClass;

import configFileReader.configFileRead;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseClass  extends configFileRead {
    public static WebDriver driver;

    @BeforeSuite
    public void start()  {
        String browser = configFileRead.getBrowser();
        System.out.println(browser);
        if (browser.equalsIgnoreCase("chrome")) {


            ChromeOptions options = new ChromeOptions();
            // Set the path to the Chrome binary from environment variable
            String chromeBinaryPath =System.getenv("CHROMEPATH");
            if (chromeBinaryPath != null) {
                options.setBinary(chromeBinaryPath);
            }
                driver = new ChromeDriver(options);
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--remote-debugging-port=9222");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");




            driver.get(configFileRead.getURL());

            driver.manage().window().maximize();



            System.out.println("URL opened");


        }
    }







   @AfterSuite
    public void tearDown()
    {
        driver.close();
    }
}
package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class sample1 {
   public WebDriver driver;


 /*   @DataProvider(name = "dataProviderMethod")
    public Object[][] dataProviderMethod()
    {

        Object[][] data={{"1",""},{"2",""}};

        return data;

    }
*/
    @BeforeClass
    public void start()
   {
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--start-maximized");
       driver = new ChromeDriver(options);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

   }
   @Test()
   public void begin()
   {
       driver.get("https://pg.montra.org/request.php");
       Long endtime = null;
       WebElement element=driver.findElement(By.xpath("//*[@id='payment']/form/div[2]/div[2]/button"));
       element.click();
       WebElement element1=driver.findElement(By.xpath("//*[@id='payment']/form/div/div/div[1]/div[2]/button"));
       element1.click();
       Long starttime=System.currentTimeMillis();
       WebElement element3= driver.findElement(By.xpath("//*[@id='payment']/section/div[3]/div[1]/h2"));
       if(element3.isDisplayed())
       {
            endtime = System.currentTimeMillis();
       }
       Long durationtime=endtime-starttime;
       System.out.println(starttime + " "+endtime+" " +durationtime);
        driver.close();
   }
}

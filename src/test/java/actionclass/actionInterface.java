package actionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public interface actionInterface {
     public  void sendKeys(WebElement element, String string);

     public void selectByIndex(WebElement element, int Index);
     public void click(WebElement element);
     public void doubleClick();
     public void contextClick();
     public void selectByVisibleText(WebElement element, String Text);
     public void selectByValue(WebElement element, String value);
     public void impliciWait(WebDriver driver, Duration duration);
     public void ExplicitWait(WebDriver driver, Duration duration);

     public  void clear(WebElement element);



}

package actionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class actionClass implements actionInterface {

        Select select;

    @Override
    public  void sendKeys(WebElement element, String string) {
        element.sendKeys(string);
    }

    @Override
    public void selectByIndex(WebElement element, int Index) {
        select = new Select(element);
        select.selectByIndex(Index);

    }

    @Override
    public void click(WebElement element) {
    element.click();
    }

    @Override
    public void doubleClick() {

    }

    @Override
    public void contextClick() {

    }

    @Override
    public void selectByVisibleText(WebElement element, String Text) {
        select = new Select(element);
        select.selectByVisibleText(Text);
    }

    @Override
    public void selectByValue(WebElement element, String value) {
        select = new Select(element);
        select.selectByValue(value);
    }

    @Override
    public void impliciWait(WebDriver driver, Duration duration) {

    }

    @Override
    public void ExplicitWait(WebDriver driver, Duration duration) {

    }
    @Override
    public void clear(WebElement element)
    {
        element.clear();
    }

    public void scrollDown(WebDriver driver) {
    }
}

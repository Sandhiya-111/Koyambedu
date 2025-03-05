package PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommodityCateogry {
    WebDriver driver;

    public CommodityCateogry(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//input[@formcontrolname='categoryInEnglish']")
    private static WebElement categoryInEnglish;

    @FindBy(xpath = "//input[@formcontrolname='categoryInTamil']")
    private static WebElement categoryInTamil;

    @FindBy(xpath = "//input[@name='priceUpdate' and @value='Yes']")
    private static WebElement priceUpdateYes;

    @FindBy(xpath = "//input[@name='priceUpdate' and @value='No']")
    private static WebElement priceUpdateNo;

    @FindBy(xpath = "//h5[.='Commodity Category Create ']/ancestor::div[@class='modal-content']//button[.='Submit']")
    private static WebElement createSubBTn;

    @FindBy(xpath = "//div[.='Main Master']")
    private static WebElement mainMaster;

    @FindBy(xpath = "//a[@href='/dashboard/category']")
    private static  WebElement commodity;

    @FindBy(xpath = "//button[.=' Create ']")
    private static WebElement createCommodity;


    public static WebElement getMainMaster() {
        return mainMaster;

    }

    public static WebElement getCommodity() {
        return commodity;

    }public static WebElement getCreateCommodity() {
        return createCommodity;

    }


    public static WebElement getCategoryInEnglish() {
        return categoryInEnglish;

    }
    public static WebElement getCategoryInTamil() {
        return categoryInTamil;

    }public static WebElement getPriceUpdateYes() {
        return priceUpdateYes;

    }public static WebElement getPriceUpdateNo() {
        return priceUpdateNo;

    }public static WebElement getSubmitButton() {
        return createSubBTn;

    }




}




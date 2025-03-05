package PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Website {
    WebDriver driver;
    public Website(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    @FindBy(xpath="//div[contains(text(),'Website')]")
    private static WebElement website_CMS;

    @FindBy(xpath="//div[contains(text(),'Bann')]")
    private static WebElement banner;

    @FindBy(xpath="//button[contains(text(),'Create')]")
    private static WebElement bannerCreate;

    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-invalid ng-touched'][1]")
    private  static  WebElement createBanner;

    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-invalid ng-touched'][2]")
    private  static  WebElement uploadBanner;


    @FindBy(xpath = "//input[@name='redirection' and  @value='Yes']")
    private  static  WebElement redirectionYes;

    @FindBy(xpath = "//input[@name='redirection' and  @value='No']")
    private  static  WebElement redirectionNo;

    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid ng-touched']")
    private  static  WebElement bannerLink;


    @FindBy(xpath = "//select[@class='form-select ng-pristine ng-invalid ng-touched'][2]")
    private static  WebElement ApplicableTo;


    @FindBy(xpath = "//select[@class='form-select ng-pristine ng-invalid ng-touched'][2]")
    private static  WebElement scheduleApplicableTo;


    @FindBy(xpath = "//button[contains(text(),'Save')][1]")
    private static  WebElement save;
















    public  static  WebElement getWebsite_CMS()
{
    return  website_CMS;
}

    public  static  WebElement getBanner()
    {
        return  banner;
    }

    public  static  WebElement getCreate()
    {
        return  bannerCreate;
    }

    public static WebElement getCreateBanner()
    {
        return createBanner;
    }

    public static WebElement getUploadBanner()
    {
        return uploadBanner;
    }

    public static  WebElement getRedirectionYes()
    {
        return  redirectionYes;
    }

    public  static  WebElement getRedirectionNo()
    {
        return  redirectionNo;
    }

   public static  WebElement getBannerLink()
   {
        return bannerLink;
   }


}

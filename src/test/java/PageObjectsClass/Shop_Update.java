package PageObjectsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop_Update {
    WebDriver driver;

    public Shop_Update(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    @FindBy(xpath="//*[@id=\"menu\"]/li[1]/a")
    private static WebElement Trader;

    @FindBy(xpath="//div[contains(text(),'Shop Update')]")
    private static WebElement ShopUpdateCreate;
    @FindBy(xpath="//button[contains(text(),'Create')]")
    private static WebElement create;
    @FindBy(xpath="//select[@formcontrolname='categoryId']")
    private static WebElement SelectCategory;

    @FindBy(xpath="//select[@formcontrolname='shopNo']")
    private static WebElement ShopNo;
    @FindBy(xpath="//select[@formcontrolname='ownerType']")
    private static WebElement ownerShipType;

    @FindBy(xpath="//select[@formcontrolname='businessMode']")
    private static WebElement businessMode;

    @FindBy(xpath = "//input[@formcontrolname='licenseDocument']")
    private static WebElement uploadLicenseCertificate;
    @FindBy(xpath="//input[@formcontrolname='firmName']")
    private static WebElement firmName;
    @FindBy(xpath="//input[@formcontrolname='firmDocument']")
    private static WebElement firmDocument;

    @FindBy(xpath="//input[@formcontrolname='regiNum']")
    private static WebElement registrationNumber;
    @FindBy(xpath = "//input[@formcontrolname='date']")
    private static WebElement registrationDate;

    @FindBy(xpath = "//input[@formcontrolname='fileNo']")
    private static WebElement fileNo;

    @FindBy(xpath = "//input[@formcontrolname='allotmentNum']")
    private static WebElement allotmentNo;
    @FindBy(xpath = "//input[@formcontrolname='licenseHolderName']")
    private static WebElement licenseHolderName;
    @FindBy(xpath = "//input[@formcontrolname='licenseNum']")
    private static WebElement licenseNum;
    @FindBy(xpath = "//input[@formcontrolname='licenseHolderAddress']")
    private static WebElement licenseHolderAddress;
    @FindBy(xpath = "//input[@formcontrolname='city']")
    private static WebElement city;
    @FindBy(xpath = "//input[@formcontrolname='pincode']")
    private static WebElement pincode;
    @FindBy(xpath = "//input[@formcontrolname='registrationCertificate']")
    private static WebElement registrationCertificate;
    @FindBy(xpath = "//select[@formcontrolname='primaryKey']")
    private static WebElement primaryKey;
    @FindBy(xpath = "//input[@formcontrolname='name']")
    private static WebElement alloteeName;
    @FindBy(xpath = "//select[@formcontrolname='gender']")
    private static WebElement gender;
    @FindBy(xpath = "//select[@formcontrolname='relationName']")
    private static WebElement relationName;
    @FindBy(xpath ="//input[@formcontrolname='mobileNumber']")
    private static WebElement mobileNumber;
    @FindBy(xpath ="//input[@formcontrolname='emailAddress']")
    private static WebElement emailAddress;
    @FindBy(xpath ="//input[@formcontrolname='profilePic']")
    private static WebElement profilePic;

    @FindBy(xpath ="//select[@formcontrolname='idProof']")
    private static WebElement idProof;
    @FindBy(xpath ="//input[@formcontrolname='idProofDocument']")
    private static WebElement idProofDocument;
    @FindBy(xpath ="//select[@formcontrolname='activeStatus']")
    private static WebElement activeStatus;
    @FindBy(xpath ="//select[@formcontrolname='licenseRenewalStatus']")
    private static WebElement  licenseRenewalStatus;
    @FindBy(xpath ="//input[@name='licenseRenewalStatus' and @value='1']")
    private static WebElement  LicenseRenewalPending;


    @FindBy(xpath ="//mat-select[@id=\"mat-select-4\"]")
    private static WebElement  pendingLicenseBlockYear;

    @FindBy(xpath ="//input[@id='mat-input-0']")
    private static WebElement  pendinglicenseFees;

    @FindBy(xpath ="//input[@id='mat-input-1']")
    private static WebElement  pendingFineAmount;

    @FindBy(xpath ="//input[@id='mat-input-2']")
    private static WebElement  pendingPenaltyFee;
    @FindBy(xpath ="//input[@name='licenseRenewalStatus' and @value='0']")
    private static WebElement  LicenseRenewalRenewed;
    @FindBy(xpath ="//input[@name='maintananceRenewalStatus' and @value='1']")
    private static WebElement  MaintainancePending;
    @FindBy(xpath ="//input[@name='maintananceRenewalStatus' and @value='0']")
    private static WebElement  MaintainanceRenewed;

    @FindBy(xpath ="//select[@formcontrolname=  courtStatus']")
    private static WebElement   courtStatus;
    @FindBy(xpath ="//button[@type='submit']")
    private static WebElement   submit;
    @FindBy(xpath ="//button[text()='Cancel']")
    private static WebElement   Cancel;


    @FindBy(xpath ="//input[@formcontrolname='date']")
    private static WebElement   RegDate;

    @FindBy(xpath ="//input[@id='mat-input-3']")
    private static WebElement   receivedLicenseFee;

    @FindBy(xpath ="//input[@id='mat-input-4']")
    private static WebElement   receivedLicenseFine;

    @FindBy(xpath ="//input[@id='mat-input-5']")
    private static WebElement   receivedLicensePenalty;


    @FindBy(xpath ="//input[@id='mat-input-9']")
    private static WebElement   main_fromDate;

    @FindBy(xpath ="//input[@formcontrolname='endDate']")
    private static WebElement   main_endDate;

    @FindBy(xpath ="//input[@formcontrolname='maintananceFee']")
    private static WebElement   pendingMaintenanceFee;

    @FindBy(xpath ="//input[@formcontrolname='receivedMaintenanceFee']")
    private static WebElement   receivedMaintenanceFee;

    @FindBy(xpath ="//input[@formcontrolname='receivedInterestAmount']")
    private static WebElement   receivedInterestAmount;

    @FindBy(xpath ="//input[@formcontrolname='profilePic']")
    private static WebElement   uploadPhoto;




    public static  WebElement getRegDate()
    {
        return RegDate;
    }

    public static  WebElement getPendingLicenseBlockYear()
    {
        return pendingLicenseBlockYear;
    }
    public static  WebElement getPendinglicenseFees()
    {
        return pendinglicenseFees;
    }
    public static  WebElement getPendingFineAmount()
    {
        return pendingFineAmount;
    }
    public static  WebElement getPendingPenaltyFee()
    {
        return pendingPenaltyFee;

    }
    public static  WebElement getReceivedLicenseFee()
    {
        return receivedLicenseFee;

    }
    public static  WebElement getReceivedLicenseFine()
    {
        return receivedLicenseFine;

    }

    public static  WebElement getBusinessMode()
    {
        return businessMode;
    }
    public static  WebElement getReceivedLicensePenalty()
    {
        return receivedLicensePenalty;

    }
    public static  WebElement getMain_fromDate()
    {
        return main_fromDate;

    }
    public static  WebElement getMain_endDate()
    {
        return main_endDate;

    }



   
    public static  WebElement getTrader()
   {
        return Trader;
   }

    public static  WebElement getShopUpdate()

    {
        return ShopUpdateCreate;
    }

    public static  WebElement getCreate()
    {
        return create;
    }


    public static  WebElement getSelectCategory()
    {
        return SelectCategory;
    }


    public static  WebElement getShopNo()
    {
        return ShopNo;
    }

    public static  WebElement getOwnerShipType()
    {
        return ownerShipType;
    }
    public static  WebElement getUploadPhoto()
    {
        return uploadPhoto;
    }
    public static  WebElement getUploadLicenseCertificate()
    {
        return uploadLicenseCertificate;
    }

    public static  WebElement getFirmName()
    {
        return firmName;
    }

    public static  WebElement getFirmDocument()
    {
        return firmDocument;
    }


    public static  WebElement getRegistrationNumber()
    {
        return registrationNumber;
    }


    public static  WebElement getRegistrationDate()
    {
        return registrationDate;
    }



    public static  WebElement getFileNo()
    {
        return fileNo;
    }



    public static  WebElement getAllotmentNo()
    {
        return allotmentNo;
    }




    public static  WebElement getLicenseHolderName()
    {
        return licenseHolderName;
    }


    public static  WebElement getLicenseNum()
    {
        return licenseNum;
    }



    public static  WebElement getLicenseHolderAddress()
    {
        return licenseHolderAddress;
    }



    public static  WebElement getCity()
    {
        return city;
    }



    public static  WebElement getPincode()
    {
        return pincode;
    }


    public static  WebElement getRegistrationCertificate()
    {
        return registrationCertificate;
    }



    public static  WebElement getPrimary()
    {
        return primaryKey;
    }



    public static  WebElement getAlloteeName()
    {
        return alloteeName;
    }


    public static  WebElement getGender()
    {
        return gender;
    }



    public static  WebElement getRelationName()
    {
        return relationName;
    }

    public static  WebElement getMobileNumber()
    {
        return mobileNumber;
    }

    public static  WebElement getEmailAddress()
    {
        return emailAddress;
    }

    public static  WebElement getProfilePic()
    {
        return profilePic;
    }


    public static  WebElement getidProof()
    {
        return idProof;
    }



    public static  WebElement getIdProofDocument()
    {
        return idProofDocument;
    }


    public static  WebElement getActiveStatus()
    {
        return activeStatus;
    }




    public static  WebElement getLicenseRenewalStatus()
    {
        return  licenseRenewalStatus;
    }



    public static  WebElement getLicenseRenewalPending()
    {
        return  LicenseRenewalPending;
    }


    public static  WebElement getLicenseRenewalRenewed()
    {
        return  LicenseRenewalRenewed;
    }


    public static  WebElement getMaintainancePending()
    {
        return  MaintainancePending;
    }


    public static  WebElement getMaintainanceRenewed()

    {
        return  MaintainanceRenewed;
    }

    public static  WebElement getCourtStatus()
    {
        return   courtStatus;
    }

    //button[@type='submit']



    public static  WebElement getSubmit()
    {
        return   submit;
    }

    public static  WebElement getCancel()
    {
        return   Cancel;
    }








}

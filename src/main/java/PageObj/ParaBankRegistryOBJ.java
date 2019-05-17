package PageObj;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class ParaBankRegistryOBJ extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'Signing up is easy!')]")
    private WebElement messageDisplayed;
    @FindBy(xpath = "//input[@id='customer.firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//input[@id='customer.lastName']")
    private WebElement lastName;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    private WebElement customerAddress;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    private WebElement customerCity;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    private WebElement customerState;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    private WebElement customerZipCode;
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    private WebElement customerPhoneNumber;
    @FindBy(xpath = "//input[@id='customer.ssn']")
    private WebElement customerSSN;
    @FindBy(xpath = "//input[@id='customer.username']")
    private WebElement customerUserName;
    @FindBy(xpath = "//input[@id='customer.password']")
    private WebElement customerUserPass;
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    private WebElement customerRepeatedPassword;
    @FindBy(xpath = "//input[@value='Register']")
    private WebElement registeringButtonFromRegistringPage;
    @FindBy(xpath = "//span[contains(text(),'First name is required')]")
    private WebElement invalidMessageFirstName;
    @FindBy(xpath = "//span[contains(text(),'Last name is required')]")
    private WebElement invalidMessageLastName;

    public ParaBankRegistryOBJ() {
        super();
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getInvalidMessageFirstName() {
        return invalidMessageFirstName;
    }

    public WebElement getInvalidMessageLastName() {
        return invalidMessageLastName;
    }

    public WebElement getRegisteringButtonFromRegistringPage() {
        return registeringButtonFromRegistringPage;
    }

    public WebElement getMessageDisplayed() {
        return messageDisplayed;
    }


    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getCustomerAddress() {
        return customerAddress;
    }

    public WebElement getCustomerCity() {
        return customerCity;
    }

    public WebElement getCustomerState() {
        return customerState;
    }

    public WebElement getCustomerZipCode() {
        return customerZipCode;
    }

    public WebElement getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public WebElement getCustomerSSN() {
        return customerSSN;
    }

    public WebElement getCustomerUserName() {
        return customerUserName;
    }

    public WebElement getCustomerUserPass() {
        return customerUserPass;
    }

    public WebElement getCustomerRepeatedPassword() {
        return customerRepeatedPassword;
    }


    public void addElementWithDataTable(String arg1) {
        DataTable arg=null;
        List<Map<String, String>> list = arg.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {
            firstName.sendKeys(list.get(i).get(arg1));
        }


    }

}

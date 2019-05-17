package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParaBankHomePageOBJ extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    private static WebElement registerButtonFromMainPage;

    public ParaBankHomePageOBJ() {
        super();
        PageFactory.initElements(getDriver(), this);
    }

    @Override
    public void click(By elementBy) {
        super.click(elementBy);
    }

    public static WebElement getRegisterButtonFromMainPage() {
        return registerButtonFromMainPage;
    }
}

package stepDefinitions;

import PageObj.ParaBankHomePageOBJ;
import PageObj.ParaBankRegistryOBJ;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

import static Driver.Driver.getDriver;
import static Driver.Driver.url;

public class ParaBankRegistringPageStepDefinitions {
    ParaBankHomePageOBJ registryPageOBJ = new ParaBankHomePageOBJ();
    ParaBankRegistryOBJ paraBankRegistryOBJ = new ParaBankRegistryOBJ();


    @Given("^Main page has loaded$")
    public void main_page_has_loaded() throws Throwable {
        getDriver().get(url);
        getDriver().manage().window().maximize();
        String url = getDriver().getCurrentUrl();
        System.out.println(url);

    }

    @And("^User will click on Register$")
    public void user_will_click_on_register() throws Throwable {
        ParaBankHomePageOBJ.getRegisterButtonFromMainPage().click();
    }

    @And("^User sees the registering form and \"([^\"]*)\" is displayed as well$")
    public void user_sees_the_registering_form_and_something_is_displayed_as_well(String strArg1) throws Throwable {

    }

    @Given("^User will add the values$")
    public void user_will_add_the_values(DataTable arg1) throws Throwable {

        Thread.sleep(2000);

        List<Map<String, String>> list = arg1.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {

           
            paraBankRegistryOBJ.getFirstName().sendKeys(list.get(i).get("First Name"));
            paraBankRegistryOBJ.getLastName().sendKeys(list.get(i).get("Last Name"));
            paraBankRegistryOBJ.getCustomerAddress().sendKeys(list.get(i).get("Address"));
            paraBankRegistryOBJ.getCustomerState().sendKeys(list.get(i).get("State"));
            paraBankRegistryOBJ.getCustomerCity().sendKeys(list.get(i).get("City"));
            paraBankRegistryOBJ.getCustomerZipCode().sendKeys(list.get(i).get("Zip Code"));
            paraBankRegistryOBJ.getCustomerPhoneNumber().sendKeys(list.get(i).get("Phone"));
            paraBankRegistryOBJ.getCustomerSSN().sendKeys(list.get(i).get("SSN"));
            paraBankRegistryOBJ.getCustomerUserName().sendKeys(list.get(i).get("User Name"));
            paraBankRegistryOBJ.getCustomerUserPass().sendKeys(list.get(i).get("Password"));
            paraBankRegistryOBJ.getCustomerRepeatedPassword().sendKeys(list.get(i).get("Confirm"));
        }

    }


    @Then("^The response should be displayed as invalid$")
    public void the_response_should_be_displayed_as_invalid() throws Throwable {
        //To implement
    }

    @Given("^User does not add anything$")
    public void user_does_not_add_anything() throws Throwable {
        System.out.println("Nothing Added");
    }

    @And("^clicks on submit$")
    public void clicks_on_submit() throws Throwable {

    }

    @Then("^Error should be displayed for the required fields$")
    public void error_should_be_displayed_for_the_required_fields() throws Throwable {

    }


    @Given("^We have null value$")
    public void we_have_null_value() throws Throwable {
        System.out.println("Using null as value");
    }

    @And("^User will input the value$")
    public void user_will_input_the_value(DataTable arg1) throws Throwable {

        List<Map<String, String>> list = arg1.asMaps(String.class, String.class);
        for (int i = 0; i < list.size(); i++) {


            paraBankRegistryOBJ.getFirstName().sendKeys(list.get(i).get("First Name"));
            paraBankRegistryOBJ.getLastName().sendKeys(list.get(i).get("Last Name"));
            paraBankRegistryOBJ.getCustomerAddress().sendKeys(list.get(i).get("Address"));
            paraBankRegistryOBJ.getCustomerState().sendKeys(list.get(i).get("State"));
            paraBankRegistryOBJ.getCustomerCity().sendKeys(list.get(i).get("City"));
            paraBankRegistryOBJ.getCustomerZipCode().sendKeys(list.get(i).get("Zip Code"));
            paraBankRegistryOBJ.getCustomerPhoneNumber().sendKeys(list.get(i).get("Phone"));
            paraBankRegistryOBJ.getCustomerSSN().sendKeys(list.get(i).get("SSN"));
            paraBankRegistryOBJ.getCustomerUserName().sendKeys(list.get(i).get("User Name"));
            paraBankRegistryOBJ.getCustomerUserPass().sendKeys(list.get(i).get("Password"));
            paraBankRegistryOBJ.getCustomerRepeatedPassword().sendKeys(list.get(i).get("Confirm"));
        }


    }

    @Then("^Account should not be created$")
    public void account_should_not_be_created() throws Throwable {

    }

}

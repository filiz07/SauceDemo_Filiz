package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Login_stepDefinition extends ReusableMethods {
    HomePages pages=new HomePages();
    @Given("user can go to url")
    public void user_can_go_to_url() {

        Driver.getDriver().get(ConfigReader.getProperty("Url"));

    }
    @Given("user fills in the username button with {string}")
    public void user_fills_in_the_username_button_with(String data) {
        pages.usernameButton.sendKeys(data);

    }
    @Then("user fills in the password button with right password")
    public void user_fills_in_the_password_button_with_right_password() {
        pages.passwordButton.sendKeys(ConfigReader.getProperty("password"));
    }
    @Then("user clicks login button")
    public void user_clicks_login_button() {
        pages.loginButton.click();
    }
    @Then("user displays product Text")
    public void user_displays_product_text() {
        Assert.assertTrue(pages.productcText.isDisplayed());
    }
    @Then("user clciks button")
    public void user_clciks_button()  {
        pages.clickbutton.click();
        waitFor(2);
    }
    @Then("user can logout")
    public void user_can_logout() {
        pages.LogoutButton.click();

    }
    @Then("user closes driver")
    public void user_closes_driver() {
        Driver.closeDriver();

    }
    @Given("user fills in the username button wrong data")
    public void user_fills_in_the_username_button_wrong_data() {

        pages.usernameButton.sendKeys(ConfigReader.getProperty("wrongData"));

    }
    @Then("user displays warning message")
    public void user_displays_warning_message() {
        Assert.assertTrue(pages.warningMessage.isDisplayed());

    }


}

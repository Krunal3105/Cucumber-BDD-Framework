package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {

    WebDriver driver;

    @Given("^User open browser and enter url$")
    public void user_open_browser_and_enter_url()  {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Then("^User click on Register option$")
    public void user_click_on_Register_option(){
        driver.findElement(By.className("ico-register")).click();
    }

    @When("^User is on Register page and Verify the register page Title$")
    public void user_is_on_Register_page_and_Verify_the_register_page_Title() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);
    }

    @Then("^User click on Male Radio Button from Gender$")
    public void user_click_on_Male_Radio_Button_from_Gender() {
        driver.findElement(By.id("gender-male")).click();
    }

    @Then("^User Enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_Enter_and(String Firstname, String Lastname) {
        driver.findElement(By.id("FirstName")).sendKeys(Firstname);
        driver.findElement(By.id("LastName")).sendKeys(Lastname);

    }

    @Then("^User Select Day,Month and Year From Date of birth$")
    public void user_Select_Day_Month_and_Year_From_Date_of_birth() {
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("17");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("January");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("2000");

    }


    @Then("^User enter \"([^\"]*)\" and Company name$")
    public void user_enter_and_Company_name(String Email) {
        driver.findElement(By.id("Email")).sendKeys(Email);
        driver.findElement(By.id("Company")).sendKeys("Unify");

    }

    @Then("^User deselect Newsletter radio button$")
    public void user_deselect_Newsletter_radio_button() {
        driver.findElement(By.name("Newsletter")).click();
    }

    @When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_and(String Password, String Confirmpassword) {
        driver.findElement( By.id("Password")).sendKeys(Password);
        driver.findElement( By.id("ConfirmPassword")).sendKeys(Confirmpassword);
    }

    @Then("^User click on Register button$")
    public void user_click_on_Register_button() {
        driver.findElement(By.id("register-button")).click();

    }

    @Then("^User on Homepage$")
    public void user_on_Homepage() {

    }
}

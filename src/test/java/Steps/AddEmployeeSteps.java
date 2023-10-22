package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {
    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        WebElement addEmployeeBttn = driver.findElement(By.id("menu_pim_addEmployee"));
        click(addEmployeeBttn);
    }
    @When("user enters firstName, middleName and lastName")
    public void user_enters_first_name_middle_name_and_last_name() {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement middleNameField = driver.findElement(By.id("middleName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));

        sendText(firstNameField, "Kenani");
        sendText(middleNameField,"Keisha");
        sendText(lastNameField, "Bruce");
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        WebElement saveBttn = driver.findElement(By.id("btnSave"));
        click(saveBttn);
    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added successfully");
    }
    @Then("user closes the browser")
    public void user_closes_the_browser() {
        closeBrowser();
    }

    @When("user enters {string} and {string} and {string}")
    public void user_enters_and_and(String firstName, String middleName, String lastName) {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement middleNameField = driver.findElement(By.id("middleName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));

        sendText(firstNameField, firstName);
        sendText(middleNameField,middleName);
        sendText(lastNameField, lastName);
    }

    @When("user enters {string} and {string} and enters {string}")
    public void user_enters_and_and_enters(String firstN, String middleN, String lastN) {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement middleNameField = driver.findElement(By.id("middleName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));

        sendText(firstNameField, firstN);
        sendText(middleNameField,middleN);
        sendText(lastNameField, lastN);
    }


}

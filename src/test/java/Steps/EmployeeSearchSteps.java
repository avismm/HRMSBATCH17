package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.time.Duration;

public class EmployeeSearchSteps extends CommonMethods {
   // public WebDriver driver;

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pimOption =driver.findElement(By.id("menu_pim_viewPimModule"));
        click(pimOption);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @When("user clicks on Employee List Option")
    public void user_clicks_on_employee_list_option() {
        WebElement empList =driver.findElement(By.id("menu_pim_viewEmployeeList"));
        click(empList);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @When("user enters employee id")
    public void user_enters_employee_id() {
        WebElement empIdInput =driver.findElement(By.id("empsearch_id"));
        sendText(empIdInput,"40053456");
       // empIdInput.sendKeys("40053456");
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        WebElement searchBtn =driver.findElement(By.id("searchBtn"));
       // searchBtn.click();
        click(searchBtn);
    }
    @Then("user should be able to see employee details")
    public void user_should_be_able_to_see_employee_details() {
        System.out.println("This test Passed");
    }

    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
        WebElement nameTxtField =driver.findElement(By.id("empsearch_employee_name_empName"));
        sendText(nameTxtField,"Ariana");
       // nameTxtField.sendKeys("Ariana");

    }

}

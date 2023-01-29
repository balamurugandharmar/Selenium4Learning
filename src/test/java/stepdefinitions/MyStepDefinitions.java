package stepdefinitions;

import io.cucumber.java.en.Given;
import pageobjects.CreateLead;

public class MyStepDefinitions {

    CreateLead createLead = new CreateLead();

    @Given("I run my first test step")
    public void i_run_my_first_test_step() {
        System.out.println("First step passed");
    }

    @Given("I run my second test step")
    public void iRunMySecondTestStep() {
        System.out.println("Second step passed");
    }

    @Given("I create a new Lead")
    public void iCreateANewLead() {
        createLead.createLead();
    }
}

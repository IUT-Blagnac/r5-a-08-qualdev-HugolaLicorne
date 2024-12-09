package hellocucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private String day;
    private String response;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
        day = "Sunday";
    }

    @Then("I should be told Nope")
    public void i_should_be_told_nope() {
        assertEquals("Nope", response);
    }

    @Given("today is Friday")
    public void today_is_friday() {
        day = "Friday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        if (day.equals("Friday")) {
            response = "TGIF";
        } else {
            response = "Nope";
        }
    }

    @Then("I should be told TGIF")
    public void i_should_be_told_tgif() {
        assertEquals("TGIF", response);
    }

    @Given("today is anything else!")
    public void today_is_anything_else() {
        day = "Anything else";
    }
}

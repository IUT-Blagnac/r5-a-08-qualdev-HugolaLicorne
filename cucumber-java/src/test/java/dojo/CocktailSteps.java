package dojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {

    private Order order;

    @Given("{string} who wants to buy a drink")

    public void romeo_who_wants_to_buy_a_drink(String owner) {
        order = new Order();
        order.declareOwner(owner);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_juliette(String target) {
        order.declareTarget(target);
    }

    @Then("there is {int} cocktail in the order")
    public void there_is_no_cocktail_in_the_order(int nb) {
        List<String> cocktails = order.getCocktails(nb);
        assertEquals(0, cocktails.size());
    }

    private static class Order {

        private List<String> cocktails;
        private String owner, target;

        public Order() {
            this.cocktails = List.of();
        }

        public void declareOwner(String owner) {
            this.owner = owner;
        }

        public void declareTarget(String target) {
            this.target = target;
        }

        public List<String> getCocktails(int nb) {
            return this.cocktails.subList(0, nb);
        }
    }
}

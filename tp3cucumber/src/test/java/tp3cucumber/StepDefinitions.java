package tp3cucumber;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private Tp3CucumberTests tp3CucumberTests;
    private String joueur;

    public StepDefinitions() {
        tp3CucumberTests = new Tp3CucumberTests();
    }

    @Given("an initially empty list of players")
    public void an_initially_empty_list_of_players() {
        tp3CucumberTests.reinitialiserListe();
        assertTrue(tp3CucumberTests.getJoueurs().isEmpty());
    }

    @Given("a player named {string} is ready to be added")
    public void a_player_named_is_ready_to_be_added(String name) {
        joueur = name;
    }

    @Given("a list containing the player {string}")
    public void a_list_containing_the_player(String name) {
        tp3CucumberTests.reinitialiserListe();
        tp3CucumberTests.ajouterJoueur(name);
        joueur = name;
        assertTrue(tp3CucumberTests.getJoueurs().contains(name));
    }

    @When("the random draw is positive")
    public void the_random_draw_is_positive() {
        tp3CucumberTests.setTirageSimule(1);
        tp3CucumberTests.tirageAleatoire(joueur);
    }

    @When("the random draw is negative")
    public void the_random_draw_is_negative() {
        tp3CucumberTests.setTirageSimule(-1);
        tp3CucumberTests.tirageAleatoire(joueur);
    }

    @When("the random draw is neutral")
    public void the_random_draw_is_neutral() {
        tp3CucumberTests.setTirageSimule(0);
        tp3CucumberTests.tirageAleatoire(joueur);
    }

    @Then("Etienne must be added to the list")
    public void etienne_must_be_added_to_the_list() {
        assertTrue(tp3CucumberTests.getJoueurs().contains("Etienne"));
    }

    @Then("the player {string} must be removed from the list")
    public void the_player_must_be_removed_from_the_list(String name) {
        assertFalse(tp3CucumberTests.getJoueurs().contains(name));
    }

    @Then("the list must contain only the player {string}")
    public void the_list_must_contain_only_the_player(String name) {
        List<String> joueurs = tp3CucumberTests.getJoueurs();
        assertEquals(1, joueurs.size());
        assertTrue(joueurs.contains(name));
    }

    @Then("list size must be {int}")
    public void list_size_must_be(Integer expectedSize) {
        assertEquals(expectedSize, tp3CucumberTests.getTailleListe());
    }
}

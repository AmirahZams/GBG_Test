package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.SurveyChoice;
import starter.helpers.NavigateTo;
import starter.helpers.SurveyResultPage;

public class SurveyResultDefinition {

    @Given("{actor} is looking at his TODO list")
    public void actor_is_looking_at_his_todo_list(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSurveyResultPage());
    }
    @When("{actor} adds {string} to the list")
    public void he_adds_to_the_list(Actor actor, String itemName) {
       actor.attemptsTo(SurveyChoice.withName(itemName));
    }
    @Then("{actor} sees {string} as an item in the TODO list")
    public void he_sees_as_an_item_in_the_todo_list(Actor actor, String expectedItemName) {
        actor.attemptsTo(Ensure.that(SurveyResultPage.ITEMS_LIST).hasText(expectedItemName));
    }
}

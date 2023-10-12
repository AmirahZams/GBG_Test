package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.RadioButton;
import starter.helpers.NavigateTo;
import starter.helpers.SurveyResultPage;

public class SurveyResultDefinition {

    @Given("{actor} is in the survey page")
    public void actor_is_in_the_survey_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSurveyResultPage());
    }
    @When("{actor} select Good option")
    public void he_select_good_option(Actor actor) {
       actor.attemptsTo(Click.on(RadioButton.withLabel("Good")));
    }
    @And("{actor} click on Next button")
    public void he_click_next_button(Actor actor) {
       actor.attemptsTo(Click.on(Button.withText("Next")));
    }
    @Then("{actor} will sees {string} text")
    public void he_will_sees_text(Actor actor) {
        actor.attemptsTo(Ensure.that(SurveyResultPage.GoodAssert).hasText("Have a nice day."));
    }
}

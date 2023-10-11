package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    /**
     * @return
     */
    public static Performable theSurveyResultPage() {
        return Task.where("{0} opens the Survey Result Page",
            Open.browserOn().the(SurveyResultPage.class));
    }
}

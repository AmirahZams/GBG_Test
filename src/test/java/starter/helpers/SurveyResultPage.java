package starter.helpers;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.surveymonkey.com/r/9MVSPYS")
public class SurveyResultPage extends PageObject {
    public static Target GoodAssert = Target.the(" item list").locatedBy("//div[contains(text(),'Have a nice day.')]");
}

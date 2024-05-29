package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.delay.delay;
import userinterface.HomePageInterface;
import userinterface.ValidateDataCenterInterface;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateDataCenterTask implements Task {

    private String link;

    public ValidateDataCenterTask(String link){
        this.link = link;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(HomePageInterface.BUSCADOR, isVisible()),
                Enter.theValue(link).into(HomePageInterface.BUSCADOR),
                Click.on(ValidateDataCenterInterface.SELECT),
                delay.ofMilliseconds(2000)
        );

    }

    public static ValidateDataCenterTask in (String link) {
        return new ValidateDataCenterTask(link);
    }

}

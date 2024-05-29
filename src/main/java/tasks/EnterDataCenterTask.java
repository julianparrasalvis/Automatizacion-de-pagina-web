package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.delay.delay;
import userinterface.HomePageInterface;
import userinterface.ValidateDataCenterInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterDataCenterTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ValidateDataCenterInterface.SELECT_PAGE, isVisible()),
                Click.on(ValidateDataCenterInterface.SELECT_PAGE),
                delay.ofMilliseconds(1000)
        );
    }

    public static EnterDataCenterTask on(){
        return instrumented(EnterDataCenterTask.class);
    }
}



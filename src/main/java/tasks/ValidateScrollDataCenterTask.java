package tasks;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import tasks.delay.delay;
import userinterface.ValidateDataCenterInterface;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidateScrollDataCenterTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ValidateDataCenterInterface.SCROLL),
                delay.ofMilliseconds(5000)
        );
    }
    public static ValidateScrollDataCenterTask on(){
        return instrumented(ValidateScrollDataCenterTask.class);
    }
}

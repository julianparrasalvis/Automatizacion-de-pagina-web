package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import tasks.delay.delay;
import userinterface.HomePageInterface;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThePage implements Task {
    @Override
    @Step("Open the page datacenter")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new HomePageInterface()),
                delay.ofMilliseconds(1000)
        );
    }

    public static OpenThePage on(){
        return instrumented(OpenThePage.class);
    }

}

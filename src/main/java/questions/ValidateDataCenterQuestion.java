package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static userinterface.ValidateDataCenterInterface.LOCATION;

public class ValidateDataCenterQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LOCATION.resolveFor(actor).isVisible();
    }

    public static ValidateDataCenterQuestion ubicacion() {
        return new ValidateDataCenterQuestion();
    }
}

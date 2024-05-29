package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.google.com/webhp?hl=es&sa=X&ved=0ahUKEwjG7JycyK6GAxXwmLAFHaemB1kQPAgJ")
public class HomePageInterface extends PageObject {

    public static Target BUSCADOR = Target.the("buscar datacenter colombia").
            locatedBy("//textarea[@id='APjFqb']");

}

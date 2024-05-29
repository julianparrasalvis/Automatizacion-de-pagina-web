package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateDataCenterInterface {

    public static Target BUSCADOR = Target.the("buscar datacenter colombia").
            locatedBy("//textarea[@id='APjFqb']");


    public static Target SELECT = Target.the("seleccionar datacenter colombia").
            locatedBy("//span[contains(text(), 'Datacenter Colombia Sas')]");


    public static Target SELECT_PAGE = Target.the("seleccionar pagina oficial de datacenter colombia").
            locatedBy("//h3[contains(text(), 'Datacenter Colombia')]");

    public static Target SCROLL = Target.the("Scroll hasta titulo Contacto")
            .locatedBy("//strong[contains(text(), 'Contacto')]");

    public static Target LOCATION = Target.the("Validar ubicacion")
            .locatedBy("//p[contains(text(), 'Datacenter Colombia S.A.S')]");
}
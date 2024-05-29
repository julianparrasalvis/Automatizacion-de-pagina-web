package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ValidateDataCenterQuestion;
import tasks.EnterDataCenterTask;
import tasks.OpenThePage;
import tasks.ValidateDataCenterTask;
import tasks.ValidateScrollDataCenterTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class ValidateDataCenterDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;
    private Actor parra = Actor.named("parra");

    @Before
    public void setUp() {
        parra.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^El usuario abre el navegador google chrome$")
    public void elUsuarioAbreElNavegadorGoogleChrome() {
        parra.wasAbleTo(
                OpenThePage.on()
        );
    }

    @When("^El usuario busca la empresa datacenter colombia en google chrome \"([^\"]*)\"$")
    public void elUsuarioBuscaLaEmpresaDatacenterColombiaEnGoogleChrome(String link) {
        parra.wasAbleTo(
                ValidateDataCenterTask.in(link)
        );
    }

    @When("^El usuario selecciona la pagina de datacenter colombia$")
    public void elUsuarioSeleccionaLaPaginaDeDatacenterColombia() {
        parra.wasAbleTo(
                EnterDataCenterTask.on()
        );
    }

    @When("^El usuario busca la ubicacion de la empresa en la pagina web$")
    public void elUsuarioBuscaLaUbicacionDeLaEmpresaEnLaPaginaWeb() {
        parra.wasAbleTo(
                ValidateScrollDataCenterTask.on()
        );
    }

    @Then("^El usuario deberia ver ubicacion encontrada$")
    public void elUsuarioDeberiaVerUbicacionEncontrada() {
        parra.should(
                seeThat("",
                        ValidateDataCenterQuestion.ubicacion(),
                        is(true))
        );
    }
}



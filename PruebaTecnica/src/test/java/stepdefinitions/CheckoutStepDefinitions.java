package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarTexto;
import tasks.ProcesoCheckout;
import utils.Constants;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static userinterfaces.CartPageUi.VALIDAR_PRODUCTO;
import static userinterfaces.CheckoutPageUi.COMPRA_FINALIZADA;

public class CheckoutStepDefinitions {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("el usuario se encuentra en la pagina del carrito")
    public void elUsuarioSeEncuentraEnLaPaginaDelCarrito() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidarTexto.texto(VALIDAR_PRODUCTO), equalTo("Remove"))
        );
    }
    @When("realiza click en checkout y completa la informacion")
    public void realizaClickEnCheckoutYCompletaLaInformacion() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                ProcesoCheckout.procesoCheckout()
        );

    }
    @Then("validar que se haya completado la compra")
    public void validarQueSeHayaCompletadoLaCompra() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidarTexto.texto(COMPRA_FINALIZADA), equalTo(Constants.getData("Compra Finalizada")))
        );
    }
}

package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarTexto;
import tasks.AgregarProducto;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static userinterfaces.CartPageUi.VALIDAR_PRODUCTO;
import static userinterfaces.ProductPageUi.TITULO_PRODUCTS;

public class CarritoStepDefinitions {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario se encuentra en la pagina de productos")
    public void elUsuarioSeEncuentraEnLaPaginaDeProductos() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidarTexto.texto(TITULO_PRODUCTS), equalTo("Products")));

    }
    @When("selecciona el producto deseado")
    public void seleccionaElProductoDeseado() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProducto.agregarProducto()
        );

    }
    @Then("valida que el producto se haya agregado al carrito")
    public void validaQueElProductoSeHayaAgregadoAlCarrito() {

        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidarTexto.texto(VALIDAR_PRODUCTO), equalTo("Remove"))
        );
    }
}

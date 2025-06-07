package stepdefinitions;

import exceptions.ResultadoInesperado;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.ValidarTexto;
import tasks.IngresoCredenciales;
import utils.Constants;

import static userinterfaces.LoginPageUi.MENSAJE_ERROR;
import static userinterfaces.ProductPageUi.TITULO_PRODUCTS;

public class LoginStepDefinitions {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario esta en la pagina de login {string}")
    public void elUsuarioEstaEnLaPaginaDeLogin(String url) {
        OnStage.theActorCalled("Wilson").wasAbleTo(Open.url(Constants.getData(url)));

    }

    //When escenario credenciales validas
    @When("ingresa credenciales validas")
    public void ingresaCredencialesValidas() {

        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresoCredenciales.ingresoCredenciales(
                        Constants.getData("Usuario correcto"),
                        Constants.getData("Contraseña correcta")));

    }

    //When escenario credenciales invalidas
    @When("ingresa credenciales invalidas")
    public void ingresaCredencialesInvalidas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresoCredenciales.ingresoCredenciales(
                        Constants.getData("Usuario incorrecto"),
                        Constants.getData("Contraseña incorrecta")));

    }

    //Then validacion login correcto
    @Then("deberia ver la pagina principal {string}")
    public void deberiaVerLaPaginaPrincipal(String products) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTexto.texto(TITULO_PRODUCTS),
                Matchers.equalTo(products)).orComplainWith(ResultadoInesperado.class,
                "Credenciales Incorrectas"));

    }

    @Then("deberia ver un mensaje de error {string}")
    public void deberiaVerUnMensajeDeError(String mensajeError) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTexto.texto(MENSAJE_ERROR),
                Matchers.equalTo(Constants.getData(mensajeError))).orComplainWith(ResultadoInesperado.class,
                "Mensaje de error diferente al esperado"));

    }

}

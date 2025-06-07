package tasks;

import interactions.ImprimirPrecios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import utils.Constants;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.CartPageUi.BTN_CHECKOUT;
import static userinterfaces.CheckoutPageUi.*;


public class ProcesoCheckout implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CHECKOUT),
                WaitUntil.the(NOMBRE, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(Constants.getData("Primer_nombre")).into(NOMBRE),
                Enter.theValue(Constants.getData("Primer_apellido")).into(APELLIDO),
                Enter.theValue(Constants.getData("Codigo_postal")).into(CODIGO_POSTAL),
                Click.on(BTN_CONTINUAR),
                WaitUntil.the(BTN_FINALIZAR, isVisible()).forNoMoreThan(30).seconds(),
                ImprimirPrecios.imprimirPrecios(),
                Click.on(BTN_FINALIZAR),
                WaitUntil.the(COMPRA_FINALIZADA,isVisible()).forNoMoreThan(30).seconds()
        );
    }

    public static ProcesoCheckout procesoCheckout(){
        return Tasks.instrumented(ProcesoCheckout.class);
    }
}

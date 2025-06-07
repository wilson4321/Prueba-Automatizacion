package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.ProductPageUi.*;

public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(SELECT_PRODUCTO, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(SELECT_PRODUCTO),
                Click.on(SELECT_CARRITO)
        );
    }

    public static AgregarProducto agregarProducto(){
        return Tasks.instrumented(AgregarProducto.class);
    }
}

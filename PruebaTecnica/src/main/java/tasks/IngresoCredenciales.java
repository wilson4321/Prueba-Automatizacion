package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.LoginPageUi.*;

public class IngresoCredenciales implements Task {

    private String user;
    private String password;

    public IngresoCredenciales(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CAMPO_USUARIO, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(user).into(CAMPO_USUARIO),
                Enter.theValue(password).into(CAMPO_PASSWORD),
                Click.on(BOTON_LOGIN)
        );
    }

    public static IngresoCredenciales ingresoCredenciales(String user, String password){
        return Tasks.instrumented(IngresoCredenciales.class,user,password);
    }
}

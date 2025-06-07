package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidarTexto implements Question<String> {

    Target txtUser;

    public ValidarTexto(Target textUser) {
        this.txtUser = textUser;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.wasAbleTo(
                WaitUntil.the(txtUser, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds());
        return Text.of(txtUser).answeredBy(actor);
    }

    public static ValidarTexto texto(Target txtUser) {
        return new ValidarTexto(txtUser);
    }

}
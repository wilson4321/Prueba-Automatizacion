package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;
import static userinterfaces.CheckoutPageUi.*;

public class ImprimirPrecios implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String itemTotal = actor.asksFor(Text.of(ITEM_TOTAL));
        String tax = actor.asksFor(Text.of(TAX));
        String total = actor.asksFor(Text.of(TOTAL));

        System.out.println("---- Detalles del pago ----");
        System.out.println(itemTotal);
        System.out.println(tax);
        System.out.println(total);
    }

    public static ImprimirPrecios imprimirPrecios() {
        return new ImprimirPrecios();
    }
}

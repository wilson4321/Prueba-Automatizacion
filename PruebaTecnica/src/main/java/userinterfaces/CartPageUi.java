package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPageUi {
    public static final Target VALIDAR_PRODUCTO = Target.the("Validar que el producto se ha añadido")
            .located(By.id("remove-sauce-labs-backpack"));

    public static final Target BTN_CHECKOUT = Target.the("Boton checkout")
            .located(By.id("checkout"));

}

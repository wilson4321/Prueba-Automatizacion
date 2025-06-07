package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPageUi {

    public static final Target NOMBRE = Target.the("Ingresar nombre")
            .located(By.id("first-name"));

    public static final Target APELLIDO = Target.the("Ingresar apellido")
            .located(By.id("last-name"));

    public static final Target CODIGO_POSTAL = Target.the("Ingresar codigo postal")
            .located(By.id("postal-code"));

    public static final Target BTN_CONTINUAR = Target.the("Boton Continuar")
            .located(By.id("continue"));

    public static final Target ITEM_TOTAL = Target.the("Item Total").locatedBy("//div[@class='summary_subtotal_label']");
    public static final Target TAX = Target.the("Tax").locatedBy("//div[@class='summary_tax_label']");
    public static final Target TOTAL = Target.the("Total").locatedBy("//div[@class='summary_total_label']");

    public static final Target BTN_FINALIZAR = Target.the("Boton Finalizar")
            .located(By.id("finish"));

    public static final Target COMPRA_FINALIZADA = Target.the("Gracias por su compra")
            .located(By.xpath("//h2[@class='complete-header' and contains(text(),'Thank you for your order!')]"));

}

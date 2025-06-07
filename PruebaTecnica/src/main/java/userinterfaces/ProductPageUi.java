package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPageUi {

    public static final Target TITULO_PRODUCTS = Target.the("pagina de productos")
            .located(By.xpath("//*[text() = 'Products']"));

    public static final Target SELECT_PRODUCTO = Target.the("producto mochila")
            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target SELECT_CARRITO = Target.the("carrito de productos")
            .located(By.xpath("//*[@class='shopping_cart_link']"));

}

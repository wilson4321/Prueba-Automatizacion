package userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class LoginPageUi {

    public static final Target CAMPO_USUARIO = Target.the("campo de usuario")
            .located(By.id("user-name"));

    public static final Target CAMPO_PASSWORD = Target.the("campo de contrasena")
            .located(By.id("password"));

    public static final Target BOTON_LOGIN = Target.the("boton de login")
            .located(By.id("login-button"));

    public static final Target MENSAJE_ERROR = Target.the("mensaje de error")
            .located(By.xpath("//h3[@data-test='error']"));
}

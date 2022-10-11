package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static final Target CAMPO_USER_NAME = Target.the("Campo UserName").located(By.cssSelector("input[name='Username']"));
    public static final Target CAMPO_PASSWORD = Target.the("Campo Password").located(By.cssSelector("input[name='Password']"));
    public static final Target BOTON_SIGN_IN = Target.the("Botón Sing In").located(By.cssSelector("div button[type=submit]"));
}

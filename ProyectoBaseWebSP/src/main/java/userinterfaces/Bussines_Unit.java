package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Bussines_Unit {

    public static final Target BOTON_NEW_BUSSINES_UNIT = Target.the("Boton New Bussines Unit").located(By.cssSelector("div[class*='add-button']"));
    public static final Target CAMPO_NAME = Target.the("Campo Nombre Business Unit").located(By.cssSelector("input[name='Name']"));
    public static final Target CAMPO_PARENT_UNIT = Target.the("Campo Business Unit").located(By.cssSelector("input[id=s2id_autogen1_search]"));
    public static final Target LISTA_PARENT_UNIT = Target.the("Lista Desplegable Parent Unit Business Unit").located(By.cssSelector("a[class$='select2-default']"));
    public static final Target SELECCION_PARENT_UNIT = Target.the("Seleccion de la lista Parent Unit").located(By.cssSelector(""));
    public static final Target BOTON_SAVE_NEW_BUSINESS_UNIT = Target.the("Save New Business Unit").located(By.cssSelector("div[class*='save-and-close']"));

}

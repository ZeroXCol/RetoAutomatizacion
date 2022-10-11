package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {

        public static final Target MODULO_ORGANIZATION = Target.the("Modulo Organizacion").located(By.cssSelector("a[href^='#nav_menu1_3_1']"));
        public static final Target OPCION_BUSINESS_UNIT =  Target.the("Opcion_Business_Unit").located(By.cssSelector("a[href$='Unit']"));
        public static final Target MODULO_REUNIONES = Target.the("Modulo Reuniones").located(By.cssSelector("a[href^='#nav_menu1_3_2']"));
        public static final Target OPCION_REUNIONES = Target.the("Opcion_Meetings").located(By.cssSelector("a[href$='Meeting']"));

    }


package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;
import userinterfaces.Home;
import userinterfaces.Meetings;


public class ReunionesNavegacion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        System.out.println("Estoy Aqui -----------------------------------------");
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.navigate().refresh();

        System.out.println("Estoy Aqui ----------------------------------------- 2");
        actor.attemptsTo(
                Click.on(Home.MODULO_REUNIONES),
                Click.on(Home.MODULO_REUNIONES),
                Click.on(Home.OPCION_REUNIONES)

        );
        System.out.println("Estoy Aqui ----------------------------------------- 3");

        }


    public static ReunionesNavegacion reunionesNavegacion (){

        return Tasks.instrumented(ReunionesNavegacion.class);
    }
}

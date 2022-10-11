package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;

public class OpenTheBrowse implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.relativeUrl("https://serenity.is/demo/"));
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static OpenTheBrowse AbrirNavegador(){
        return Tasks.instrumented(OpenTheBrowse.class);
    }
}

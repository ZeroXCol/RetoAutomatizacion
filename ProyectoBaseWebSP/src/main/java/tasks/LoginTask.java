package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterfaces.Login;

public class LoginTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("admin").into(Login.CAMPO_USER_NAME));
        actor.attemptsTo(Enter.theValue("serenity").into(Login.CAMPO_PASSWORD).thenHit(Keys.ENTER));
    }

    public static LoginTask loginTask(){

       return Tasks.instrumented(LoginTask.class);
    }
}

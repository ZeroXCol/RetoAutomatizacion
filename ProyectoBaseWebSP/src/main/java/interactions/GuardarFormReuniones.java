package interactions;

import interactions.GuardarFormBusinessUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.Meetings;

public class GuardarFormReuniones implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(Meetings.BOTON_SAVE)
        );
    }

    public static GuardarFormBusinessUnit guardarFormBusinessUnit(){

        return Tasks.instrumented(GuardarFormBusinessUnit.class);
    }
}

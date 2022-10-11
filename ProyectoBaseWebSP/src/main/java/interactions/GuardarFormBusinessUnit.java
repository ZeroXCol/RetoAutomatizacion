package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.Bussines_Unit;


public class GuardarFormBusinessUnit implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    Click.on(Bussines_Unit.BOTON_SAVE_NEW_BUSINESS_UNIT)
        );
                    Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static GuardarFormBusinessUnit guardarFormBusinessUnit (){

        return Tasks.instrumented(GuardarFormBusinessUnit.class);
    }
}

package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterfaces.Bussines_Unit;


public class DiligenciarFormularioBusinessUnit implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(Bussines_Unit.BOTON_NEW_BUSSINES_UNIT),
                Enter.theValue("Test Fabian Martínez").into(Bussines_Unit.CAMPO_NAME),
                Click.on(Bussines_Unit.LISTA_PARENT_UNIT),
                Enter.theValue("Technology").into(Bussines_Unit.CAMPO_PARENT_UNIT).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER)

        );
    }

    public static DiligenciarFormularioBusinessUnit diligenciarFormularioBusinessUnit (){

        return Tasks.instrumented(DiligenciarFormularioBusinessUnit.class);

    }
}

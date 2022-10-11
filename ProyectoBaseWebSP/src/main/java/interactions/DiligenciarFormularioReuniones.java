package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterfaces.Meetings;

public class DiligenciarFormularioReuniones implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(Meetings.BOTON_NEW_MEETIN),
                Enter.theValue("Sesion de entendimiento").into(Meetings.CAMPO_MEETING_NAME),
                Click.on(Meetings.LISTA_MEETING_TYPE),
                Enter.theValue("Strategy").into(Meetings.CAMPO_MEETING_TYPE).thenHit(Keys.ENTER),
                Enter.theValue("10").into(Meetings.CAMPO_MEETING_NUMBER),
                Enter.theValue("10/20/2022").into(Meetings.CAMPO_START_DATE),
                Click.on(Meetings.SELECCION_HORA_INICIO),
                Enter.theValue("10/20/2022").into(Meetings.CAMPO_END_DATE),
                Click.on(Meetings.SELECCION_HORA_FINAL),
                Click.on(Meetings.LISTA_LOCATION),
                Enter.theValue("On Site").into(Meetings.CAMPO_LOCATION).thenHit(Keys.ENTER),
                Click.on(Meetings.LISTA_UNIT),
                Enter.theValue("Fabian Martinez").into(Meetings.CAMPO_UNIT).thenHit(Keys.ENTER),
                Click.on(Meetings.LISTA_ORGANIZED_BY),
                Enter.theValue("Allison Bell").into(Meetings.CAMPO_ORGANIZED_BY).thenHit(Keys.ENTER),
                Click.on(Meetings.LISTA_REPORTER),
                Enter.theValue("Victoria Parker").into(Meetings.CAMPO_REPORTER).thenHit(Keys.ENTER),
                Click.on(Meetings.LISTA_ATTENDEE_LIST),
                Enter.theValue("Brandon Coleman").into(Meetings.CAMPO_ATTENDEE_LIST).thenHit(Keys.ENTER)


        );
    }

    public static DiligenciarFormularioReuniones diligenciarFormularioReuniones(){
        return Tasks.instrumented(DiligenciarFormularioReuniones.class);
    }
}

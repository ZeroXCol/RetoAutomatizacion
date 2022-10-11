package interactions;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.Home;

public class UnidadNegocioNaveg implements Task {
    @SneakyThrows
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Thread.sleep(100);
        actor.attemptsTo(
                Click.on(Home.MODULO_ORGANIZATION),
                Click.on(Home.OPCION_BUSINESS_UNIT)
        );

    }
    public static UnidadNegocioNaveg unidadNegocioNaveg (){

        return Tasks.instrumented(UnidadNegocioNaveg.class);
    }
}

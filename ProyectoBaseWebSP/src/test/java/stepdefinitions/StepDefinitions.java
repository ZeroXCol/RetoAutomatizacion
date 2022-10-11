package stepdefinitions;

import interactions.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.*;

public class StepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver browser;
    private Actor user = Actor.named("User").whoCan(BrowseTheWeb.with(browser));

    @Before
    public void abrirNavegador() {
        user.can(BrowseTheWeb.with(browser));
    }
    @Dado("Ingreso exitosamente al aplicativo")
    public void ingresoExitosamenteAlAplicativo() {
        user.wasAbleTo(OpenTheBrowse.AbrirNavegador());
    }
    @Y("Me dirijo al modulo Unidad de negocio para seleccionar Business Unit")
    public void meDirijoAlModuloUnidadDeNegocioParaSeleccionarLaNuevoBusinessUnit() {
        user.wasAbleTo(LoginTask.loginTask());
        user.wasAbleTo(UnidadNegocioNaveg.unidadNegocioNaveg());
        //user.wasAbleTo(ReunionesNavegacion.reunionesNavegacion());
    }
    @Cuando("Diligencio todo el formulario")
    public void diligencioTodoElFormulario() {
        user.wasAbleTo(DiligenciarFormularioBusinessUnit.diligenciarFormularioBusinessUnit());
        //user.wasAbleTo(DiligenciarFormularioReuniones.diligenciarFormularioReuniones());
    }
    @Entonces("Guardo la nueva Business Unit")
    public void ingresoElNombreJuntoConParentUnitParaGuardarLaUnidadDeNegocio() {
        user.wasAbleTo(GuardarFormBusinessUnit.guardarFormBusinessUnit());
        //user.wasAbleTo(GuardarFormReuniones.guardarFormBusinessUnit());
    }

    //---------------------------------------------------------------------- Feature 2


    @Y("Me dirijo al modulo Reunion para seleccionar la opcion reuniones")
    public void meDirijoAlModuloReunionParaSeleccionarLaOpcionReuniones() {
        user.wasAbleTo(ReunionesNavegacion.reunionesNavegacion());
    }

    @Cuando("Diligencio todo el formulario de Reunion")
    public void diligencioTodoElFormularioDeReunion(){
        user.wasAbleTo(DiligenciarFormularioReuniones.diligenciarFormularioReuniones());

    }
    @Entonces("Guardo la nueva reunion")
    public void guardoLaNuevaReunion() {
        user.wasAbleTo(GuardarFormReuniones.guardarFormBusinessUnit());
    }


}









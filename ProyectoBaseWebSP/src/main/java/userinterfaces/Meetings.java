package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Meetings {

    public static final Target BOTON_NEW_MEETIN = Target.the("Boton New Meeting").located(By.cssSelector("div[class*='add-button']"));
    public static final Target CAMPO_MEETING_NAME = Target.the("Campo Meeting Name").located(By.cssSelector("input[name='MeetingName']"));
    public static final Target LISTA_MEETING_TYPE = Target.the("Lista Meeting Type").located(By.cssSelector("#s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId"));
    public static final Target CAMPO_MEETING_TYPE = Target.the("Campo Meeting Name").located(By.cssSelector("#s2id_autogen6_search"));
    public static final Target CAMPO_MEETING_NUMBER = Target.the("Campo Meeting Number").located(By.cssSelector("#Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static final Target CAMPO_START_DATE = Target.the("Campo Start Date").located(By.cssSelector("#Serenity_Pro_Meeting_MeetingDialog10_StartDate"));
    public static final Target SELECCION_HORA_INICIO = Target.the("Seleccionar Hora Inicio ").locatedBy("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/select/option[25]");
    public static final Target CAMPO_END_DATE = Target.the("Campo End Date").located(By.cssSelector("#Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
    public static final Target SELECCION_HORA_FINAL = Target.the("Seleccionar Hora Final ").locatedBy("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[5]/select/option[35]");
    public static final Target LISTA_LOCATION = Target.the("Lista Location ").located(By.cssSelector("#select2-chosen-7"));
    public static final Target CAMPO_LOCATION = Target.the("Campo Location").located(By.cssSelector("#s2id_autogen7_search"));
    public static final Target LISTA_UNIT = Target.the("Lista Unit ").located(By.cssSelector("#select2-chosen-8"));
    public static final Target CAMPO_UNIT = Target.the("Campo Unit").located(By.cssSelector("#s2id_autogen8_search"));
    public static final Target LISTA_ORGANIZED_BY = Target.the("Lista Organized By").located(By.cssSelector("#select2-chosen-9"));
    public static final Target CAMPO_ORGANIZED_BY = Target.the("Campo Organized By").located(By.cssSelector("#s2id_autogen9_search"));
    public static final Target LISTA_REPORTER = Target.the("Lista Reporter").located(By.cssSelector("#select2-chosen-10"));
    public static final Target CAMPO_REPORTER = Target.the("Campo Reporter").located(By.cssSelector("#s2id_autogen10_search"));
    public static final Target LISTA_ATTENDEE_LIST = Target.the("Lista Reporter").located(By.cssSelector("#select2-chosen-12"));
    public static final Target CAMPO_ATTENDEE_LIST = Target.the("Campo Reporter").located(By.cssSelector("#s2id_autogen12_search"));
    public static final Target BOTON_SAVE = Target.the("Boton Save New Meeting").located(By.cssSelector("div[class*='save-and-close']"));


}

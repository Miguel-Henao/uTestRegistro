package co.com.utest.proyecto.utestregistro.tasks;

import co.com.utest.proyecto.utestregistro.userinterface.UtestPaginaRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registro implements Task{
    private String strNombres;
    private String strApellidos;
    private String strEmail;
    private String strNacimientoDia;
    private String strNacimientoMes;
    private String strNacimientoYea;
    private String strLenguages;
    private String strCiudad;
    private String strCodigoPostal;
    private String strPais;
    private String strComputador;
    private String strVersionComputador;
    private String strLenguajeComputador;
    private String strMovil;
    private String strMovilModelo;
    private String strMovilOS;
    private String strPassword;
    private String strConfirmPassword;
    private String strStayInformed;
    private String strTermUse;
    private String strPSP;

    public Registro(String strNombres, String strApellidos, String strEmail, String strNacimientoDia, String strNacimientoMes, String strNacimientoYea, String strLenguages, String strCiudad, String strCodigoPostal, String strPais, String strComputador, String strVersionComputador, String strLenguajeComputador, String strMovil, String strMovilModelo, String strMovilOS, String strPassword, String strConfirmPassword, String strStayInformed, String strTermUse, String strPSP) {
        this.strNombres = strNombres;
        this.strApellidos = strApellidos;
        this.strEmail = strEmail;
        this.strNacimientoDia = strNacimientoDia;
        this.strNacimientoMes = strNacimientoMes;
        this.strNacimientoYea = strNacimientoYea;
        this.strLenguages = strLenguages;
        this.strCiudad = strCiudad;
        this.strCodigoPostal = strCodigoPostal;
        this.strPais = strPais;
        this.strComputador = strComputador;
        this.strVersionComputador = strVersionComputador;
        this.strLenguajeComputador = strLenguajeComputador;
        this.strMovil = strMovil;
        this.strMovilModelo = strMovilModelo;
        this.strMovilOS = strMovilOS;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
        this.strStayInformed = strStayInformed;
        this.strTermUse = strTermUse;
        this.strPSP = strPSP;
    }





    public static Registro onThePage(String strNombres, String strApellidos, String strEmail, String strNacimientoDia, String strNacimientoMes, String strNacimientoYea, String strLenguages, String strCiudad, String strCodigoPostal, String strPais, String strComputador, String strVersionComputador, String strLenguajeComputador, String strMovil, String strMovilModelo, String strMovilOS, String strPassword, String strConfirmPassword, String strStayInformed, String strTermUse, String strPSP) {
   return Tasks.instrumented(Registro.class, strNombres, strApellidos, strEmail, strNacimientoDia, strNacimientoMes, strNacimientoYea, strLenguages, strCiudad, strCodigoPostal, strPais, strComputador, strVersionComputador, strLenguajeComputador, strMovil, strMovilModelo, strMovilOS, strPassword, strConfirmPassword, strStayInformed, strTermUse, strPSP);

        }




        @Override
    public <T extends Actor> void performAs(T actor) { actor.attemptsTo(
             Click.on(UtestPaginaRegistro .BOTON_JT),
            Enter.theValue(strNombres).into(UtestPaginaRegistro .INPUT_FN),
                Enter.theValue(strApellidos).into(UtestPaginaRegistro .INPUT_LN),
                Enter.theValue(strEmail).into(UtestPaginaRegistro .INPUT_E),
                Enter.theValue(strNacimientoDia).into(UtestPaginaRegistro .INPUT_DIA),
                Enter.theValue(strNacimientoMes).into(UtestPaginaRegistro .INPUT_MES),
                Enter.theValue(strNacimientoYea).into(UtestPaginaRegistro .INPUT_SA),
                Enter.theValue(strLenguages).into(UtestPaginaRegistro .INPUT_IDI),
                Click.on(UtestPaginaRegistro .BOTON_NL),

            Enter.theValue(strCiudad).into(UtestPaginaRegistro.INPUT_C),
                Enter.theValue(strCodigoPostal).into(UtestPaginaRegistro.INPUT_ZPC),
                Enter.theValue(strPais).into(UtestPaginaRegistro.INPUT_CO),
                Click.on(UtestPaginaRegistro .BOTON_NSYD),

                Enter.theValue(strComputador).into(UtestPaginaRegistro.INPUT_YC),
                Enter.theValue(strVersionComputador).into(UtestPaginaRegistro.INPUT_VCO),
                Enter.theValue(strLenguajeComputador).into(UtestPaginaRegistro.INPUT_LCO),
                Enter.theValue(strMovil).into(UtestPaginaRegistro.INPUT_MV),
                Enter.theValue(strMovilModelo).into(UtestPaginaRegistro.INPUT_MMO),
                Enter.theValue(strMovilOS).into(UtestPaginaRegistro.INPUT_OSM),

                Click.on(UtestPaginaRegistro.BOTON_NLS),

            Enter.theValue(strPassword).into(UtestPaginaRegistro .INPUT_PW),
                Enter.theValue(strConfirmPassword).into(UtestPaginaRegistro .INPUT_CPW),
                Enter.theValue(strStayInformed).into(UtestPaginaRegistro .INPUT_SI),
                Enter.theValue(strTermUse).into(UtestPaginaRegistro .INPUT_UTOU),
                Enter.theValue(strPSP).into(UtestPaginaRegistro .INPUT_PSP),
                Click.on(UtestPaginaRegistro .BOTON_COM)
    );
    }
}

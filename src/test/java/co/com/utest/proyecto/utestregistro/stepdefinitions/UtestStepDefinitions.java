package co.com.utest.proyecto.utestregistro.stepdefinitions;

import co.com.utest.proyecto.utestregistro.model.UtestDato;
import co.com.utest.proyecto.utestregistro.tasks.OpenUp;
import co.com.utest.proyecto.utestregistro.tasks.Registro;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("^miguel le da click en el boton Únete hoy, ingresa los datos y se registra$")
    public void miguelLeDaClickEnElBotonUneteHoyIngresaLosDatosYSeRegistra(List<UtestDato>utestDato) {OnStage.theActorCalled("Miguel").wasAbleTo(OpenUp.thePage(), Registro.onThePage(
                utestDato.get(0).getStrNombres(),
                utestDato.get(0).getStrApellidos(),
                utestDato.get(0).getStrEmail(),
                utestDato.get(0).getStrNacimientoDia(),
                utestDato.get(0).getStrNacimientoMes(),
                utestDato.get(0).getStrNacimientoYea(),
                utestDato.get(0).getStrLenguages(),
                utestDato.get(0).getStrCiudad(),
                utestDato.get(0).getStrCodigoPostal(),
                utestDato.get(0).getStrPais(),
                utestDato.get(0).getStrComputador(),
                utestDato.get(0).getStrVersionComputador(),
                utestDato.get(0).getStrLenguajeComputador(),
                utestDato.get(0).getStrMovil(),
                utestDato.get(0).getStrMovilModelo(),
                utestDato.get(0).getStrMovilOS(),
                utestDato.get(0).getStrPassword(),
                utestDato.get(0).getStrConfirmPassword(),
                utestDato.get(0).getStrStayInformed(),
                utestDato.get(0).getStrTermUse(),
                utestDato.get(0).getStrPSP()
        ));
    }


}

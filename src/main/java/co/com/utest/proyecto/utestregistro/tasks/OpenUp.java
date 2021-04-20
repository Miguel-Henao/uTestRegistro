package co.com.utest.proyecto.utestregistro.tasks;

import co.com.utest.proyecto.utestregistro.userinterface.UtestPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenUp implements Task {
    private UtestPagina utestPagina;
    public static Performable thePage() {

    return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}

package co.com.utest.proyecto.utestregistro.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestPaginaRegistro {
    public static final Target BOTON_JT = Target.the("Join Today").located(By.xpath("//ul[@class='nav navbar-nav']//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FN = Target.the("Ingrsa Nombres").located(By.id("firstName"));
    public static final Target INPUT_LN = Target.the("Ingresa Apellidos").located(By.id("lastName"));
    public static final Target INPUT_E = Target.the("Ingresa Email").located(By.id("email"));
    public static final Target INPUT_DIA = Target.the("Selecciona Dia").located(By.id("birthDay"));
    public static final Target INPUT_MES = Target.the("Selecciona Mes").located(By.id("birthMonth"));
    public static final Target INPUT_SA = Target.the("Selecciona Año").located(By.id("birthYear"));
    public static final Target INPUT_IDI = Target.the("Selecciona Idioma").located(By.xpath("//label[@for='languages']"));
    public static final Target BOTON_NL = Target.the("Definir su localización").located(By.xpath("//a[@class='btn btn-blue'] //span[contains(text('Next: Location'))]"));
    public static final Target INPUT_C = Target.the("Ingresa Ciudad").located(By.id("city"));
    public static final Target INPUT_ZPC = Target.the("Ingresa Codigo Postal").located(By.id("zip"));
    public static final Target INPUT_CO = Target.the("Ingresa Pais").located(By.xpath("//div[@class = 'ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required auto-detected']"));
    public static final Target BOTON_NSYD = Target.the("Seleciona Tus Dispositivos").located(By.xpath("//a[@class='btn btn-blue'] //span[contains(text('Next: Devices'))]"));
    public static final Target INPUT_YC = Target.the("Selecciona Computador").located(By.xpath("//div[@class='ui-select-box']//span[contains(text('Windows')]"));
    public static final Target INPUT_VCO = Target.the("Selecciona Version del Computador").located(By.xpath("//div[@class='ui-select-box']//span[contains(text('10')]"));
    public static final Target INPUT_LCO = Target.the("Selecciona Lenguaje del Computador").located(By.xpath("//div[@class='ui-select-box']//span[contains(text('Spanish')]"));
    public static final Target INPUT_MV = Target.the("Selecciona Movil").located(By.xpath("//div[@class='ui-select-box']//span[contains(text('Select Brand')]"));
    public static final Target INPUT_MMO = Target.the("Selecciona Modelo Movil").located(By.xpath("//div[@class='ui-select-box']//span[contains(text('Select a Model')]"));
    public static final Target INPUT_OSM = Target.the("Selecciona OS Movil").located(By.xpath("//div[@class='ui-select-box']//span[contains(text('Select OS')]"));
    public static final Target BOTON_NLS = Target.the("Último paso").located(By.xpath("//a[@class='btn btn-blue'] //span[contains(text('Next: Last Step'))]"));
    public static final Target INPUT_PW  = Target.the( "Crear Contraseña").located(By.id("password"));
    public static final Target INPUT_CPW = Target.the("Confirmar Contraseña").located(By.id("confirmPassword"));
    public static final Target INPUT_SI = Target.the("¡MANTENTE INFORMADO! (Opcional)").located(By.xpath("input [@class = 'ing-valid ng-empty ng-dirty ng-valid-parse ng-touched']"));
    public static final Target INPUT_UTOU = Target.the("Aceptar Términos y Condiciones ").located(By.id("termOfUse"));
    public static final Target INPUT_PSP = Target.the("Aceptar Política de privacidad y seguridad").located(By.id("privacySetting"));
    public static final Target BOTON_COM = Target.the("Confirmar Registro").located(org.openqa.selenium.By.id("laddaBtn"));
}

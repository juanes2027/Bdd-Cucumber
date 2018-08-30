#Author: your.email@your.domain.com
@Regresion
Feature: Formulario Popup Valudation
 El usuario debe poder ingresar al formulario los datos requeridos.
 Cada campo del formulario realiza validaciones.

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario
   no se presenta ningun mensaje de valdación
    Given Autenticación en Colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms
    When Diligencio formulario Popup Validation
    |Required|Select|Select2|Select2|Url|Email|Pass|Pass2|Min|Max|Number|Ip|Dato|DatoTarde|
    |Valor1|Golf|Tennis|Golf|http://www.valor1.com|Valor1@gmail.com|valor1|valor1|123456|123456|-99.99|200.200.5.4|2018-08-29|2012/09/12|
    Then Verifico Ingreso Exitoso

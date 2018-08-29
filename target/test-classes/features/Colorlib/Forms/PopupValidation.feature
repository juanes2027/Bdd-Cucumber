#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
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
    |Required | Select | MultipleS1  | MultipleS2  | Url                   | Email             | Password1| Password2 | MinSize  |MaxSize | Number | Ip           | Date        | DateEarlier |
    | Valor1  |   Golf | Tennis      | Golf        | http://www.valor1.com | Valor1@gmail.com  | valor1   | valor1    | 123456   | 123456 | -99.99 | 200.200.5.4  | 2018-08-29  | 2012/09/12  |
    Then Verifico Ingreso Exitoso

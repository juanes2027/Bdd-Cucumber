package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.PopupValidationSteps;
import com.choucair.formacion.steps.ColorlibFormValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {
	@Steps
	PopupValidationSteps popupValidationSteps;
	@Steps
	ColorlibFormValidationSteps colorlibFormValidationSteps;
	
	
	
	@Given("^Autenticación en Colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autenticación_en_Colorlib_con_usuario_y_clave(String Usuario, String Clave) {
		 popupValidationSteps.login_colorlib(Usuario, Clave);
	}

	@Given("^Ingreso a la funcionalidad Forms$")
	public void ingreso_a_la_funcionalidad_Forms() {
		popupValidationSteps.ingresar_form_validation();
	}

	@When("^Diligencio formulario Popup Validation$")
	public void diligencio_formulario_Popup_Validation(DataTable dtDatosForm) {
	List<List<String>> data=dtDatosForm.raw();	
	for (int i=1; i<data.size(); i++) {
		colorlibFormValidationSteps.diligenciar_popup_datos_tabla(data,i);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
	
		}
	}
	}

	@Then("^Verifico Ingreso Exitoso$")
	public void verifico_Ingreso_Exitoso() {
		colorlibFormValidationSteps.VerificarExito();
			}
	@Then("^Verifico que se presente globo informativo$")
	public void verifico_que_se_presente_globo_informativo() {
		colorlibFormValidationSteps.VerificarError();
	}

}

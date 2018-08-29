package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;
//import net.thucydides.core.annotations.Steps;

public class PopupValidationSteps {

	
	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;
	
	@Step
	public void login_colorlib(String strUsuario,String strPass) {	
		//abrir navegador con la url de prueba 
		colorlibLoginPage.open();
		
		//ingresar usuario pass y click boton ingresar
		
		colorlibLoginPage.IngresarDatos(strUsuario,strPass);
		//verificar autenticacion
		colorlibLoginPage.VerificaHome();
		
	
	}
	@Step
	public void ingresar_form_validation() {
		colorlibMenuPage.menuFormValidation();
	}

}

package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;

import net.thucydides.core.annotations.Step;

public class ColorlibFormValidationSteps {

	ColorlibFormValidationPage colorlibFormValidationPage;
	
	@Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {	
		System.out.println(data.get(id).get(0).trim());
		colorlibFormValidationPage.Required(data.get(id).get(0).trim());
		System.out.println(data.get(id).get(1).trim());
		colorlibFormValidationPage.Select(data.get(id).get(1).trim());
		System.out.println(data.get(id).get(2).trim());
		colorlibFormValidationPage.Select2(data.get(id).get(2).trim());
		colorlibFormValidationPage.Select2(data.get(id).get(3).trim());
		colorlibFormValidationPage.Url(data.get(id).get(4).trim());
		colorlibFormValidationPage.Email(data.get(id).get(5).trim());
		colorlibFormValidationPage.Pass(data.get(id).get(6).trim());
		colorlibFormValidationPage.Pass2(data.get(id).get(7).trim());
		colorlibFormValidationPage.Min(data.get(id).get(8).trim());
		colorlibFormValidationPage.Max(data.get(id).get(9).trim());
		colorlibFormValidationPage.Num(data.get(id).get(10).trim());
		colorlibFormValidationPage.Ip(data.get(id).get(11).trim());
		colorlibFormValidationPage.Dato(data.get(id).get(12).trim());
		colorlibFormValidationPage.DatoTarde(data.get(id).get(13).trim());
		colorlibFormValidationPage.Validar();
	}
	@Step
	public void VerificarExito() {
		colorlibFormValidationPage.FormSinError();
	}
	@Step
	public void VerificarError() {
		colorlibFormValidationPage.FormConError();
	}
}

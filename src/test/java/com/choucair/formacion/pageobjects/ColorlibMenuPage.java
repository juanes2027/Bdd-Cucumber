package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibMenuPage extends PageObject{
	
	//Menu forms
	@FindBy(xpath="//*[@id='menu']/li[6]/a")
	public WebElementFacade menuForms;
	//Menu forms general
	@FindBy(xpath="//*[@id='menu']/li[6]/ul/li[1]/a")
	public WebElementFacade menuFormGenerals;
	
	//Menu forms validation
	@FindBy(xpath="//*[@id='menu']/li[6]/ul/li[2]/a")
	public WebElementFacade menuFormValidation;
			
	//label informativo form validation
	@FindBy(xpath="//*[@id='content']/div/div/div[1]/div/div/header/h5")
	public WebElementFacade lblFormValidation;
	
	public void menuFormValidation() {
		
		menuForms.click();
		menuFormValidation.click();
		String strMensaje=lblFormValidation.getText();
		assertThat(strMensaje,containsString("Popup Validation"));
		
	}
}

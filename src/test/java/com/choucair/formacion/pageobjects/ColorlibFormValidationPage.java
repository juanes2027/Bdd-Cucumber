package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.*;


import gherkin.lexer.Is;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormValidationPage extends PageObject{
	
	//Required
			@FindBy(xpath="//*[@id='req']")	
			public WebElementFacade txtReq;
			//Select
			@FindBy(xpath="//*[@id='sport']")
			public WebElementFacade txtSel;
			//Select2
			@FindBy(xpath="//*[@id='sport2']")
			public WebElementFacade txtSel2;
			//Url
			@FindBy(xpath="//*[@id='url1']")
			public WebElementFacade txtUrl;
			//Email
			@FindBy(id="email1")
			public WebElementFacade txtEma;
			//Password
			@FindBy(id="pass1")
			public WebElementFacade txtPas;
			//confirm Password
			@FindBy(id="pass2")
			public WebElementFacade txtCon;		
			//Minimum field size (6)
			@FindBy(id="minsize1")
			public WebElementFacade txtMin;
			//Max field size (6)
			@FindBy(name="maxsize1")
			public WebElementFacade txtMax;
			//number
			@FindBy(id="number2")
			public WebElementFacade txtNum;
			//	ip
			@FindBy(id="ip")
			public WebElementFacade txtIp;
			//date
			@FindBy(id="date3")
			public WebElementFacade txtDat;
			//Date Earlier
			@FindBy(id="past")
			public WebElementFacade txtDatEar;
			//Boton validar
			@FindBy(xpath="//*[@id='popup-validation']/div[14]/input")
			public WebElementFacade btnVal;
		
			//Globo informativo
			@FindBy(xpath="//DIV[@class='formErrorContent'])[1]")
			public WebElementFacade globo;
			
			
			public void Required(String datoPrueba) {
				
				txtReq.click();
				txtReq.clear();
				txtReq.sendKeys(datoPrueba);}
				public void Select(String datoPrueba) {
					txtSel.click();
					txtSel.selectByVisibleText(datoPrueba);}
				public void Select2(String datoPrueba) {
					txtSel2.click();
					txtSel2.selectByVisibleText(datoPrueba);}
					public void Url(String datoPrueba) {
						txtUrl.click();
						txtUrl.clear();
						txtUrl.sendKeys(datoPrueba);}
						public void Email(String datoPrueba) {
							txtEma.click();
							txtEma.clear();
							txtEma.sendKeys(datoPrueba);}
							public void Pass(String datoPrueba) {
								txtPas.click();
								txtPas.clear();
								txtPas.sendKeys(datoPrueba);}
								public void Pass2(String datoPrueba) {
									txtCon.click();
									txtCon.clear();
									txtCon.sendKeys(datoPrueba);}
									public void Min(String datoPrueba) {
										txtMin.click();
										txtMin.clear();
										txtMin.sendKeys(datoPrueba);}
										public void Max(String datoPrueba) {
											txtMax.click();
											txtMax.clear();
											txtMax.sendKeys(datoPrueba);}
											public void Num(String datoPrueba) {
												txtNum.click();
												txtNum.clear();
												txtNum.sendKeys(datoPrueba);}
												public void Ip(String datoPrueba) {
													txtIp.click();
													txtIp.clear();
													txtIp.sendKeys(datoPrueba);}
													public void Dato(String datoPrueba) {
														txtDat.click();
														txtDat.clear();
														txtDat.sendKeys(datoPrueba);}
														public void DatoTarde(String datoPrueba) {
															txtDatEar.click();
															txtDatEar.clear();
															txtDatEar.sendKeys(datoPrueba);}
															public void Validar() {
																btnVal.click();}
															public void FormSinError() {
																assertThat(globo.isCurrentlyVisible(),is(false));
					}
															public void FormConError() {
																assertThat(globo.isCurrentlyVisible(),is(true));
			
			
			

															}
															}

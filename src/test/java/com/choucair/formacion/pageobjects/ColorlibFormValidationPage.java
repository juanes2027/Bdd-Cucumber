package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormValidationPage {
	
	//Required
			@FindBy(xpath="//*[@id='req']")	
			public WebElementFacade txtReq;
			//Select
			@FindBy(xpath="//*[@id='sport']")
			public WebElementFacade txtSel;
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
			
		
			
			public void Required(String datoPrueba) {
				txtReq.click();
				txtReq.clear();
				txtReq.sendKeys(datoPrueba);
				
	

	
				
			}
			
			
			
			

}

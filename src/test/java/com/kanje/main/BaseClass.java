package com.kanje.main;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeSuite;

public class BaseClass extends AppiumMain{
	@BeforeSuite
	public void BeforeSuit() throws MalformedURLException {
		Android =  GetAndroidInstance("Moto g power","ZY227KGST2","Android","11 RPMS31.Q1-54-13-2",60,"net.livinapp.lealtad","net.livinapp.lealtad.features.auth.ui.LoginActivity");
	//Aqui se cambian los valores de los cuales se quiere hacer la prueba el dispositivo movil
	}
}

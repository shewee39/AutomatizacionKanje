package com.kanje.Pruebas;

import org.testng.annotations.Test;

import com.kanje.main.AppiumMain;
import com.kanje.main.BaseClass;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Kanje extends BaseClass{
	
	@BeforeClass
	@Test(priority=1)
	public void CambioContraseña() throws InterruptedException
    {
		time.sleep(2);
		WaitToClik(Android, "//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"]", 5);
		Android.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"]")).click();
		time.sleep(5);
		TouchAction TapPais = new TouchAction(Android);
		TapPais.tap(new PointOption().withCoordinates(275, 1358)).perform();
		time.sleep(5);
		WaitToClik(Android, "net.livinapp.lealtad:id/btnContinue", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/btnContinue")).click();
		time.sleep(3);
		WaitToClik(Android, "net.livinapp.lealtad:id/email", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/email")).click();
		time.sleep(1);
		Android.findElement(By.id("net.livinapp.lealtad:id/email")).sendKeys("macox57620@monutri.com");
		time.sleep(1);
		WaitToClik(Android, "net.livinapp.lealtad:id/password", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/password")).click();
		time.sleep(1);
		Android.findElement(By.id("net.livinapp.lealtad:id/password")).sendKeys("Prueba123");
		time.sleep(1);
		WaitToClik(Android, "net.livinapp.lealtad:id/singIn", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/singIn")).click();
		time.sleep(5);
		WaitToClik(Android, "net.livinapp.lealtad:id/imageIconPerson", 5);
		screenshot(Android, "Muestra de app");
		Android.findElement(By.id("net.livinapp.lealtad:id/imageIconPerson")).click();
		time.sleep(1);
		TouchAction TapContraseña = new TouchAction(Android);
		TapContraseña.tap(new PointOption().withCoordinates(295, 456)).perform();
		time.sleep(3);
		WaitToClik(Android, "net.livinapp.lealtad:id/textPass", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/textPass")).click();
		time.sleep(2);
		Android.findElement(By.id("net.livinapp.lealtad:id/textPass")).sendKeys("Prueba123");
		time.sleep(3);
		WaitToClik(Android, "net.livinapp.lealtad:id/textPass1", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/textPass1")).click();
		time.sleep(2);
		Android.findElement(By.id("net.livinapp.lealtad:id/textPass1")).sendKeys("Prueba1234");
		time.sleep(3);
		WaitToClik(Android, "net.livinapp.lealtad:id/textPass2", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/textPass2")).click();
		time.sleep(2);
		Android.findElement(By.id("net.livinapp.lealtad:id/textPass2")).sendKeys("Prueba1234");
		time.sleep(3);
		WaitToClik(Android, "net.livinapp.lealtad:id/btnChangePassword", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/btnChangePassword")).click();
		time.sleep(3);
		WaitToClik(Android, "android:id/button1", 5);
		Android.findElement(By.id("android:id/button1")).click();
		time.sleep(3);
		WaitToClik(Android, "net.livinapp.lealtad:id/btnChangePassword", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/btnChangePassword")).click();
		time.sleep(2);
		WaitToClik(Android, "//android.widget.ImageView[@content-desc=\"Descripción\"]", 5);
		Android.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Descripción\"]")).click();
		time.sleep(2);
		Android.findElement(By.id("android:id/button1")).click();
		time.sleep(2);
		WaitToClik(Android, "android:id/button1", 5);
		Android.findElement(By.id("android:id/button1")).click();
		time.sleep(2);
		WaitToClik(Android, "android:id/button1", 5);
		Android.findElement(By.id("android:id/button1")).click();
		time.sleep(2);
		WaitToClik(Android, "android:id/button1", 5);
		Android.findElement(By.id("android:id/button1")).click();
		time.sleep(2);
		WaitToClik(Android, "net.livinapp.lealtad:id/imageIconPerson", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/imageIconPerson")).click();
		time.sleep(1);
		TouchAction TapSesion = new TouchAction(Android);
		TapSesion.tap(new PointOption().withCoordinates(302, 637)).perform();
		time.sleep(3);
		//Termina todo el proceso de cambio de contraseña y empieza el proceso de llenado de datos para la afiliacion
    }
	
	@Test(priority=2)
	public void LlenadoUsuario() throws InterruptedException
    {	
		time.sleep(2);
		WaitToClik(Android, "net.livinapp.lealtad:id/email", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/email")).click();
		time.sleep(1);
		Android.findElement(By.id("net.livinapp.lealtad:id/email")).sendKeys("mofavo7686@jybra.com");//Se debe de ingresar un correo que no se a registrado anteriormente para llenar los datos de la afiliacion
		//En este caso es un correo que esta para realizar el proceso de registro ya que si esta registrado con los datos manda directamente a la afiliacion del plan
		time.sleep(1);
		WaitToClik(Android, "net.livinapp.lealtad:id/password", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/password")).click();
		time.sleep(1);
		Android.findElement(By.id("net.livinapp.lealtad:id/password")).sendKeys("Prueba123");
		time.sleep(1);
		WaitToClik(Android, "net.livinapp.lealtad:id/singIn", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/singIn")).click();
		time.sleep(5);
		WaitToClik(Android, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.ImageView", 5);
		screenshot(Android, "Ingreso a App");//Toma una captura de la interfaz de la app
		Android.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
		time.sleep(2);
		WaitToClik(Android, "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.FrameLayout", 5);
		Android.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.FrameLayout")).click();
		time.sleep(2);
		WaitToClik(Android, "net.livinapp.lealtad:id/layoutDataStampContainer", 5);
		TouchAction TapAfiliados = new TouchAction(Android);
		TapAfiliados.tap(new PointOption().withCoordinates(859, 909)).perform();
		//Hace un tap en las coordenadas puestas ya que algunos elementos no aparecia algun elemento para interactuar
		time.sleep(3);
		WaitToClik(Android, "net.livinapp.lealtad:id/positiveButton", 5);
		screenshot(Android, "Aparicion de modal");
		Android.findElement(By.id("net.livinapp.lealtad:id/positiveButton")).click();
		time.sleep(1);
		WaitToClik(Android, "net.livinapp.lealtad:id/text_name_id", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_name_id")).click();
		time.sleep(3);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_name_id")).sendKeys("Nombre12");
		WaitToClik(Android, "net.livinapp.lealtad:id/text_last_name_id", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_last_name_id")).click();
		time.sleep(2);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_last_name_id")).sendKeys("Apellido12");
		WaitToClik(Android, "net.livinapp.lealtad:id/text_input_end_icon", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_input_end_icon")).click();
		time.sleep(2);
		TouchAction TapGenero = new TouchAction(Android);
		TapGenero.tap(new PointOption().withCoordinates(241, 1053)).perform();
		time.sleep(2);
		WaitToClik(Android, "net.livinapp.lealtad:id/text_birthday_id", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_birthday_id")).click();
		time.sleep(3);
		TouchAction TapMes = new TouchAction(Android);
		TapMes.tap(new PointOption().withCoordinates(262, 835)).perform();
		time.sleep(3);
		Android.findElement(By.xpath("//android.view.View[@content-desc=\"01 septiembre 2023\"]")).click();
		time.sleep(2);
		Android.findElement(By.id("android:id/button1")).click();
		WaitToClik(Android, "net.livinapp.lealtad:id/text_document_id", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_document_id")).click();
		time.sleep(1);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_document_id")).sendKeys("12345678-9");
		Android.navigate().back();
		time.sleep(3);
		WaitToClik(Android, "net.livinapp.lealtad:id/text_phone_id", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_phone_id")).click();
		time.sleep(1);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_phone_id")).sendKeys("11223344");
		Android.navigate().back();
		time.sleep(3);
		WaitToClik(Android, "net.livinapp.lealtad:id/text_address_id", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_address_id")).click();
		Android.navigate().back();
		time.sleep(2);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_address_id")).sendKeys("Direccion de prueba 1234");
		WaitToClik(Android, "net.livinapp.lealtad:id/text_email_id", 5);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_email_id")).click();
		Android.navigate().back();
		time.sleep(2);
		Android.findElement(By.id("net.livinapp.lealtad:id/text_email_id")).sendKeys("pruebasQA01@prueba.com");//Se debe de ingresar un correo no agregado al sistema
		WaitToClik(Android, "net.livinapp.lealtad:id/btn_register", 5);
		screenshot(Android, "Llenado de datos");
		time.sleep(2);
		Android.findElement(By.id("net.livinapp.lealtad:id/btn_register")).click();
		time.sleep(5);
		screenshot(Android, "Completado Proceso de llenado de datos");
    }
		
	@AfterClass
	public void tearDown() {
		//Termina toda la sesion y cierra el controlador 
		Android.quit();
	}
}

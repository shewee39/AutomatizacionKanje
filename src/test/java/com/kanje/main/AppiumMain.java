package com.kanje.main;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumMain {
	
	public static AndroidDriver<MobileElement> Android;
	public static TimeUnit time;

	public AndroidDriver<MobileElement> GetAndroidInstance(String DEVICE_NAME, String UDID, String PLATAFORM_NAME, String PLATAFORM_VERSION,int NEW_COMMAND_TIMEOUT, String APP_PACKAGE, String APP_ACTIVITY) throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities(); 
		
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,DEVICE_NAME);
		caps.setCapability(MobileCapabilityType.UDID,UDID);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,PLATAFORM_NAME);
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,PLATAFORM_VERSION);		
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, NEW_COMMAND_TIMEOUT);
		caps.setCapability("appPackage", APP_PACKAGE);
		caps.setCapability("appActivity", APP_ACTIVITY);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		time = TimeUnit.SECONDS;
		return Android = new AndroidDriver<MobileElement>(url, caps);
	}
	public void WaitToClik(AndroidDriver<MobileElement> Android, String targetResourceXpath , long timeLimitInSeconds)
	{
		try {
			
			WebDriverWait wait = new WebDriverWait(Android, timeLimitInSeconds);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(targetResourceXpath)));
			
		} catch (Exception ex) {	
			  System.out.println("Message is: " + ex.getMessage());
			  System.out.println("Cause is: " + ex.getCause());
			  System.out.println(ex.getStackTrace());			
		}
	}
	public void screenshot(AndroidDriver<MobileElement> Android,String Nombre) 
	{
		File captura = ((TakesScreenshot)Android).getScreenshotAs(OutputType.FILE);
		
		try{
			FileUtils.copyFile(captura,new File("E:\\Cosas del trabajo\\Fotos\\" + Nombre + " " + fechaCaptura() + ".png"));//Se cambia la direccion en la cual se quieren guardar las capturas 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String fechaCaptura() 
	{
		DateFormat FormatoFecha = new SimpleDateFormat("dd-MM-yy");
		Date fecha = new Date();
		return FormatoFecha.format(fecha);
	}
	
}

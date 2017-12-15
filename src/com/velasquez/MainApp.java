package com.velasquez;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_config.xml");
		//Con esto puedo usar el Bean (Que est� configurado en el xml spring_config)
	
		Administrador administrador = (Administrador) applicationContext.getBean("admin");
		//Con esto, estoy haciendo la instancia... Traigo el Bean (El objeto) con el id correspondiente
	
		//administrador.imprimirDireccion();//Llam� el m�todo de la clase, sin necesidad de usar el New
		//Esto, es... Inyecci�n de dependecias  :) 
		
		((ClassPathXmlApplicationContext)applicationContext).close();// Esto se escribi� para eliminar el Warning de la linea 8
						
		System.out.println(administrador);
	}
	
	
}


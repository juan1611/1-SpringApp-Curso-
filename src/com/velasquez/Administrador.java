package com.velasquez;

import org.springframework.beans.factory.annotation.Autowired;

public class Administrador {

	private int idAd;
	private String nombre;

	@Autowired  // Con el Autowired, se ha inyectado la dependencia.
	private Direccion direccion;
	
	public Administrador(){
		
	}
	
	public Administrador(int idAd, String nombre) {
		this.idAd = idAd;
		this.nombre = nombre;
	}

	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}

	//También podemos poner el Autowired aquí.
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Administrador [idAd=" + idAd + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	public void imprimirDireccion() {
		System.out.println("Encino 201");
	}


}

package com.example.primerservicio.dto;

import javax.persistence.Entity;


import org.springframework.boot.autoconfigure.domain.EntityScan;



public class JugadorDto {
	
	
	private int cod;
	private String nombre; 
	private int edad;
	private int num1;
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	@Override
	public String toString() {
		return "JugadorDto [cod=" + cod + ", nombre=" + nombre + ", edad=" + edad + ", num1=" + num1 + "]";
	}
	
	
	
	
		
	

}

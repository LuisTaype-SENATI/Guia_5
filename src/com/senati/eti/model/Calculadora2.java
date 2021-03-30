package com.senati.eti.model;

public class Calculadora2 {
	private float numero1;
	private float numero2;
	
	//Atibutos
	
	public float getNumero1() {
		return numero1;
	}
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	public float getNumero2() {
		return numero2;
	}
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	
	
	//Métodos constructores
	
	public Calculadora2() {
		//
		super();
	}
	public Calculadora2(float umero1, float numero2) {
		//Hereda valores maximo o superiorde la variable
		//super();
		this.numero1 = numero1;
		this.numero2 = numero2;
		
		
	}
	
	public float Operar(int tipo) {
		float  rpta = 0;
		
		
		//9 -> Mayor, 10 -> Menor
		switch(tipo) {
		    case 1:
		    	rpta = this.numero1 + this.numero2;
			    break;
		    case 2:
		    	rpta = this.numero1 - this.numero2;
		    	break;
		    case 3:
		    	rpta = this.numero1 * this.numero2;
		    	break;
		
		}
		return rpta;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

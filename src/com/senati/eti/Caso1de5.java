package com.senati.eti;

import com.senati.eti.model.Calculadora1;

import java.util.Scanner;

public class Caso1de5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculadora1 cal = new Calculadora1(8, 3);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("N�mero 1: ");
		n1 = sc.nextFloat();
		
		System.out.print("N�mero 2: ");
		n2 = sc.nextFloat();
		
		cal.setNumero1(n1);
		cal.setNumero2(n2);
		
		System.out.println("\nN�MEROS INGRESADOS");
		System.out.println("------------------");
		System.out.println("Primer n�mero: " + cal.getNumero1());
		System.out.println("Segundo n�mero: " + cal.getNumero2());
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		
		System.out.println("1. Suma...................: " + cal.Suma());
        System.out.println("2. Resta..................: " + cal.Resta());
        System.out.println("3. Producto...............: " + cal.Producto());
        System.out.println("4. Divisi�n...............: " + cal.Division());
        System.out.println("5. Resto..................: " + cal.RestoEntero());
        

	}

}

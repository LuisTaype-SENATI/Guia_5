package com.senati.eti;

import com.senati.eti.model.Alumno;

import java.util.Scanner;

import java.io.*;

public class Caso6de5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		try {
			archivo = new FileWriter("Info.txt",true);
			pw = new PrintWriter(archivo);
			
			System.out.println("R E G I S T R O   D E   D A T O S \n");
			System.out.println("Nombre..........: ");
			String nom = sc.nextLine();
			
			System.out.println("Apellido........: ");
			String ape = sc.nextLine();
			
			System.out.println("Género [M-F]....: ");
			String gen = sc.nextLine();
			
			System.out.println("Edad [15-30]....: ");
			int ed = sc.nextInt();
			
			Alumno alu = new Alumno(nom, ape, gen, ed);
			
			pw.println("Datos Registrados");
			pw.println("= = = = = = = = = ");
			
			pw.println("Nombre y Apellido..........: " + alu.NombreCompleto());
			pw.println("Género.....................: " + alu.MostrarGenero());
			
			System.out.println("El archivo fue creado correctamente...");
			
		} catch(Exception ex1) {
			ex1.printStackTrace();
		} finally {
			//Cierre del archivo
			try {
				if (archivo != null)
					archivo.close();
				
			}catch (Exception ex2) {
				ex2.printStackTrace();
			}
		}
		

	}

}

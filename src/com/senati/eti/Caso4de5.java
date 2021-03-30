package com.senati.eti;


import com.senati.eti.model.Publicacion;

public class Caso4de5 {

	public static void main(String[] args) {
		Publicacion [] Listado=new Publicacion[5];
		
		Listado[0]=new Publicacion("Los Perros Hambrientos","Ciro Alegria",
				"1");
		Listado[1]=new Publicacion("Tradiciones Peruanas","Ricardo Palma",
				"1");
		Listado[2]=new Publicacion("Informatica Global","Bill Gates",
				"2");
		Listado[3]=new Publicacion("Los Heraldos Negros","Cesar Vallejo",
				"1");
		Listado[4]=new Publicacion("Rev. Dig. Merca2.0","Mark Zuckerberg",
				"2");
		System.out.println("LISTA DE PUBLICACIONES");
		System.out.println("=========================");
		System.out.println("N.\tTitulo\t\t\tAutor\t\tTipo");
		System.out.println("==\t======\t\t\t=====\t\t=====");
		int a=1;
		for(Publicacion e: Listado) {	
			System.out.println(a+"\t"+e.getTitulo()+"\t"+
			e.getAutor()+"\t"+e.getTipo());
			a++;
		}
	}

}

package com.senati.eti.model;

public class Publicacion {
	public Publicacion(String obra,String nom,String tipo) {
		autor=nom;
		titulo=obra;
		Tipo=tipo;
	}
	public String getAutor() {//get
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getTipo() {
		if(Tipo.equals("1")) {
			return "Libro";
		}else {
			return "Revista";
		}
	}
	private String autor;
	private String titulo;
	private String Tipo;
}

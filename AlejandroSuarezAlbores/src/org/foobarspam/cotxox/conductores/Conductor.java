package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

	// Attributes

	private String nombre = "a la espera de nombre";
	private String matricula = "matricula sin especificar";
	private String modelo = "modelo sin decidir";
	private ArrayList<Integer> valoraciones = new ArrayList<>();
	private double valoracionMedia = 0.0;
	private Boolean ocupado = true;

	// Constructor

	public Conductor(String nombre) {
		this.nombre = nombre;
	}

	// Sets & Gets

	public String getNombre() {
		return this.nombre;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setValoracion(int valoracion) {
		valoraciones.add(valoracion);
		this.actualizarMedia();
	}

	public ArrayList<Integer> getValoraciones() {
		return valoraciones;
	}

	public void setValoracionMedia(double media) {
		this.valoracionMedia = media;
	}

	public double getValoracionMedia() {
		return this.valoracionMedia;
	}

	public Boolean isOcupado() {
		return this.ocupado;
	}

	public void ocupar() {
		this.ocupado = true;
	}

	public void liberar() {
		this.ocupado = false;
	}

	public double getValoracion() {
		return this.valoracionMedia;
	}

	
	//Main method
	
	public void actualizarMedia() {

		double suma = 0.0;

		for (Integer valoracion : this.getValoraciones()) {
			suma += valoracion;
		}
		
		double media = suma / this.getValoraciones().size();
		this.setValoracionMedia(media);
	}
}

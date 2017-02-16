package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

	private String nombre = "a la espera de nombre";
	private String matricula = "matricula sin especificar";
	private String modelo = "modelo sin decidir";
	private ArrayList<Integer> valoraciones = new ArrayList<>();
	private double valoracionMedia = 0.00;
	
	public Conductor(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setValoracion(int valoracion){
		valoraciones.add(valoracion);
		this.actualizarMedia();
	}
	
	public ArrayList<Integer> getValoraciones(){
		return valoraciones;
	}
	
	public void setValoracionMedia(double media){
		this.valoracionMedia = media;
	}
	
	public void actualizarMedia(){
		
		int suma = 0;
		
		for(Integer valoracion : this.getValoraciones()){
			suma = suma + valoracion;
		}
		int longitud = this.getValoraciones().size();
		double media = suma / longitud;
		this.setValoracionMedia(media);
	}
	
	public double getValoracionMedia(){
		return this.valoracionMedia;
	}
	
}

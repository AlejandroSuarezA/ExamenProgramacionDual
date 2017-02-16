package org.foobarspam.cotxox.conductores;

public class Conductor {

	private String nombre = "";
	private String matricula = "";
	
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
	
}

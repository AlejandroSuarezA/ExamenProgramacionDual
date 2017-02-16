package org.foobarspam.cotxox.carrera;

import java.util.ArrayList;

import org.foobarspam.cotxox.tarifa.Tarifa;
import org.foobarspam.cotxox.conductores.*;

public class Carrera {
	private String tarjetaCredito = "No se ha insertado tarjeta";
	private String origen = "punto de origen";
	private String destino = "punto de destino";
	private double distancia = 0.0;
	private int tiempoEsperadoMinutos = 0;
	private Conductor conductor = null;
	private double costeTotal = 0.00;
	private int propina = 0;
	
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito = tarjetaCredito;
		
	}
	
	public void setOrigen(String origen){
		this.origen = origen;
	}
	
	public void setDestino(String destino){
		this.destino = destino;
	}
	
	public void setDistancia(double distancia){
		this.distancia = distancia;
	}
	
	public void setTiempoEsperado(int tiempoEsperado){
		this.tiempoEsperadoMinutos = tiempoEsperado;
	}
	
	public String getOrigen(){
		return this.origen;
	}
	
	public String getDestino(){
		return this.destino;
	}
	
	public String getTarjetaCredito(){
		return this.tarjetaCredito;
	}
	
	public double getDistancia(){
		return this.distancia;
	}
	
	public double getTiempoEsperado(){
		return this.tiempoEsperadoMinutos;
	}
	
	public double getCosteEsperado(){
		
		double distancia = this.getDistancia();
		double tiempo = this.getTiempoEsperado();
		
		return Tarifa.getCosteTotalEsperado(tiempo, distancia);
		
	}
	
	public void setConductor(Conductor conductor){
		this.conductor = conductor;
	}
	
	public void asignarConductor(PoolConductores pool){
		this.setConductor(pool.asignarConductor());
		
	}
	
	public void realizarPago(double precio){
		this.costeTotal = precio;
	}
	
	public double getCosteTotal(){
		return this.costeTotal;
	}
	
	public void recibirPropina(int propina){
		this.propina = propina;
	}
	
	public int getPropina(){
		return this.propina;
	}
	
	public void liberarConductor(){
		this.conductor.liberar();
	}

	public Conductor getConductor(){
		return this.conductor;
	}
}

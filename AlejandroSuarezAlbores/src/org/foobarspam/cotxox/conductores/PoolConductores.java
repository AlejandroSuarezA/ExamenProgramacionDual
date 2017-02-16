package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PoolConductores {
	
	private ArrayList<Conductor> poolConductores = new ArrayList<>();
	
	
	public PoolConductores(ArrayList<Conductor> pool){
		
		this.poolConductores = pool;
		
	}
	
	public Conductor asignarConductor(){
		int pilotoNumero = ThreadLocalRandom.current().nextInt(0, this.poolConductores.size());
		Conductor pilotoAsignado = null;
		
		while(pilotoAsignado == null){
			if(this.poolConductores.get(pilotoNumero).isOcupado() == true){
				pilotoAsignado = this.poolConductores.get(pilotoNumero);
			}
			else{
				pilotoNumero = ThreadLocalRandom.current().nextInt(0, this.poolConductores.size());
			}
		}
		return pilotoAsignado;
	}
	

}

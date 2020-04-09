/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Cochera {
    
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private int capacidad = vehiculos.size(); 
    
    public synchronized void estacionar(Vehiculo v){
            try{
                while (capacidad == 10) {
                    System.out.println("COCHERA LLENA!!!\n");
                    wait();
		}
            }catch(InterruptedException ex){
                if(capacidad < 10){
			if(vehiculos.getTipo() == "Camión") {
				capacidad = capacidad + 2;
			}else {				
				capacidad = capacidad + 1;
			}	
			vehiculos.add(v);                    
                }
                notifyAll();
            }
    }
    
    
    public synchronized void retirar(Vehiculo v){
		try {
			while (vehiculos.isEmpty()) {
				System.out.println("COCHERA VACÍA!!!\n");
				wait();
			}
		} catch (Exception e) {	System.out.println(e.getMessage()); }

 		if (vehiculos.size() > 0 ) {     	 				
			int indice = util.getValorRandom(vehiculos.size());    	
			if(vehiculos.get(indice).getTipo() == "Camión") {
				capacidad = capacidad - 2;
			}else {
				
				capacidad = capacidad - 1;
			}
			System.out.println("Salió un " + vehiculos.get(indice).getTipo() + " con patente " + vehiculos.get(indice).getPatente() + ".");
			vehiculos.remove(vehiculos.get(indice));
		}
                notifyAll();
        
    }
    
}

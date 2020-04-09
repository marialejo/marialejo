/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author 
 */
public class Camion extends Vehiculo {
    public int tamaño = 2;
    public int tonelaje;
    
    public Camion(int patente, int tonelaje){
        super();
        this.tonelaje = tonelaje;
    }
        
    public int getTonelaje(){
        return tonelaje;
    }
    
    public void setTonelaje(int tonelaje){
        this.tonelaje = tonelaje;
    }
    
    @Override
    public int getTamaño(){
        return tamaño;
    }
    
}

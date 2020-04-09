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
public class Auto extends Vehiculo {
    public int tamaño = 1;
    public int plazas;
    
    public Auto(int patente, int plazas){
        super();
        this.plazas = plazas;
    }
    
    public int getPlazas(){
        return plazas;
    }
    
    public void setPlazas(int plazas){
        this.plazas = plazas;
    }
    
    @Override
    public int getTamaño(){
        return tamaño;
    }
}

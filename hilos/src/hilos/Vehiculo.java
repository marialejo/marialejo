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
public abstract class Vehiculo {
    private int patente;
    
    public int getPatente(){
        return patente;
    }
       
    public void setPatente(int patente){
        this.patente = patente;
    }
    
    public abstract int getTamaño();
    
    public void run();
}

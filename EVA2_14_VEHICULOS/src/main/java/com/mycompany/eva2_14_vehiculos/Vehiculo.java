/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_14_vehiculos;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    private int Velocidad = 0;

    public Vehiculo() {
    }

    public Vehiculo(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
    
    public void acelerar(int ajuste){
        Velocidad += ajuste;
    
    }
    
    

  
}

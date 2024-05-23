/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_14_vehiculos;

/**
 *
 * @author Usuario
 */
public class Automovil extends Vehiculo{
    private int Puertas;

    public Automovil() {
        super();
    }

    public Automovil(int Puertas, int Velocidad) {
        super(Velocidad);
        this.Puertas = Puertas;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
    }

    

    }

  
     
    
    
    
    
    


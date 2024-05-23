/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_14_vehiculos;

/**
 *
 * @author Usuario
 */
public class Motocicleta extends Vehiculo{
    
    private int Velocidad;
    private int CC;

    public Motocicleta() {
        super();
        
    }

    public Motocicleta(int CC, int Velocidad) {
        super(Velocidad);
        this.Velocidad = Velocidad;
        this.CC = CC;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getPuertas() {
        return CC;
    }

    public void setPuertas(int Puertas) {
        this.CC = Puertas;
    }

   

    
    
}

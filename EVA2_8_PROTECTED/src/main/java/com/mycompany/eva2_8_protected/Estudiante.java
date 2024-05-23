/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_8_protected;

import prueba.Persona;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona {
    private String noControl;

    public Estudiante() {
    }

    public Estudiante(String noControl, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    public void imprimiDatos(){
        System.out.println("Nombre..." + nombre );
        System.out.println("Apellidos..." + apellidos );
        System.out.println("Edad..." + edad );
        System.out.println("Numero de control..." + noControl );
        
    }
    
    
    
    
}

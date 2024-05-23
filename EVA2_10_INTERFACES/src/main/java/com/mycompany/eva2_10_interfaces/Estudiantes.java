/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_10_interfaces;

/**
 *
 * @author Usuario
 */
public class Estudiantes extends Persona implements Datos, generarAnnio{
    private String noControl;

    public Estudiantes() {
        super();
        this.noControl = "...";
    }


    public Estudiantes(String noControl, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre..." + getNombre());
        System.out.println("Apellidos..." + getApellidos());
        System.out.println("Edad..." + getEdad());
    }

    @Override
    public String generarNombreCom() {
    
        
    
        return null;
    
        
    
    }

    @Override
    public int generarAnnioNac() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
    
    
    
     
    
    
}

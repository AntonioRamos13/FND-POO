/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_super;

/**
 *
 * @author Usuario
 */
public class Estudiantes extends Persona{

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    private String noControl;
    private String carrera;
    
    
    public Estudiantes(){
        super();
        this.noControl = "..."; 
        this.carrera = "...";     
    
    }
    public Estudiantes(String nombre, String apPaterno, String apMaterno, int edad, char genero, String noControl, String carrera){
        super(nombre, apPaterno, apMaterno, edad, genero, noControl, carrera);
        this.noControl = noControl;
        this.carrera = carrera;
    
    }
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Numero de control" + noControl);
        System.out.println("Carrera" + carrera);
    }
    
    
}

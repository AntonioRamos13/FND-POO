/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_super;

/**
 *
 * @author Usuario
 */
public class Persona {
    
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private char genero;
    private String noControl;
    private String Carrera;

    public Persona() {
        this.nombre = "...";
        this.apPaterno = "...";
        this.apMaterno = "...";
        this.edad = 0;
        this.genero = '_';
        this.noControl = "...";
        this.Carrera = "...";
    }

    public Persona(String nombre, String apPaterno, String apMaterno, int edad, char genero, String noControl, String Carrera) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.genero = genero;
        this.noControl = noControl;
        this.Carrera = Carrera;
    }

    

    void imprimirDatos() {
        
    }
    
}

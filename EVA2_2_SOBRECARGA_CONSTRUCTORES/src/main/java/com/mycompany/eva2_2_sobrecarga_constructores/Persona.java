/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_sobrecarga_constructores;

/**
 *
 * @author Usuario
 */
class Persona {
     public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    private String nombre;
    private String apellidos;
    private int edad; 
    
    public Persona(){
        nombre = "SIN NOMBRE";
        apellidos = "SIN APELLIDOS";
        edad = 0;        
    }
    public Persona (String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        
            
    
    }
    public void imprimirDatos(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellidos:" + apellidos);
        System.out.println("Edad;" + edad);
        
    }
    
}

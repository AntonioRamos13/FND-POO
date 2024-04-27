/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_examen_practico;

/**
 *
 * @author Usuario
 */
public class Empleado  {
    String nombre;
    String apellido;
    

    public Empleado() {
        super();
        this.nombre = "...";
        this.apellido = "...";
    }

    public Empleado(String nombre, String apellido, int salario) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        
  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void imprimirDatos(){
    }
    
}

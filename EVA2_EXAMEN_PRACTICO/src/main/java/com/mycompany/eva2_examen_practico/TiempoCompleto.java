/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_examen_practico;

/**
 *
 * @author Usuario
 */
abstract
public class TiempoCompleto extends Empleado{
    int Salario;

    public TiempoCompleto(int Salario, String nombre, String apellido, int salario) {
        super(nombre, apellido, salario);
        this.Salario = Salario;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    

        

    }
    
    
    
    


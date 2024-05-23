/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_vehiculo;

/**
 *
 * @author Usuario
 */
public class Vehiculo {

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    private String marca;
    private String modelo;       
    private String color;     
    private int año;
    
    public Vehiculo(){
        marca = "SIN MARCA";
        modelo = "SIN MODELO";
        color = "TRANSPARENTE";
        año = 0;
                
   
    
    }
    public Vehiculo(String marca, String modelo, String color, int año){
        this.año = año;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    public void imprimirDatos(){
        System.out.println("Marca" + marca);
        System.out.println("MOdelo" + modelo );
        System.out.println("Color" + color);
        System.out.println("Año" + año);
        

}
        }


   


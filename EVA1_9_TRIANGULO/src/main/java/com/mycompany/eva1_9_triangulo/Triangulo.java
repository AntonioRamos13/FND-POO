/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_9_triangulo;

/**
 *
 * @author Usuario
 */
public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(){
        base = 0;
        altura = 0;
    
    }
    public double getBase(){
        return base; 
    }
    public double getAltura(){
        return altura;
    } 
                        
    public double calcularArea(){
        return (base * altura) / 2;
        
    }
    public double calcularHipotenusa(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    public double calcularPerimetro(double calcularHipotenusa){
        double peri;
        peri = base + altura + calcularHipotenusa;
        return 0;
    }
    public void imprimirDatos(){
        System.out.println("El area del trinagulo es..." + calcularArea());
    
    }
}

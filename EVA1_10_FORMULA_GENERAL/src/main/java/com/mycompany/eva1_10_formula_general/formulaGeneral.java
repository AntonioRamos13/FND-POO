/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_10_formula_general;

/**
 *
 * @author Usuario
 */
public class formulaGeneral {
    
    private double A;
    private double B;
    private double C;
   

    public formulaGeneral(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    
    
    public formulaGeneral(){
        A = 0;
        B = 0;
        C = 0;
    }
    
    public double setA(double valor){ 
       A = valor; 
        return 0;
    }
    
    public double getA(){
       return A; 
    }
    
    public double setB(double valor){
       B = valor; 
        return 0;
    }
    
    public double getB(){
       return B;
    }
    public double setC(double valor){
       C = valor; 
        return 0;
    }
    
    public double getC(){
       return C;
    }       
}

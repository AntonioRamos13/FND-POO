/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_sobrecarga_metodos;

/**
 *
 * @author Usuario
 */
public class EVA2_1_SOBRECARGA_METODOS {

    public static void main(String[] args) {
        System.out.println("La suma 5 + 4 = " + sumar(5,4));
        System.out.println("La suma 5.3 + 4.1 = " + sumar(5.3,4.1));
        System.out.println("La suma Hola + Mundo = " + sumar("Hola","Mundo"));
        sumar();
    }
    
    public static int sumar(int num1, int num2){
    
    return num1 + num2;    
    }
     public static double sumar(double num1, double num2){
    
    return (double) (num1 + num2);    
    }
     public static String sumar(String num1, String num2){
    
    return num1 + num2;
    }
     public static void sumar(){
            System.out.println("suma");

}
    
     
}

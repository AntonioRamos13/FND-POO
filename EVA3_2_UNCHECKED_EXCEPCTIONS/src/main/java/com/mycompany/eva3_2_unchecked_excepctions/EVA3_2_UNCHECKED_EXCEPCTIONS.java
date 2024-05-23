/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_unchecked_excepctions;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_2_UNCHECKED_EXCEPCTIONS {

    public static void main(String[] args) {
     
        Persona persona = null;
        System.out.println(persona.toString());

        int arreglo[] = new int[10];
        arreglo [15] = 200;
        
        int x = 100, y = 0;
        int resultado = x/y;
        System.out.println(+ resultado);
        
        Scanner captu = new Scanner(System.in);
                int valor = captu.nextInt();



        
        


    }
}

class Persona{}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_finally;

/**
 *
 * @author Usuario
 */ 

import java.util.InputMismatchException;

import java.util.Scanner;

public class EVA3_8_FINALLY {

    public static void main(String[] args) {
        try{
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura un numero");
        int nume = captu.nextInt();
        System.out.println("El valor es..." + nume);
        }catch(InputMismatchException e){
         e.printStackTrace();
        }finally{
            System.out.println("Esta instruccion siempre se ejecuta");
        }
        System.out.println("Fin.");
        }
        
    }


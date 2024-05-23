/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_uso_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_7_USO_EXCEPTION {

    public static void main(String[] args) {
        try{
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num = captu.nextInt();
        }catch(InputMismatchException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
         e.printStackTrace();
    }
        System.out.println("Vuele a intentarlo");
        
    }
}


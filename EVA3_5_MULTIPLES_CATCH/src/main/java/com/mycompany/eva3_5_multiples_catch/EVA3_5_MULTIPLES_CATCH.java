/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_5_MULTIPLES_CATCH {

    public static void main(String[] args) {
        //InputMismatch
        //Arimethic
        try{
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor del numerador");
        int nume = captu.nextInt();
        System.out.println("Valor del divisor");
        int divi = captu.nextInt();
        int resu = nume / divi;
        System.out.println("Resultado" + resu);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
         e.printStackTrace();
        }
        System.out.println("Fin");
    }
}
    
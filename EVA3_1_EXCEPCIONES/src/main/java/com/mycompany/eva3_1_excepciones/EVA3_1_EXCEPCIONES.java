/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_excepciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_1_EXCEPCIONES {

    

public class Main {
    public static void main(String[] args) {
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, ingresa un numero: ");
            int numero = scanner.nextInt();
            System.out.println("Tu edad es: " + numero);
        }
    }
}}


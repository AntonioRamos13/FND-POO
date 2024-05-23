/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_publicaciones;

/**
 *
 * @author Usuario
 */
public class EVA2_7_PUBLICACIONES {

    public static void main(String[] args) {
        Libros libro = new Libros("pepe", "EL pepe", 500, 10);
        libro.imprimirDatos();
        libro. venderCopias(5);
        libro.imprimirDatos();
        libro.ordenarCopias(100);
        libro.imprimirDatos();
    }
}

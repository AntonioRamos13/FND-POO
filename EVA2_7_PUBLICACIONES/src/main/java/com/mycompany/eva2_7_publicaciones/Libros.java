/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_publicaciones;

/**
 *
 * @author Usuario
 */
public class Libros extends Publicaciones {
    private String autor;

    public Libros() {
        super();
        this.autor = "...";        
    }

    public Libros(String titulo, double precio, int copias) {
        super(titulo, precio, copias);
    }

    Libros(String pepe, String el_pepe, int i, int i0) {
        
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
    public void ordenarCopias(int cant){
        int existencias = getCopias();
        setCopias(existencias + cant);
    
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Autor" + autor);
    
    }
    
}

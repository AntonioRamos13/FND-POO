/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_1_7_television;

/**
 *
 * @author Usuario
 */
class TELEVISION {
    private int volumen;
    private int canal;
    private boolean estaEncendida;
    
    public TELEVISION(){
        volumen = 30;
        canal = 5;
        estaEncendida = false;
    }
    
    public void subirVolumen(){
        if (estaEncendida = true)
        volumen += 1;
    }
    public void bajarVolumen(){
        if (estaEncendida = true)
        volumen -= 1;
    }
    public void subirCanal(){
        if (estaEncendida = true)
         canal += 1;
    }
    public void bajarCanal(){
        if (estaEncendida = true)
         canal -= 1;
    }
    public void cambiarCanal (int noCanal){
        if (estaEncendida = true)
        canal = noCanal;
    }
    public void power(){
       if( estaEncendida = true) estaEncendida = false;
       else estaEncendida = true;
       
    }
    public void imprimirConfig(){
        System.out.println("volumen" + volumen);
        System.out.println("canal" + canal);
        System.out.println("estaEncendida" + estaEncendida);
    
    }
    
}


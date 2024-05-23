/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class TELEVISION {
    private int volumen;
    private int canal;
    private boolean estaEncendida;
    
    public void subirVolumen(){
        volumen += 1;
    }
    public void bajarVolumen(){
        volumen -= 1;
    }
    public void subirCanal(){
         canal += 1;
    }
    public void bajarCanal(){
         canal -= 1;
    }
    public void cambiarCanal (int noCanal){
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

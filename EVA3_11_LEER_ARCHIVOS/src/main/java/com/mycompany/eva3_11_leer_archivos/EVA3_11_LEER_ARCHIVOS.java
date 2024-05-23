/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_11_leer_archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Usuario
 */
public class EVA3_11_LEER_ARCHIVOS {
    final static String miRuta = "C:\\Users\\Usuario.DESKTOP-PNO9JN7\\OneDrive\\Documents\\archivos_texto";

    public static void main(String[] args) {
        try {
            readFilesWithFiles(miRuta);
            
        } catch (Exception e) {
        }
    }
    
    public static void readFilesWithFiles(String ruta) throws IOException{
        System.out.println("...");
        Path path = Paths.get(miRuta);
        byte[] datos = Files.readAllBytes(path);
        System.out.println(new String (datos));
        
        
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_12_escribir_archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Usuario
 */
public class EVA3_12_ESCRIBIR_ARCHIVOS {
    final static String miRuta = "C:\\Users\\Usuario.DESKTOP-PNO9JN7\\OneDrive\\Documents\\archivos_texto";


    public static void main(String[] args) {
        try {
            writeUsingFiles(miRuta + "...", "...");
            writeUsingFileWriter(miRuta + "...", "...");
                   
            
        } catch (IOException ex) {
             ex.printStackTrace();
        }
  
        
        
    }
    public static void writeUsingFiles(String ruta,String datos) throws IOException{
        Path path = Paths.get(ruta);
        Files.write(path, datos.getBytes());
    
    }
    public static void writeUsingFileWriter (String ruta,String datos) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
                
    
    }
}

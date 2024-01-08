/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Michelle
 */
public class datos {
    public void InsertarEnArchivo(String []finalE) {
        try{
           String ruta = "C:\\Users\\Michelle\\Documents\\NetBeansProjects\\Partidos futbol\\src\\datos\\Partidos.txt";
           File file = new File(ruta);
           FileWriter fw = new FileWriter(file);
           BufferedWriter bw = new BufferedWriter(fw);
            if (!file.exists()){
                file.createNewFile();

            }  
            for(int i=0;i<finalE.length;i++){
                if(finalE[i]!=null){
                    bw.write(finalE[i]+"\n");
                }
            }
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

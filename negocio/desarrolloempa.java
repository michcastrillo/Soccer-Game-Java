/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.ArrayList;
import java.util.Random;
import objetos.*;
import datos.datos;
/**
 *
 * @author Michelle
 */

public class desarrolloempa {
    datos datos = new datos();
    public int random(String []puntos) {
        int result=0;
        int ppe = Integer.parseInt(puntos[0]);
        int pse = Integer.parseInt(puntos[1]);
        if(ppe>pse){
            result = 1;
        }else if(ppe<pse){
            result =2;
        }else if(ppe==pse){
            result = 3;
        }
        return result;
    }
    public void pasar(String[] finalE){
        datos.InsertarEnArchivo(finalE);
    }
}

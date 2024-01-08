/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;

/**
 *
 * @author Michelle
 */
public class emparejados { 
    public int ganados;
    public int perdidos;
    public int empates;

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public static ArrayList getListaEquipos() {
        return listaEquipos;
    }

    public static void setListaEquipos(ArrayList listaEquipos) {
        emparejados.listaEquipos = listaEquipos;
    }

    public static ArrayList getListaEmpare() {
        return listaEmpare;
    }

    public static void setListaEmpare(ArrayList listaEmpare) {
        emparejados.listaEmpare = listaEmpare;
    }

    public emparejados(int ganados, int perdidos, int empates) {
        this.ganados = ganados;
        this.perdidos = perdidos;
        this.empates = empates;
    }
    public static ArrayList listaEquipos = new ArrayList<>();
    public static ArrayList listaEmpare = new ArrayList<>();

    
}

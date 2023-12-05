/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin15;

/**
 *
 * @author dam1
 */
public class Futbolista extends SeleccionFutbol {
  
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void xogarPartido(){
        
    }
    
    public void entrenar(){
        
    }

    @Override
    public String toString() {
        return super.toString() +  "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
    
   
    
    
    
}

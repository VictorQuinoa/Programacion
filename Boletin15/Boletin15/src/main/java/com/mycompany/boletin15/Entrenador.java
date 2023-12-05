/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin15;

/**
 *
 * @author dam1
 */
public class Entrenador extends SeleccionFutbol{
    
    private String idFederación;

    public Entrenador(String idFederación, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.idFederación = idFederación;
    }

    public String getIdFederación() {
        return idFederación;
    }

    public void setIdFederación(String idFederación) {
        this.idFederación = idFederación;
    }
    
    public void  dirixirPartido(){
        
    }
    
    public void dirixirEntrenamento(){
        
    }

    @Override
    public String toString() {
        return super.toString() +  "Entrenador{" + "idFederaci\u00f3n=" + idFederación + '}';
    }
    
}

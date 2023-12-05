/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin15;

/**
 *
 * @author dam1
 */
public class Masaxista extends SeleccionFutbol{
    
    private String titulacion;
    private int anoesExperiencia;

    public Masaxista(String titulacion, int anoesExperiencia, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.titulacion = titulacion;
        this.anoesExperiencia = anoesExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnoesExperiencia() {
        return anoesExperiencia;
    }

    public void setAnoesExperiencia(int anoesExperiencia) {
        this.anoesExperiencia = anoesExperiencia;
    }

    public void darMasaxe(){
    
}

    @Override
    public String toString() {
        return super.toString() + "Masaxista{" + "titulacion=" + titulacion + ", anoesExperiencia=" + anoesExperiencia + '}';
    }
    
}

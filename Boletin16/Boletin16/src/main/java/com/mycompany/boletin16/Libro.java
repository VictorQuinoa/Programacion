/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin16;

/**
 *
 * @author dam1
 */
public class Libro extends Publicacion {
    private String prestado;

    /**
     *
     * @param prestado
     * @param codigo
     * @param titulo
     * @param anoPublicacion
     */
    public Libro(String prestado, int codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.prestado = prestado;
    }

    public String isPrestado() {
        return prestado;
    }

    public void setPrestado(String prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString() + "Libro{" + "prestado=" + prestado + '}';
    }
    
    public void devolverAnoPublicacion(){
        
    }
    public void devolverCodigo(){
        
    }
}

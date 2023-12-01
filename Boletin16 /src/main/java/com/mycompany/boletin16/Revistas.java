/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin16;

/**
 *
 * @author dam1
 */
public class Revistas extends Publicacion {
    private int numero;

    public Revistas(int numero, int codigo, String titulo, int anoPublicacion) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "Revistas{" + "numero=" + numero + '}';
    }
    
     public void devolverAnoPublicacion(){
        
    }
     
    public void devolverCodigo(){
        
    }
}

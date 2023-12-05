/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin16;

/**
 *
 * @author dam1
 * @version 1.1
 */
public class Publicacion {
    /**
     * Código,título y año de el artículo
     */
    private int codigo;
    private String titulo;
    private int anoPublicacion;

    /**
     *
     * @param codigo
     * @param titulo
     * @param anoPublicacion
     */
    public Publicacion(int codigo, String titulo, int anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    /**
     * Seters y getters del programa
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    /**
     * To String para mostrar los datos
     * @return
     */
    @Override
    public String toString() {
        return "Biblioteca{" + "codigo=" + codigo + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + '}';
    }

    
    
    
    
    
}

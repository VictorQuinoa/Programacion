 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin04_1;

/**
 *
 * @author dam1
 */
public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    //constructor por defecto
    public Libro () {
       
    } 
       
    //constructor parametrizado

    public Libro(String tit, String aut, int ano, short pag) {
        this.titulo = tit;
        this.autor = aut;
        this.ano = ano;
        this.numPaginas = pag;
       
    }
    //metodos de acceso
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public float getValoracion() {
        return valoracion;
    }
    public void amosar(){
        System.out.append("\n Título ="+titulo + "\n autor:" +autor + "\n numPáginas:"+numPaginas + "\n ano:"+ano);
    }

 


    
     
    
   
            
                    
}

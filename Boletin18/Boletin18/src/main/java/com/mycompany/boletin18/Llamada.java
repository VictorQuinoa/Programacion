/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin18;

/**
 *
 * @author dam1
 */
public class Llamada {
    
    
    
    private int minutos ;
    private float precio;
    private float precioF;
    private String quenda;

    public float getPrecioF() {
        return precioF;
    }

    public void setPrecioF(int precioF) {
        this.precioF = precioF;
    }
   

    public Llamada( String quenda) {
        
        this.quenda = quenda;
    }
    
    

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getQuenda() {
        return quenda;
    }

    public void setQuenda(String quenda) {
        this.quenda = quenda;
    }
    
    public void precioMinuto() {

        minutos=(int) (Math.random()*15);
        
    switch (minutos){ 
        case 1,2,3,4,5:      
            precio = 1*minutos;
            break;         
        case 6,7,8:        
            precio = (int) ( 5+0.80*(minutos-5));        
            break;            
        case 9,10 : 
            precio = (int) ( 7.40+0.70*(minutos-8));
            break;            
        case 11,12,13,14,15:        
            int precio = (int) ( 8.8+0.5*(minutos-10));           
            break;
     }
        System.out.println("Precio sin extra:" + precio);
    }   
    
    public void precioQuenda(){
    
    switch(quenda){       
        case("Domingo"):
            precioF = (int) (precio+(precio*0.03));
            break;            
        case("Mañana"):
            precioF = (int) ( precio+(precio*0.15));
            break;           
        case("Tarde"):
            precioF = (int) ( precio+(precio*0.10));   
            break;
            
                       
            
    }
        System.out.println("Precio=" +precioF);
}     
    
    
     
    
    
   
}

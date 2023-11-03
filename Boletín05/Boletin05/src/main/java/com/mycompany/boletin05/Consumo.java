/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin05;


/**
 *
 * @author dam1
 */
public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
 //constructor defecto
    public Consumo(){
        
    }
 //constructor parametrizado
    public Consumo(float km,float litros,float vMed,float pGAs){
        this.km =km;
        this.litros=litros;
        this.vMed=vMed;
        this.pGas=pGAs;        
    }
 //metodos acceso
   
    public void setkm(float km){
        this.km=km;
    }
    public float getkm (){
        return km;
    }
    
    public void setlitros(float litros){
        this.litros=litros;
    }
    public float getlitros (){
        return litros;
    }
    
    public void setvMed(float vMed){
        this.vMed=vMed;
    }
    public float getvMed (){
        return vMed;
    }
    
    public void setpGas(float pGas){
        this.pGas=pGas;
    }
    public float getpGas (){
        return pGas;
    }    
     public float getTempo() {
        return km/vMed;
    }
    
    public int consumoMedio() {
        return (int) ((litros/km)*100);
    }
    
    public float consumoEuros() {
        return (pGas/km)*100;
    }
    
    
    
  
        
        
    
        
        
    
}

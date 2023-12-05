/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin11_02;

/**
 *
 * @author dam1
 */
public class XogoO {
     public void iniciarXogo(){
        System.out.println("El juego tendra 4 rondas");
        
        for(int a=0; a<4 ; a++){
        int numx= (int) (Math.random()*50+1);
        
        for(int i=0;i<6;i++){
            
            System.out.println("Tienes 6 intentos");
            
        int numero = LerDato.lerIntegerPositivo("Introduce un numero del 1 al 50");
        
        int dist = Math.abs(numx-numero);
             
                                       
         if(numx == numero){
            System.out.println("Has acertado" + +numx + "=" + +numero );
             System.out.println("Nueva ronda.");
        }else if(dist > 20){
            System.out.println("El número esta muy lejos");
        }else if(dist >= 10 || dist <= 20){
            System.out.println("El número esta lejos");
        }else if(dist >= 5 || dist <= 10){
            System.out.println("El número esta cerca");
        }else if(dist < 5){
            System.out.println("El número esta muy cerca");
        }
            
        }
            System.out.println("Se acabo la ronda.");
        }
        System.out.println("Se acabo el juego.");
        }
}

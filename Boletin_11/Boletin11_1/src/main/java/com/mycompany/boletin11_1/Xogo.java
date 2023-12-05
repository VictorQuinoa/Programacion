/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin11_1;

/**
 *
 * @author dam1
 */
public class Xogo {
    public void iniciarXogo(){
        System.out.println("El juego tendra 4 rondas");
        for(int a=0; a<4 ; a++){
        int numx=LerDato.lerIntegerPositivo("Introduce un número a adivinar del 1 al 50");
        int y= LerDato.lerIntegerPositivo("Introduce el numero de intentos");
        if(numx>=1 && numx<=50){
        for(int i=0;i<y;i++){
            
        
        int numero = LerDato.lerIntegerPositivo("Introduce un numero del 1 al 50");
        
        if(numx == numero){
            System.out.println("Has acertado" + +numx + "=" + +numero );
        }
        
         if(numx < numero){
            System.out.println("El número es mas bajo");
        }
        
        if(numx > numero){
            System.out.println("El número es mas alto");
        }
        }
            System.out.println("Se acabo la ronda.");
        }else System.out.println("Solo se admiten numeros del 1 al 50");
        
        System.out.println("Se acabo el juego.");
        }
        }
        }
        
        
        
        
      
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin07_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Peso {
    
    public void amosarPeso() {
         Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer peso:");
        Float num1 =sc.nextFloat();
        System.out.println("Introduce el segundo peso:");
        Float num2 =sc.nextFloat();
        System.out.println("Introduce el primer nombre:");
        String nom1 =sc.nextLine();
        System.out.println("Introduce el segundo nombre:");
        String nom2 =sc.nextLine();
        
        if (num1>num2){
        System.out.println("Peso:" + num1);
        System.out.println("Nome" + nom1);
        System.out.println("Diferencia:" + (num1-num2));
        }
        else{
        System.out.println("Peso:" + num2);
        System.out.println("Nome:" + nom2);
        System.out.println("Diferencia:" + (num2-num1));
        }
   
        
    }   
    }
    


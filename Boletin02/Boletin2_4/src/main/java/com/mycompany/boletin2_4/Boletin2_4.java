/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin2_4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1,numero2,suma,resta,multiplicacion,division;
        System.out.println("Escribe el primer número:");
        numero1 = sc.nextDouble();
        System.out.println("Escribe el segundo número");
        numero2 =sc.nextDouble();
        suma=numero1 + numero2;
        resta=numero1 - numero2;
        multiplicacion=numero1 * numero2;
        division=numero1 / numero2;
        System.out.println("Resultados:"+"\n Suma="+suma+"\n Resta"+resta +"\n Multiplicación="+multiplicacion +"\n División:"+division);    
          
     //double para todos los numeros   
        
                
        
        
    }
}

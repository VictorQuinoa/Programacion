/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin3_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float celsius,constante1=273,constante2=32,kelvin,farenheit;
        System.out.println("Escribe los grados a cambiar:");
        celsius = sc.nextFloat();
        kelvin=celsius + constante1;
        farenheit=celsius + constante2;        
        System.out.println("Grados kelvin="+kelvin + "\n Grados farenheit="+farenheit);
        
        
                
        
    }
}

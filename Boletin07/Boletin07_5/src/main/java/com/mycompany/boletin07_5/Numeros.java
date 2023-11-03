/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin07_5;

/**
 *
 * @author dam1
 */
public class Numeros {

    
    public void amosarMaior(int num1,int num2,int num3) {
        if (num1>num2 & num1>num3)
            System.out.println("O maior é:" + num1);
        else if (num2>num1 & num2>num3)
            System.out.println("O maior é:" + num2);
        else if (num3>num1 & num3>num2) 
            System.out.println("O maior é:"+ num3);
        
    }
}

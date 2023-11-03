/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin09_01;

/**
 *
 * @author dam1
 */
public class Numeros {
     public void amosarNumeros(){
       
     int i=0;
        int positivos=0;
        int negativos=0;
        int ceros=0;

        while(i<10){

            float num;
            num = LerDAtos.lerEnteiro("Introduce un número");

            if(num==0){
                ceros++;
            }else if (num<0){
                negativos++;
            }else{
                positivos++;
            }

            i++;
        }

        System.out.println("Numero de ceros: "+ceros+"\nNumero de negativos: "+negativos+"\nNumeros positivos: "+positivos);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin09_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Soldos {
    public void calcularPorcentaje(){
        
   
    float sueldo;
    int i=0;
    int contadoMenor= 0;
    int contador=0;
    do{
        sueldo=LerDato.lerFloatPositivo("Introduce el sueldo:");
        System.out.println("El sueldo del empleado"+ (i+1) + "es:" + sueldo);
        i++;
        if (sueldo <= 1000 && sueldo >= 1750);{
        contador++;
          float porcentajem =(contador / i) * 100;
          System.out.println("Porcentaje de sueldos entre 1000 y 1750:" +porcentajem);
    }
        if(sueldo < 1000){
            contadoMenor++;
            float porcentaje = (contadoMenor / i) * 100;
            System.out.println("Porcentaje de sueldos menores de 1000:" +porcentaje);
            
        }    
    
   
    
    }while(sueldo != 0);
    
        System.out.println("Fin del cáclculo");
     
}
}
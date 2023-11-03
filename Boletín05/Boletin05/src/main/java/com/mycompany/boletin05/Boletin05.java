/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin05;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin05 {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce los km:");
    float km=sc.nextFloat();
    System.out.println("Introduce los litros:");
    float litros=sc.nextFloat();
    System.out.println("Introduce la velocidad media:");
    float vMed=sc.nextFloat();
    System.out.println("Introduce el precio de la gasolina:");
    float pGas=sc.nextFloat();
    
    //constructor
    Consumo obx = new Consumo();
    obx.setkm(+km);
    obx.setlitros(+litros);
    obx.setvMed(+vMed);
    obx.setpGas(pGas);
    System.out.println("Consumo medio = "+obx.consumoMedio()+"litros/kilometros");
        System.out.println("Velocidade media = "+obx.getTempo()+" Km/h");
        System.out.println("Tiempo viaje = "+obx.consumoEuros()+" Horas");
        
    //Parametrizado
     Consumo obxc = new Consumo(km,litros,vMed,pGas);
    obx.setkm(+km);
    obx.setlitros(+litros);
    obx.setvMed(+vMed);
    obx.setpGas(pGas);
    System.out.println("Consumo medio = "+obxc.consumoMedio()+"litros/kilometros");
        System.out.println("Velocidade media = "+obxc.getTempo()+" Km/h");
        System.out.println("Tiempo viaje = "+obxc.consumoEuros()+" Horas");
    
    }

}
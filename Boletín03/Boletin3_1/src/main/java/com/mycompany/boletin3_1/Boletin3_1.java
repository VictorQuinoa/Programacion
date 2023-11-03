/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin3_1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin3_1 {

   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Double tarifa,pago,porcentaje;
     System.out.println("Escribe la tarifa inicial:");         
     tarifa= sc.nextDouble();
     System.out.println("Escribe el precio pagado");
     pago= sc.nextDouble();
     porcentaje =100-((tarifa-pago)/tarifa*100);
     System.out.println("Porcentaje de descuento:"+porcentaje+"%");
             
             
    }
}

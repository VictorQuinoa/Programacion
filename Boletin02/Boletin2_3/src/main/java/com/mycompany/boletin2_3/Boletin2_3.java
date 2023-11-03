/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin2_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin2_3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float euros,cambio,dolares;
       System.out.println("Escribe los euros a cambiar:");
       euros = sc.nextFloat();
       System.out.println("Escribe el cambio actual:");
       cambio = sc.nextFloat();
       dolares = euros*cambio;
       System.out.println("Dólares="+dolares);    
       //System.out.println(euros+"euros="+(euros * cambio)+"dolares");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin07_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin07_5 {

    public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduce 3 números:");
       Numeros obx = new Numeros();
       obx.amosarMaior(sc.nextInt(), sc.nextInt(), sc.nextInt());
       
    }
}

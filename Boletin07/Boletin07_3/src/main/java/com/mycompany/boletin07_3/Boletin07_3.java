/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin07_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin07_3 {

    public static void main(String[] args) {
        System.out.println("Introduce un múmero:");
        Scanner sc=new Scanner(System.in);
        
        Signo obx= new Signo();
        obx.MostrarSigno(sc.nextInt());
    }
}

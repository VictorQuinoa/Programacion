/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin07_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin07_2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
      
        MaiorResta obx= new MaiorResta();
        System.out.println("Introduce dos números:");
        obx.Restar((sc.nextShort()), sc.nextShort());
        System.out.println();
    }
}

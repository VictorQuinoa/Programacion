/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin03_5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin03_5 {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       double soldo,comision,quilometraxe,bruto,liquido,dietas,ventas;
       System.out.println("Introduce el sueldo:");
       soldo = sc.nextDouble();
       System.out.println("Introduce los kilometros recorridos:");
       quilometraxe = sc.nextDouble();
       System.out.println("Introduce las ventas:");
       ventas = sc.nextDouble();
       System.out.println("Introduce el numero de dias de desplazamiento:");
       dietas = sc.nextDouble();
       bruto =  soldo - (ventas * 0,05 + quilometraxe * 2 + dietas * 30);
       liquido= bruto - (soldo * 0,82 + 36);
       System.out.println("Sueldo bruto)="+bruto + "euros");
       System.out.println("Sueldo bruto)="+liquido + "euros");
       
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin18;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin18 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce a quenda: Domingo/Mañana/Tarde");
        Llamada la = new Llamada(sc.nextLine()); 
        
        la.precioMinuto();
        la.precioQuenda();
        
       
        
    }
}


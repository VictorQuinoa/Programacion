/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin11_1;

import javax.swing.JOptionPane;


public class LerDato {
    public static int lerEnteiro(String mensaxe){
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;
   }
   public static int lerIntegerPositivo(String mensaxe ){
      int numero;
       do {
         numero = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
       }while(numero<=0);
      return numero;
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin09_4;

import javax.swing.JOptionPane;


public class LerDato {
    public static int lerEnteiro(String mensaxe){
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;
   }
   public static float lerFloatPositivo(String mensaxe ){
      float dato;
       do {
         dato = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
       }while(dato<=0);
      return dato;
   }
}

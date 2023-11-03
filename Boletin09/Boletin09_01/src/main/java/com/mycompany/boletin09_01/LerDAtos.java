/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin09_01;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class LerDAtos {
    public static int lerEnteiro(String mensaxe){
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;
   }
}

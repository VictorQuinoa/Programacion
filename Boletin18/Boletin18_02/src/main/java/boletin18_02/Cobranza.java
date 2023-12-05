/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin18_02;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Cobranza {
    public static double calcularPrecioEnvio(double peso, int destino) {

        
        double precioKilo=0;

        
        switch (destino) {
            case 1:
                precioKilo = 24.00;
                break;
            case 2:
                precioKilo = 20.00;
                break;
            case 3:
                precioKilo = 21.00;
                break;
            case 4:
                precioKilo = 10.00;
                break;
            case 5:
                precioKilo = 18.00;
                break;
            default:
		JOptionPane.showMessageDialog(null,"Destino no valido");
                break;
        }

        return peso * precioKilo;
} 
}

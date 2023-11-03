/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin06_2;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin06_2 {

    public static void main(String[] args) {
      
        double meridiano = Double.parseDouble(JOptionPane.showInputDialog("Introduce meridiano : "));
        double paralelo = Double.parseDouble(JOptionPane.showInputDialog("Introduce paralelo : "));
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduce distancia a terra : "));
        Satelite satelite = new Satelite(meridiano, paralelo, distancia);
        satelite.verPosicion();
    }
}

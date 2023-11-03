/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin06_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin06_1 {
    
  public static void main(String[] args) {
      Coche obx= new Coche();
      
  obx.acelerar( Integer.parseInt(JOptionPane.showInputDialog("Introduce la aceleracion:")));
  obx.frenar(Integer.parseInt(JOptionPane.showInputDialog("Introduce la frenada:")));
  JOptionPane.showMessageDialog(null,"Velocidad final = "+obx.getVelocidade());

   
    
    
}
    
}

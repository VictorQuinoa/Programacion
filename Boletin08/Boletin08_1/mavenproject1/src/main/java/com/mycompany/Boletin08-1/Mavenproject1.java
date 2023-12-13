/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
       String nombre = JOptionPane.showInputDialog("Escribe el nombre del producto;:");
		JOptionPane.showMessageDialog(null, nombre);
                
        VentasProductos obx = new VentasProductos();
        obx.mostrarTipoProducto(Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de ventas:")));
        
                
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;



/**
 *
 * @author dam1
 */
public class VentasProductos {
    public void mostrarTipoProducto(int num1){
        
        if (num1<=100)
            System.out.println("Producto de bajo consumo.");
        else if (num1>100 & num1<=500)
            System.out.println("Producto de consumo medio");
        else if (num1>500 & num1<=1000)
            System.out.println("Producto de consumo alto");
        else if (num1>1000)
            System.out.println("Objeto de primera necesidad");
            
        }
                
        
    }


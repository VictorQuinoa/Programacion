/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin_14;

import Partes.Monitor;
import Partes.Procesador;
import Partes.Teclado;

/**
 *
 * @author dam1
 */
public class Boletin_14 {

    


    public static void main(String[] args) {
        Monitor obxM = new Monitor(18f);
        Teclado obxT= new Teclado("aaa");
        Procesador obxP = new Procesador(3.5f);
        Ordenador obxO = new Ordenador(obxM,obxT,obxP,1500);
        
        System.out.println("Datos ordenador:");
        System.out.println(obxO.toString());
        
        System.out.println("Precio ordenador:");
        System.out.println(obxO.getPrecio());
        
        System.out.println("Marca teclado:");
        System.out.println(obxT.getMarca());
        
        System.out.println("Velocidad CPU:");
        System.out.println(obxP.getVelocidad());
         
    }
}

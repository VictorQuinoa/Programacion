/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin16;

/**
 *
 * @author dam1
 */
public class Boletin16 {

    public static void main(String[] args) {
        /**
         * Objetos para mostrar lo creado
         */
        Revistas re = new Revistas(21,12,"aaaa",1999);
        System.out.println(re);
        
        Libro li = new Libro("Si",215,"ccc",2004);
        System.out.println(li);
    }
}

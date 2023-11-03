/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin06_2;

/**
 *
 * @author dam1
 */
public class Satelite {
     private double meridiano ;
     private double paralelo;
     private double distanciaTerra ;

 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 ;
}
public Satelite( double m, double p , double d ) {
    meridiano = m;
    paralelo = p;
    distanciaTerra = d ;

}
public void verPosicion ( ) {

 System.out.println("O satélite atópase  no paralelo : " + paralelo + ", no meridiano : " + meridiano  + ", a unha distancia da terra : " + distanciaTerra);   
}
}

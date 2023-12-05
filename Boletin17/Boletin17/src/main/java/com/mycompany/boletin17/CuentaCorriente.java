/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin17;

/**
 *
 * @author dam1
 */
public class CuentaCorriente extends Conta {

   private final float fixo = (float) 1.5;

    public CuentaCorriente(double numeroConta, double saldo, Persoa cliente) {
        super(numeroConta, saldo, cliente);
    }

  

   

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente{" + '}';
    }
    
}

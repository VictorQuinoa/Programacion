/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin17;

import java.util.logging.Logger;

/**
 *
 * @author dam1
 */
public class CuentaAhorro extends Conta{

    private float interese;

    public CuentaAhorro(float interese, double numeroConta, double saldo, Persoa cliente) {
        super(numeroConta, saldo, cliente);
        this.interese = interese;
    }

   
    
    

    @Override
    public String toString() {
        return super.toString() + "CuentaAhorro{" + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin17;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Conta {
    
    Scanner sc = new Scanner(System.in);
    
    private double numeroConta;
    private double saldo;
    private Persoa cliente;

    public Conta(double numeroConta,double saldo, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
        
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }
    
   
    
    public void ingresarSaldo(){
        System.out.println("Introduce la cantidad a ingresar:");
      saldo = saldo + sc.nextDouble();
}
  
    public void retirarSaldo(){
        if (saldo>0){
        System.out.println("Introduce la cantidad a retirar:");
      saldo = saldo - sc.nextDouble();
        }
        else{
            System.out.println("La cuenta no tiene saldo disponible");
        }
}  

 
    public double actualizarSaldo(){ 
        return saldo;
        
    }
    
    
}

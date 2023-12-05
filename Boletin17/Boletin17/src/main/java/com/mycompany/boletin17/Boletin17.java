/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin17;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         final String cont="Si";    
         final String res;
         
         
         System.out.println("Quieres entrar a una cuenta? Si/No");
            res=sc.nextLine();
            
        do{
          
         final String ret="Retirar";
         final String ing="Ingresar";
         final String re;
         final String end;
         final String sal="Si";
         
         System.out.println("Quieres Ingresar o Retirar?");
            re=sc.nextLine(); 

        System.out.println("Introduce  nombre:");
        System.out.println("Introduce  apellidos:");
        System.out.println("Introduce el nif");
        
        Persoa per = new Persoa(sc.nextLine(),sc.nextLine(),sc.nextDouble());
        
        System.out.println("Introduce el numero de cuenta:");
        System.out.println("Introduce el saldo de la cuenta");
        
        Conta cnt = new Conta(sc.nextDouble(),sc.nextDouble(),per);
           
        
         
            
            
            if (ing.equals(re)){
        cnt.ingresarSaldo();
            }
            
            if (ret.equals(re)){
                cnt.retirarSaldo();
            }
                
        
        System.out.println(cnt.actualizarSaldo());
        
        System.out.println("Quieres terminar?");   
        end=sc.nextLine();

        if (end.equals(sal)){
           break;
        }
        
        
        }while(res.equals(cont));
        
        System.out.println("Fin");
    }
}

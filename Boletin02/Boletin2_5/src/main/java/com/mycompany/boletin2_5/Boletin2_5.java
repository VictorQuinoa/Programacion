//

package com.mycompany.boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
                double constante=1852,metros,millas;
                System.out.println("Escribe las millas que quieras pasar: ");
                millas = sc.nextDouble();
                metros=millas * constante;
                System.out.println("Metros="+metros);
              /*double millas;
              final int VALOR=1852;
              double metros = millas*VALOR;
              System.out,println(millas+"millas="+metros +"metros"); */
    }
}

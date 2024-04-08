/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validador;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Validador implements Validado{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Implementación de la clase anónima para validar si un número es par o impar
        Validador validador = new Validador() {
            @Override
            public boolean validar(int numero) {
                return numero % 2 == 0; // Devuelve true si el número es par
            }
        };
        
        int numero;
        do {
            System.out.print("Ingrese un número (0 para salir): ");
            try {
                numero = scanner.nextInt();
                if (numero != 0) {
                    if (validador.validar(numero)) {
                        System.out.println("El número ingresado es par.");
                    } else {
                        System.out.println("El número ingresado es impar.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next(); // Limpiar el buffer de entrada
                numero = -1; // Asignar un valor inválido para continuar el bucle
            }
        } while (numero != 0);
        
        scanner.close();
        System.out.println("Saliendo del programa.");
    }

    @Override
    public boolean validar(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  }


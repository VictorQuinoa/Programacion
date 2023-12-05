/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin12;

import javax.swing.JOptionPane;


/**
 *
 * @author dam1
 */
public class BOletin12 {
     boolean cerrarPrograma = false;
        
        Garaxe obxG = new Garaxe();

        do{
            
            String opcion = JOptionPane.showInputDialog("Telcee a operacion a realizar \n-Salir\n-Aparcar\n-Desaparcar");
            
            switch (opcion){
                case "Salir":
                    cerrarPrograma = true;
                    break;
                case "Aparcar":
                    obxG.comprovarAparcar();
                    break;
                case "Desaparcar":   
                    obxG.desaparcar();
                    break;
                default:
                    cerrarPrograma = true;
                    break;
            }
            
        }while (cerrarPrograma == false);
        
    }


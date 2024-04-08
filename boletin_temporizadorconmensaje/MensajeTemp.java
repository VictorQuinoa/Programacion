/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_temporizadorconmensaje;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author dam1
 */
public class MensajeTemp {
    
    public void msj(){
    
        int delay=2000;
        ActionListener taskPerformer =new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                
                int i=0;
               do{ 
                System.out.println("Hola");
                i++;
               }while(i<3);
               
               if(i>3){
                   System.out.println("Adios");
                   i++;
               }
                
            }
        };
        new Timer(delay, taskPerformer).start();
}
}

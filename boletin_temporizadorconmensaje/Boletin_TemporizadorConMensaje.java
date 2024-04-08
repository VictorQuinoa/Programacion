
package boletin_temporizadorconmensaje;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Boletin_TemporizadorConMensaje extends MensajeTemp {

    public static void main(String[] args) {
       
        final String[] mensajes = {"hOLA"};
        final int[] cuentaDeMensajes = {0};


        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if (cuentaDeMensajes[0] >= 10) {
                    ((Timer) evt.getSource()).stop();
                    System.exit(0);
                } else {
                    if (cuentaDeMensajes[0] >= 5) {
                        mensajes[0] = "aDIOS";
                    }
                   
                    System.out.println(mensajes[0]);
                    cuentaDeMensajes[0]++;
                }
            }
        };

        Timer timer = new Timer(2000, taskPerformer);
        timer.setRepeats(true);
        timer.start();


        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}


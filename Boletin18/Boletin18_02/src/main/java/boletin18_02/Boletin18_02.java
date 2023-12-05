/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package boletin18_02;

import com.mycompany.boletin18_02.Cobranza;
import javax.swing.JOptionPane;

public class Boletin18_02 {

    public static void main(String[] args) {
            
        int opcionContinuar = 2;

        do {

            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del paquete kg"));

	    if (peso < 5) {

		int destino = Integer.parseInt(JOptionPane.showInputDialog("Seleccione de las posibles opciones de destino: \n1. America del Norte\n2. America Central\n3. America del Sur\n4. Europa\n5. Asia"));
		double precioFinal = Cobranza.calcularPrecioEnvio(peso, destino);
		JOptionPane.showMessageDialog(null,"Costo de envio: " +precioFinal+ " €");

	    }else if(peso > 5){

		JOptionPane.showMessageDialog(null,"El paquete sobrepasa el peso permitido");
		
	    }

            opcionContinuar = JOptionPane.showConfirmDialog(null,"¿Desea terminar la comprobación?");

        } while (opcionContinuar != 0);
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package color;

import javax.swing.SwingUtilities;

/**
 *
 * @author dam1
 */
public class Col {

  
  

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SelectorColor app = new SelectorColor();
                app.setVisible(true);
            }
        });
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectorColor extends JFrame implements ItemListener {
    private JComboBox<String> colorComboBox;
    private JPanel colorPanel;

    public SelectorColor() {
        setTitle("Selector de Colores");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        colorComboBox = new JComboBox<>(new String[]{" ","Rojo", "Verde", "Azul"});
        colorComboBox.addItemListener(this);
        controlPanel.add(new JLabel("Selecciona un color:"));
        controlPanel.add(colorComboBox);

        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(200, 100));
        colorPanel.setBackground(Color.WHITE);

        add(controlPanel, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);
       
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selectedColor = (String) colorComboBox.getSelectedItem();
            switch (selectedColor) {
                case "Rojo":
                    colorPanel.setBackground(Color.RED);
                    break;
                case "Verde":
                    colorPanel.setBackground(Color.GREEN);
                    break;
                case "Azul":
                    colorPanel.setBackground(Color.BLUE);
                    break;
                default:
                    colorPanel.setBackground(Color.WHITE);
                    break;
            }
        }
    }
}




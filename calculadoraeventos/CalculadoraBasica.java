/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraeventos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dam1
 */

    public class CalculadoraBasica extends JFrame {
    private JTextField textField1, textField2;
    private JButton sumButton, subtractButton;
    private JTextArea resultArea;

    public CalculadoraBasica() {
        setTitle("Calculadora Básica");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        textField1 = new JTextField();
        textField2 = new JTextField();
        sumButton = new JButton("Sumar");
        subtractButton = new JButton("Restar");
        resultArea = new JTextArea();
        resultArea.setEditable(false); // Para evitar que se pueda editar manualmente el resultado

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("+");
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarOperacion("-");
            }
        });

        add(textField1);
        add(textField2);
        add(sumButton);
        add(subtractButton);
        add(resultArea);

        setVisible(true);
    }
    private void realizarOperacion(String operador) {
        try {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double resultado;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    resultArea.setText("Resultado: " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    resultArea.setText("Resultado: " + resultado);
                    break;
                default:
                    resultArea.setText("Operador no válido");
            }
        } catch (NumberFormatException ex) {
            resultArea.setText("Error: Introduce números válidos en los campos de texto.");
        }
    }
}

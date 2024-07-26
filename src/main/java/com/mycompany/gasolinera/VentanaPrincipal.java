/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasolinera;

/**
 *
 * @author USER
 */



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        super("Gasolinera - Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JButton btnGerente = new JButton("Ingresar como Gerente");
        btnGerente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirVentanaGerente();
            }
        });

        JButton btnEmpleado = new JButton("Ingresar como Empleado");
        btnEmpleado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirVentanaEmpleado();
            }
        });

        panel.add(btnGerente);
        panel.add(btnEmpleado);

        add(panel);
        setVisible(true);
    }

    private void abrirVentanaGerente() {
        // Implementación para abrir la ventana del gerente (registro de empleados)
        JOptionPane.showMessageDialog(this, "Funcionalidad de gerente no implementada en este ejemplo.");
    }

    private void abrirVentanaEmpleado() {
        // Implementación para abrir la ventana del empleado (mostrar turnos)
        new VentanaTurnos(); // Abre la ventana de turnos para el empleado
    }

    public static void main(String[] args) {
        new VentanaPrincipal();
    }
}

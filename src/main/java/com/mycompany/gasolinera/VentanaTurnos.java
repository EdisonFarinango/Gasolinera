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

public class VentanaTurnos extends JFrame {

    public VentanaTurnos() {
        super("Gasolinera - Turnos de Trabajo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel lblTitulo = new JLabel("Turnos Disponibles");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(lblTitulo, BorderLayout.NORTH);

        // Simulación de datos de turnos (deberían obtenerse de la base de datos)
        String[] turnos = {"Turno 1 (Estación 1)", "Turno 2 (Estación 2)", "Turno 3 (Estación 3)"};

        JList<String> listTurnos = new JList<>(turnos);
        JScrollPane scrollPane = new JScrollPane(listTurnos);
        panel.add(scrollPane, BorderLayout.CENTER);

        listTurnos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton btnSeleccionar = new JButton("Seleccionar Turno");
        btnSeleccionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String seleccion = listTurnos.getSelectedValue();
                if (seleccion != null) {
                    mostrarEstacionTrabajo(seleccion);
                } else {
                    JOptionPane.showMessageDialog(panel, "Seleccione un turno primero.");
                }
            }
        });

        panel.add(btnSeleccionar, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    private void mostrarEstacionTrabajo(String turnoSeleccionado) {
        // Simulación de obtener la estación asignada
        String estacionAsignada = obtenerEstacionAsignada(turnoSeleccionado);
        JOptionPane.showMessageDialog(this, "Estación asignada para el turno:\n" + estacionAsignada);
        new VentanaFacturas(estacionAsignada); // Abre la ventana de facturas para la estación asignada
        dispose(); // Cierra la ventana de turnos
    }

    private String obtenerEstacionAsignada(String turno) {
        // Método de simulación para obtener la estación asignada al turno seleccionado
        if (turno.contains("Estación 1")) {
            return "Estación 1 - Gasolina Extra";
        } else if (turno.contains("Estación 2")) {
            return "Estación 2 - Gasolina Súper";
        } else if (turno.contains("Estación 3")) {
            return "Estación 3 - Diesel";
        }
        return "Estación no encontrada";
    }
}

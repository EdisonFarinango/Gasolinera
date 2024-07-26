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

public class VentanaFacturas extends JFrame {

    private JComboBox<String> comboCombustible;
    private JTextField txtCantidadLitros;
    private JTextField txtMontoTotal;
    private JLabel lblEstacion;

    public VentanaFacturas(String estacionAsignada) {
        super("Gasolinera - Registrar Factura");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        lblEstacion = new JLabel("Estación: " + estacionAsignada);
        panel.add(lblEstacion);
        panel.add(new JLabel()); // Espacio vacío

        JLabel lblTipoCombustible = new JLabel("Tipo de Combustible:");
        comboCombustible = new JComboBox<>(new String[]{"Gasolina Extra", "Gasolina Súper", "Diesel"});
        panel.add(lblTipoCombustible);
        panel.add(comboCombustible);

        JLabel lblCantidadLitros = new JLabel("Cantidad de Litros:");
        txtCantidadLitros = new JTextField();
        panel.add(lblCantidadLitros);
        panel.add(txtCantidadLitros);

        JLabel lblMonto = new JLabel("Monto Total:");
        txtMontoTotal = new JTextField();
        panel.add(lblMonto);
        panel.add(txtMontoTotal);

        JButton btnGuardar = new JButton("Guardar Factura");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarFactura();
            }
        });

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panel.add(btnGuardar);
        panel.add(btnCancelar);

        add(panel);
        setVisible(true);
    }

    private void guardarFactura() {
        // Obtener los datos ingresados por el usuario
        String tipoCombustible = (String) comboCombustible.getSelectedItem();
        String cantidadLitrosStr = txtCantidadLitros.getText();
        String montoTotalStr = txtMontoTotal.getText();

        // Validar que se hayan ingresado todos los datos
        if (tipoCombustible.isEmpty() || cantidadLitrosStr.isEmpty() || montoTotalStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
            return;
        }

        try {
            // Convertir la cantidad de litros y el monto total a números
            double cantidadLitros = Double.parseDouble(cantidadLitrosStr);
            double montoTotal = Double.parseDouble(montoTotalStr);

            // Aquí deberías guardar la factura en la base de datos utilizando JDBC
            // Simulación de mensaje de éxito
            JOptionPane.showMessageDialog(this, "Factura guardada correctamente.");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Formato de número inválido.");
        }
    }

    public static void main(String[] args) {
        new VentanaFacturas("Estación 1 - Gasolina Extra");
    }
}

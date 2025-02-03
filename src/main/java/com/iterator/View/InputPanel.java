package com.iterator.View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.iterator.agregate.NameCollection;

public class InputPanel extends JPanel {
    public InputPanel(NameCollection nameCollection, MainFrame mainFrame) {
        setLayout(new FlowLayout());

        JTextField txtNombre = new JTextField(15);
        JButton btnGuardar = new JButton("Guardar Nombre");
        JButton btnVolver = new JButton("Volver");

        btnGuardar.addActionListener(e -> {
            String nombre = txtNombre.getText().trim();
            if (!nombre.isEmpty()) {
                nameCollection.addName(nombre);
                txtNombre.setText("");
                JOptionPane.showMessageDialog(this, "Nombre guardado.");
            }
        });

        btnVolver.addActionListener(e -> mainFrame.volverAlMenu());

        add(new JLabel("Ingrese Nombre:"));
        add(txtNombre);
        add(btnGuardar);
        add(btnVolver);
    }
}


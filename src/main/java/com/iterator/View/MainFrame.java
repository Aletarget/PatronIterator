package com.iterator.View;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.iterator.agregate.NameCollection;

public class MainFrame extends JFrame {
    private NameCollection nameCollection;
    private JPanel mainPanel;

    public MainFrame() {
        nameCollection = new NameCollection();
        setTitle("Ventana Principal");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        mainPanel = createMainPanel();

        setContentPane(mainPanel);
    }

    private JPanel createMainPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        JButton btnIngresar = new JButton("Ingresar Nombre");
        JButton btnMostrar = new JButton("Mostrar Lista");

        btnIngresar.addActionListener(e -> setPanel(new InputPanel(nameCollection, this)));
        btnMostrar.addActionListener(e -> setPanel(new DisplayPanel(nameCollection, this)));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 1, 10, 10));
        buttonPanel.add(btnIngresar);
        buttonPanel.add(btnMostrar);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 0, 0, 0);
        panel.add(buttonPanel, gbc);

        return panel;
    }

    public void setPanel(JPanel panel) {
        getContentPane().removeAll();
        setContentPane(panel);
        revalidate();
        repaint();
    }

    public void volverAlMenu() {
        setPanel(createMainPanel());
    }
    
}

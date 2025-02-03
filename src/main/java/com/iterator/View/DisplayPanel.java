package com.iterator.View;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.iterator.Iterator.Iterator;
import com.iterator.agregate.NameCollection;

public class DisplayPanel extends JPanel {
    public DisplayPanel(NameCollection nameCollection, MainFrame mainFrame) {
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        
        Iterator<String> iterator = nameCollection.createIterator();
        while (iterator.hasNext()) {
            textArea.append(iterator.next() + "\n");
        }

        JButton btnVolver = new JButton("Volver");
        btnVolver.addActionListener(e -> mainFrame.volverAlMenu());

        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(btnVolver, BorderLayout.SOUTH);
    }
}


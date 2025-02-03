package com.iterator;

import javax.swing.SwingUtilities;

import com.iterator.View.MainFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }

}

package com.company.GUI;

import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {
    public MyFrame(){
        this.setTitle("Elektrownie");
        this.setLayout(new GridLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        GamePanel game = new GamePanel();
        this.add(game);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}

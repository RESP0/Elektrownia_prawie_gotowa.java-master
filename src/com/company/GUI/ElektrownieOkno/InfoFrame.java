package com.company.GUI.ElektrownieOkno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoFrame extends JFrame implements ActionListener {

    JPanel mainPanel;
    JPanel dol;
    JLabel label;
    JButton exit;

    public InfoFrame(){
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.getContentPane().setBackground(Color.white);
        this.setTitle("Informacja");

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(500,300));
        mainPanel.setLayout( new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.white);
        mainPanel.add(Box.createRigidArea(new Dimension(0,218)));
        this.add(mainPanel);
        this.pack();

        dol = new JPanel();
        dol.setLayout(null);
        dol.setBackground(Color.gray);
        dol.setPreferredSize(new Dimension(500,50));

        label = new JLabel("<html>Infoarmacje o danej elektrowni" +
                "<br>Infoarmacje o danej elektrowni" +
                "<br>Infoarmacje o danej elektrowni</html>");

        label.setFont(new Font("Ink Free",Font.BOLD,10));
        label.setForeground(Color.black);
        label.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(label);

        exit = new JButton("Powrot");
        exit.setBounds(200,2,100,40);
        exit.setFont(new Font("Arial black", Font.BOLD, 16));
        exit.setBackground(Color.green);
        exit.addActionListener(this);
        dol.add(exit);
        mainPanel.add(dol);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit){
            this.dispose();
        }
    }
}
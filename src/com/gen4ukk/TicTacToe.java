package com.gen4ukk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

/**
 * Created by gen4ukk on 03.01.2016.
 */
public class TicTacToe extends JFrame implements ActionListener {
TicTacButton jButton1 = new TicTacButton();
TicTacButton jButton2 = new TicTacButton();
TicTacButton jButton3 = new TicTacButton();
TicTacButton jButton4 = new TicTacButton();
TicTacButton jButton5 = new TicTacButton();
TicTacButton jButton6 = new TicTacButton();
TicTacButton jButton7 = new TicTacButton();
TicTacButton jButton8 = new TicTacButton();
TicTacButton jButton9 = new TicTacButton();
JButton jBClean = new JButton();

    TicTacToe(){
        JPanel pane = new JPanel();
        JPanel pane1 = new JPanel();
        JPanel pane2 = new JPanel();
        JPanel pane3 = new JPanel();
        JPanel pane4 = new JPanel();

        GridLayout gl = new GridLayout(1,4);
        pane.setLayout(gl);
        pane.add(pane1);
        pane.add(pane2);
        pane.add(pane3);
        pane.add(pane4);

        GridLayout gl1 = new GridLayout(3,1);
        pane1.setLayout(gl1);

        GridLayout gl2 = new GridLayout(3,1);
        pane2.setLayout(gl2);

        GridLayout gl3 = new GridLayout(3,1);
        pane3.setLayout(gl3);

        GridLayout gl4 = new GridLayout(3,1);
        pane4.setLayout(gl4);


        setContentPane(pane);
        setTitle("TicTakToe");
        setSize(400, 300);

        pane1.add(jButton1);
        pane1.add(jButton2);
        pane1.add(jButton3);

        pane2.add(jButton4);
        pane2.add(jButton5);
        pane2.add(jButton6);

        pane3.add(jButton7);
        pane3.add(jButton8);
        pane3.add(jButton9);

        pane4.add(new JLabel());
        pane4.add(jBClean);
        pane4.add(new JLabel());

        addMouseL();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addMouseL(){
        TicTacButtonIngine button = new TicTacButtonIngine(this);
        jButton1.addMouseListener(button);
        jButton2.addMouseListener(button);
        jButton3.addMouseListener(button);
        jButton4.addMouseListener(button);
        jButton5.addMouseListener(button);
        jButton6.addMouseListener(button);
        jButton7.addMouseListener(button);
        jButton8.addMouseListener(button);
        jButton9.addMouseListener(button);
       jBClean.addActionListener(this);
    }


    @Override
         public void actionPerformed(ActionEvent e) {
        jButton1.setIcon(null);
        jButton2.setIcon(null);
        jButton3.setIcon(null);
        jButton4.setIcon(null);
        jButton5.setIcon(null);
        jButton6.setIcon(null);
        jButton7.setIcon(null);
        jButton8.setIcon(null);
        jButton9.setIcon(null);
    }
}

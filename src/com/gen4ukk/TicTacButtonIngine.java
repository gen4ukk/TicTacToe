package com.gen4ukk;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by gen4ukk on 03.01.2016.
 */
public class TicTacButtonIngine implements MouseListener {
  private TicTacToe parent;
    Icon tik = new ImageIcon("tic.png");
    Icon tak = new ImageIcon("tac.png");

    TicTacButtonIngine(TicTacToe _parent){
        parent = _parent;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

        TicTacButton button = (TicTacButton) e.getSource();

        if (e.getButton()== MouseEvent.BUTTON1){
            System.out.println("++");
            button.setIcon(tik);
        } else if (e.getButton()== MouseEvent.BUTTON3){
            button.setIcon(tak);
            System.out.println("---");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

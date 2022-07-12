package com.brickoutball;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        GameAlgo gameAlgo = new GameAlgo();
        frame.setBounds(10,10,700,600);
        frame.setTitle("Break the brick");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameAlgo);
    }
}
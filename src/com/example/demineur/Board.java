package com.example.demineur;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Board extends JPanel{
	public void paintComponent (Graphics g){
		g.setColor(Color.darkGray);
		g.fillRect(0, 0, 1200, 800);
	}
}
package com.example.demineur;

import java.awt.Color;
import java.awt.Graphics;

import javax.management.MXBean;
import javax.swing.JPanel;



/**
 * Cette classe remplit le cadre
 * Utilisation de la classe Graphic
 */
public class Board extends JPanel{
	int spacing = 5;
	
	
	public void paintComponent (Graphics g){
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, getWidth(), getWidth());
		
		
		for (int i=0; i<16; i++) {
			for (int j=0; j<9; j++) {
				g.setColor(Color.gray);
				if (Move.mx>= spacing+i*80 && Move.mx < spacing+i*80+80-2*spacing && Move.my >= spacing+j*80+80+26 && Move.my < spacing+j*80+80+80-2*spacing) {
					g.setColor(Color.RED);
				}
				g.fillRect(spacing+i*80,spacing+j*80+80, 80-2*spacing, 80-2*spacing);
			}
		}
	}
}
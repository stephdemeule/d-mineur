package com.example.demineur;

import java.util.Iterator;
import java.util.Random;

import javax.swing.JFrame;
/**
 * Cette classe crée le cadre du jeu
 * reprise de la class créé par jon: 
 * @see <a href="https://youtu.be/RFpJp62ZoY8"> https://youtu.be/RFpJp62ZoY8</a>
 */

public class GUI extends JFrame{
	
	Random rand = new Random();
	
	static int [][] mines = new int [16][9];
	
	public GUI () {
		this.setTitle("Démineur");
		this.setSize(1286,829);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 9; j++) {
				if (rand.nextInt(100) <20){
					mines[i][j]=1;
				}
				else {
					mines[i][j]=0;
				}
			}
		}
		
		Board board = new Board();
		this.setContentPane(board);
		
		Move move = new Move();
		this.addMouseMotionListener(move);
		
		Click click = new Click();
		this.addMouseListener(click);
				
	}
}

package com.example.demineur;

import javax.swing.JFrame;
/**
 * Cette classe crée le cadre du jeu
 * reprise de la class créé par jon: 
 * @see <a href="https://youtu.be/RFpJp62ZoY8"> https://youtu.be/RFpJp62ZoY8</a>
 */

public class GUI extends JFrame{
	public GUI () {
		this.setTitle("Démineur");
		this.setSize(1286,829);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		
		Board board = new Board();
		this.setContentPane(board);
		
		Move move = new Move();
		this.addMouseMotionListener(move);
		
		Click click = new Click();
		this.addMouseListener(click);
				
	}
}

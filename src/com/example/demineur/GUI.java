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
	static int [][] neighbours = new int [16][9];
	static boolean [][] revealed = new boolean [16] [9];
	boolean [][] flagged = new boolean [16] [9];

	int neighs = 0;

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
				revealed[i][j]=false;
			}
		}
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 9; j++) {
				neighs=0;
				for (int m = 0; m < 16; m++) {
					for (int n = 0; n < 9; n++) {
						if (!(m==i && n==j)) {
							if (isN(i, j, m, n)== true) {
								neighs++;
							}
						}
					}
					neighbours[i][j]=neighs;
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
	public boolean isN(int mx, int my, int cx, int cy) {
		if (mx-cx <2 && mx-cx>-2 && my-cy <2 && my-cy>-2 && mines[cx][cy]==1) {
			return true;
		}
		return false;
	}
}


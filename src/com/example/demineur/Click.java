package com.example.demineur;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Cette classe gére les clics de souris
 */
public class Click implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		if (inboxX()!= -1 && inboxY() != -1) {
			GUI.revealed[inboxX()][inboxY()]=true;
			if (inboxX()!= -1 && inboxY() != -1) {
				System.out.println("The mousse is in the ["+inboxX()+","+inboxY()+"], Number of mine neighs: "+GUI.neighbours[inboxX()][inboxY()]);
			}else {
				System.out.println("The mousse is not inside of anybox");

			}
		}
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}
		public int inboxX() {
			for (int i=0; i<16; i++) {
				for (int j=0; j<9; j++) {
					if (Move.mx>= Board.spacing+i*80 && Move.mx < i*80+80-Board.spacing && Move.my >= Board.spacing+j*80+106 && Move.my < Board.spacing+j*80+186-Board.spacing) {
						return i;
					}
				}
			}
			return -1;
		}
		public int inboxY() {
			for (int i=0; i<16; i++) {
				for (int j=0; j<9; j++) {
					if (Move.mx>= Board.spacing+i*80 && Move.mx < i*80+80-Board.spacing && Move.my >= Board.spacing+j*80+106 && Move.my < Board.spacing+j*80+186-Board.spacing) {
						return j;
					}
				}
			}
			return -1;
		}
	}




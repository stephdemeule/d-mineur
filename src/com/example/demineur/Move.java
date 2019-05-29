package com.example.demineur;

import java.awt.event.MouseEvent;
	
import java.awt.event.MouseMotionListener;


/**
 * Cette classe gére les mouvements de la souris
 */
public class Move implements MouseMotionListener {

	protected static int mx= -100;
	protected static int my= -100;

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		mx = e.getX();
		my = e.getY();
	}

}

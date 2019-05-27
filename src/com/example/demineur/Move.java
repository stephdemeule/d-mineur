package com.example.demineur;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.management.MXBean;

public class Move implements MouseMotionListener {

	protected static int mx= -100;
	protected static int my= -100;

	

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("The mousse was moved");
		mx = e.getX();
		my = e.getY();
		System.out.println("x: "+mx+" y: "+my);
	}

}

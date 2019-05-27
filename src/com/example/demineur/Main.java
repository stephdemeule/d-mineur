package com.example.demineur;
/**
 * reprise de la class créé par jon: 
 * @see <a href="https://youtu.be/RFpJp62ZoY8"> https://youtu.be/RFpJp62ZoY8</a>
 */
public class Main implements Runnable{
	
	GUI gui = new GUI();

	public static void main (String[]args) {
		new Thread(new Main()).start();
	}

	@Override
	public void run() {
		while (true) {
			gui.repaint();
		}
	}
	
}

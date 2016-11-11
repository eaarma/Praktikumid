package praktikum12;

import java.applet.Applet;
import java.awt.Color;

import com.sun.prism.Graphics;

public class Spiraal extends Applet {

	private Graphics g;

	public void paint(Graphics g) {
		this.g = g;
		joonistaTaust();
		joonistaRing();
	}

	/**
	 * Katab tausta valgega
	 */
	public void joonistaTaust() {
		int w = getWidth();
		int h = getHeight();
		(g).setColor(Color.white);
		g.fillRect(0, 0, w, h);
	}

	/**
	 * Joonistab ringi
	 */
	public void joonistaRing() {
		g.setColor(Color.black);
		int keskkohtX = getWidth() / 2;
		int keskkohtY = getHeight() / 2;
		int raadius = 50;

		for (double nurk = 0; nurk <= Math.PI * 4; nurk = nurk + .03) {
			radius = x += 1;
			int x = (int) (raadius * Math.cos(nurk));
			int y = (int) (raadius * Math.sin(nurk));
			g.fillRect(keskkohtX + x, keskkohtY + y, 2, 2);
		}
	}
}

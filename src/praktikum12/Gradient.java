package praktikum12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Gradient extends Applet {

	@Override
	public void paint(Graphics g) {
		
		int w = getWidth();
		int h = getHeight();
		
		for (int y = 0; y < h; y++) {
			double concentrate = (double) y / h;
			int juice = (int) (concentrate * 255);
			Color color = new Color(juice, 100, 200);
			g.setColor(color);
			
			g.drawLine(0, y, w, y);
		}
		
		
	}
}

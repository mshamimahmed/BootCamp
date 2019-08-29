package Graphics;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Graphics;
public class GraphicsEmogi extends Applet
{
	public void paint(Graphics g)
	{
		
		g.drawRoundRect(20,20,140,100,10,10); 
		g.fillOval(65, 43, 50, 50);
		
		
		g.drawLine(200, 20, 200, 120);
		g.drawLine(200, 20, 300, 120);
		g.drawLine(300, 120, 200, 120);
		
		g.drawOval(20, 150, 150, 150);
		g.fillOval(50, 190, 15, 15);
		g.fillOval(120, 190, 15, 15);
		int x[] = {95,85,106,95};
		int y[] = {215,234,234,215};
		g.drawPolygon(x, y, 4);
		g.drawArc(55, 225, 78, 50, 0, -180);
		g.drawLine(50, 256, 60, 246);
		g.drawLine(128, 245, 139, 256);
		
		
		int x1[] = {203,252,301,252,203};
		int y1[] = {225,176,225,274,225};
		g.fillPolygon(x1, y1, 4);
	}
}

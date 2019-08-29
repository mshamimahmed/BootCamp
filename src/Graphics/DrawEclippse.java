package Graphics;
import java.awt.*;
import java.applet.*;
public class DrawEclippse extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(10, 10, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(100, 10, 75, 50);
		g.setColor(Color.cyan);
		g.drawOval(190, 10, 90, 30);
		g.fillOval(70, 90, 140, 100);
	}
}

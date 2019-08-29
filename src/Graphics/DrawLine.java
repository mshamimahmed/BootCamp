package Graphics;
import java.applet.Applet;
import java.awt.Graphics;
public class DrawLine extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(0, 0, 40, 20);
		g.drawLine(20, 70, 100, 150);
	}
}

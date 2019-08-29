package Graphics;
import java.awt.*;
import java.applet.*;
public class DrawArc extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(10, 40, 70, 70, 0, 75);
		g.fillArc(100, 40, 70, 70, 0, 75);
		g.drawArc(10, 100, 70, 80, 0, 175);
		g.fillArc( 10, 40, 70, 0, 0, 75);
	}
}

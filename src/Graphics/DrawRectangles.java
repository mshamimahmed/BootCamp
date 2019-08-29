package Graphics;
import java.awt.*;
import java.applet.Applet;
public class DrawRectangles extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(10, 20, 60, 50);
		g.fillRect(100, 10, 60, 50);
		g.drawRoundRect(190, 10, 60, 50, 35, 35);
		g.fillRoundRect(70, 90, 140, 100, 40, 40);
	}
}

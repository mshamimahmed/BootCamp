package Graphics;
import java.applet.Applet;
import java.awt.Graphics;
public class HelloShamim extends Applet
{
	String msg="";
	public void init()
	{
		msg = getParameter("Username" );
		if(msg == null)
		{
			msg = "java";
		}
		msg = "Hello " + msg;
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 50, 50);
	}
}

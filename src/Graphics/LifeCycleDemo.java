package Graphics;
import java.applet.Applet;
import java.awt.Graphics;
public class LifeCycleDemo extends Applet
{
	String msg = "";
	public void init()
	{
		msg += "init( ) ->";
	}
	public void start()
	{
		msg +="start( ) ->";
	}
	public void paint(Graphics g)
	{
		msg += "paint( )";
		g.drawString(msg, 20, 20);
	}
	public void stop()
	{
		msg += " ->stop( )";
	}
	public void destroy()
	{
		msg += "-> destroy";
	}
}

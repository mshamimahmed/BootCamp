package Graphics;
import java.applet.Applet;
import java.awt.*;
public class CelciusToFarenheit extends Applet
{
	String msg;
	float celcius,fahrenheit;
	public void init()
	{
		msg = getParameter("Temp");
		celcius =Float.parseFloat(msg);
		System.out.println(celcius);
		fahrenheit = (1.8f*celcius) + 32;
	}
	public void paint(Graphics g)
	{
		g.drawString("Tempreture in fahrenheit:"+fahrenheit, 10, 50);
	}
}

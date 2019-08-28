package com.bridgelab.bootcamp.day7;
import java.awt.Graphics;
import java.applet.Applet;
public class PlotGraph extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(0,0,40,20);
		g.drawLine(20, 70, 100, 150);
	}
}

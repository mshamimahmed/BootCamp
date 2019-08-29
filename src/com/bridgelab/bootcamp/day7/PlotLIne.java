package com.bridgelab.bootcamp.day7;
import java.awt.Graphics;
import java.applet.Applet;
public class PlotLIne extends Applet
{
	public void paint(Graphics g,double[] a)
	{
		g.drawLine(a);
	
	}
	public static void main(String args[])
	{
		double[] a= {20,30,40,50};
		paint(Graphics , a);
	}
}

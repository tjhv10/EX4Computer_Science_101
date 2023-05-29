package GameEx_Final.GameEx_Final;


import GameEx_Final.GameEx_Final.GeoShape;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
/** 
 * This class represents a 2D circle in the plane. Please make sure you update it 
 * according to the GeoShape interface.
 * Ex4: you should update this class!
 * @author Asaly.Saed
 *
 */
public class Circle implements GeoShape {
	private int x;
	private int y;
	private int dx;
	private int dy;
	private int radius;
	private int r;
	private int g;
	private int b;
	public Circle(int x, int y, int radius, int r, int g, int b)
	{
        this.x=x;
		this.y=y;
		this.radius=radius;
		this.r=r;
		this.g=g;
		this.b=b;
	}
	@Override
	public void draw(Graphics g, Component c) {
		g.setColor(new Color( getRed(),getGreen(),getBlue()));
		g.fillOval(getX(), getY(), getRadius(), getRadius());
		g.setColor(new Color(0,0,0));
		g.drawOval(getX(), getY(), getRadius(), getRadius());

	}

	public int getRadius() {
		return this.radius;
	}
	@Override
	public void translateX() {
		this.x+=dx;
	}

	@Override
	public void translateY() {
		this.y+=dy;
	}

	@Override
	public void setColor(int r, int g, int b) {
		this.r=r;
		this.g=g;
		this.b=b;
	}

	@Override
	public boolean intersects(GeoShape g) {
		if (g instanceof Circle)
		{
			if (Math.sqrt((((Circle) g).y-this.y)*(((Circle) g).y-this.y)+(((Circle) g).x-this.x)*(((Circle) g).x-this.x))<=this.radius+((Circle) g).getRadius())
			{return true;}
			else {return false;}
		}
		if (g instanceof Rectangle){
			int testX = this.x,testY = this.y,cx=this.x,rx=g.getX(),rw=((Rectangle) g).getWidth(),cy=this.y,ry=g.getY(),rh=((Rectangle) g).getHeight();
			if (cx < rx)
				testX = rx;
			else if
			(cx > rx+rw) testX = rx+rw;
			if (cy < ry)
				testY = ry;
			else if
			(cy > ry+rh) testY = ry+rh;
			int distX = cx-testX,distY = cy-testY;
			double distance = Math.sqrt( (distX*distX) + (distY*distY) );

			if (distance <= radius) {
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public int getDx() {
		return this.dx;
	}

	@Override
	public void setDx(int dx) {
		this.dx=dx;
	}

	@Override
	public int getDy() {
		return this.dy;
	}

	@Override
	public void setDy(int dy) {
		this.dy=dy;
	}

	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public void setX(int x) {
		this.x=x;
	}

	@Override
	public int getY() {
		return this.y;
	}

	@Override
	public void setY(int y) {
		this.y=y;
	}

	@Override
	public int getRed() {
		return r;
	}

	@Override
	public int getGreen() {
		return g;
	}

	@Override
	public int getBlue() {
		return b;
	}
}

package GameEx_Final.GameEx_Final;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
/**
 * This class represents a 2D axis parallel rectangle.
 * Ex4: you should implement this class!
 * @author Asaly.Saed
 *
 */
public class Rectangle implements GeoShape {
	private int x;
	private int y;
	private int dx;
	private int dy;
	private int r;
	private int g;
	private int b;
	private int height;
	private int width;
	public Rectangle(int x, int y,int width, int height ,int r, int g, int b) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.g = g;
		this.b = b;
		this.height = height;
		this.width = width;
	}
	public void draw(Graphics g, Component c) {
		g.setColor(new Color(getRed(), getGreen(), getBlue()));
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		g.setColor(new Color(0, 0, 0));
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}

	public int getHeight() {
		return this.height;
	}
	public int getWidth() {
		return this.width;
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
		//לא משתמשים בזה במשחק לכן אין צורך לכתוב את זה
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

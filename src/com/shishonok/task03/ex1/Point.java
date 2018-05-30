package com.shishonok.task03.ex1;

/**
 * Class describe a point on the plane.
 * 
 * @version		1	29.05.2018
 * @author Alexander Shishonok
 */
public class Point {
	
	/** x coordinate*/
	private float x;
	/** y coordinate*/
	private float y;
	
	/**
	 * Constructs Point object.
	 */
	public Point() {
		super();
	}

	/**
	 * Constructs Point object that represents a point on the plane.
	 * @param x X-axis coordinate
	 * @param y Y-axis coordinate
	 */
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	/**
	 * Calculate distance from current point to another point
	 * @param p point to
	 * @return distance between points
	 */
	public float calcDistanceTo(Point p) {
		return (float) Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(x);
		result = prime * result + Float.floatToIntBits(y);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Float.floatToIntBits(x) != Float.floatToIntBits(other.x))
			return false;
		if (Float.floatToIntBits(y) != Float.floatToIntBits(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}

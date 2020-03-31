
public class MyCircle {
	private int radius;
	private MyPoint center;
	
	public MyCircle() {
		radius = 1;
		center = new MyPoint(0, 0);
	}
	
	public MyCircle(int x, int y, int radius) {
		center = new MyPoint(x, y);
		this.radius = radius;
	}
	
	public MyCircle(int radius, MyPoint center) {
		this.radius = radius;
		this.center = center;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	public void setCenterX(int x) {
		center.setX(x);
	}
	public int getCenterY() {
		return center.getY();
	}
	public void setCenterY(int y) {
		center.setY(y);
	}
	public void setCenterXY(int x, int y) {
		center.setX(x);
		center.setY(y);
	}
	public void getCenterXY() {
		
	}

	@Override
	public String toString() {
		return "MyCircle [radius=" + radius + ", center=" + center.toString() + "]";
	}
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	public double getCircumference() {
		return Math.PI * this.radius * 2;
	}
	public double distance(MyCircle another) {
		return this.center.distance(another.center);
	}
	
}

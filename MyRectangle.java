
public class MyRectangle {
	private MyPoint topleft;
	private MyPoint bottomright;
	
	public MyRectangle(int x1, int y1, int x2, int y2) {
		topleft = new MyPoint(x1, y1);
		bottomright = new MyPoint(x2,y2);
	}
	
	public MyRectangle(MyPoint topleft, MyPoint bottomright) {
		this.topleft = topleft;
		this.bottomright = bottomright;
	}

	@Override
	public String toString() {
		return "MyRectangle [topleft=" + topleft + ", bottomright=" + bottomright + "]";
	}
	
	public MyPoint getTopRight() {
		return new MyPoint(topleft.getX(), bottomright.getY());
	}
	public MyPoint getBottomLeft() {
		return new MyPoint(topleft.getY(), bottomright.getX());
	}
	
	public double getPerimeter() {
		MyPoint topright = new MyPoint(topleft.getX(), bottomright.getY());
		return 2 * (topleft.distance(topright) + bottomright.distance(topright));
	}
	public double getArea() {
		MyPoint topright = new MyPoint(topleft.getX(), bottomright.getY());
		return topleft.distance(topright) * bottomright.distance(topright);
	}
}

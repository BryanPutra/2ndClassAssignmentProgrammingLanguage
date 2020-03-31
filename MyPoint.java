
public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {
		x = 0;
		y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int [] getXY() {
		return new int []{this.x, this.y};
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public double distance(int givenx, int giveny) {
		double x1 = givenx - this.getX();
		double y1 = giveny - this.getY();
		return Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
	}
	
	public double distance(MyPoint another) {
		return this.distance(another.getX(), another.getY());
	}
	
	public double distance() {
		return this.distance(0, 0);
	}
}

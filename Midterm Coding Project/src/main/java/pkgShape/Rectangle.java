package pkgShape;

public class Rectangle extends Shape implements Comparable<Rectangle >{

	private int iWidth;
	private int iLength;
	
	public Rectangle(int length, int width) {
		super();
		length = iLength;
		width = iWidth;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		return (double) iWidth*iLength;
	}
	
	public double perimeter() {
		return (double) 2*iWidth + 2*iLength;
	}
	
	public int compareTo(Rectangle rec) {
		if(this.area() > rec.area()) {
			return 1;
		}else if(this.area()<rec.area()) {
			return -1;
		}else {
			return 0;
	}
}
}

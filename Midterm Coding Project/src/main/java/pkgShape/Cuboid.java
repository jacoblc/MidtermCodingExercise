package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	
	private int iDepth;
	
	public Cuboid(int iLength, int iWidth, int iDepth) {
		super(iLength, iWidth);
		this.iDepth = iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		return super.area() *iDepth;
	}
	@Override
	public double area() {
		return 2*(super.getiLength()*super.getiWidth()) + 2*(super.getiLength()*iDepth) + 2*(super.getiWidth()*iDepth);
	}
	@Override
	public double perimeter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException("The perimeter method is invalid in this context");
	}
	
	public class SortByArea implements Comparator<Cuboid>{
		
		SortByArea() {
			
		}
		@Override
		public int compare(Cuboid cub1, Cuboid cub2) {
			if(cub1.area()>cub2.area()) {
				return 1;
			}else if(cub1.area()<cub2.area()) {
				return -1;
			}else {
				return 0;
			}
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid> {
		
		SortByVolume(){
	}@Override
		public int compare(Cuboid cub1, Cuboid cub2) {
			if (cub1.volume() > cub2.volume()) {
				return 1;
			}else if(cub1.volume()<cub2.volume()) {
				return -1;
			}else {
				return 0;
			}
		}
	}
}

package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.*;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Cuboid.SortByArea;
import pkgShape.Cuboid.SortByVolume;
import pkgShape.Rectangle;

public class ShapeTest {

	@Test
	public void Rectangle_Test1() {
		Rectangle rec1 = new Rectangle(3, 4);
		assertTrue(rec1 instanceof Rectangle);
	}
	
	@Test
	public void RectanglegetiLength_Test1() {
		Rectangle rec1 = new Rectangle(3, 4);
		assertTrue(rec1.getiLength() == 3);
	}
	
	@Test
	public void RectanglesetiLength_Test1() {
		Rectangle rec1 = new Rectangle(3, 4);
		rec1.setiLength(5);
		assertTrue(rec1.getiLength() == 5);
	}
	
	@Test
	public void RectanglegetiWidth_Test1() {
		Rectangle rec1 = new Rectangle(3, 4);
		assertTrue(rec1.getiWidth() == 4);
	}
	
	@Test
	public void RectanglesetiWidth_Test1() {
		Rectangle rec1 = new Rectangle(3, 4);
		rec1.setiWidth(6);
		assertTrue(rec1.getiWidth() == 6);
	}
	
	@Test
	public void RectangleArea_Test1() {
		Rectangle rec1 = new Rectangle(3, 4);
		assertTrue(rec1.area() == 12.0);
	}
	
	@Test
	public void RectanglePerimeter_Test1() {
		Rectangle rec1 = new Rectangle(4, 8);
		assertTrue(rec1.perimeter() == 24.0);
	}
	
	@Test
	public void RectangleCompareTo_Test1() {
		Rectangle rec1 = new Rectangle(4, 8);
		Rectangle rec2 = new Rectangle(2, 3);
		Rectangle rec3 = new Rectangle(3, 4);
		ArrayList<Rectangle> recList = new ArrayList<Rectangle>();
		recList.add(rec1);
		recList.add(rec2);
		recList.add(rec3);
		Collections.sort(recList);
		assertTrue(recList.get(0).area() == 6);
	}
	
	@Test
	public void Cuboid_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1 instanceof Cuboid);
	}
	
	@Test
	public void CuboidiLength_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.getiLength() == 3);
	}
	
	@Test
	public void CuboidsetiLength_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		cub1.setiLength(2);
		assertTrue(cub1.getiLength() == 2);
	}
	
	@Test
	public void CuboidgetiWidth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.getiWidth() == 4);
	}
	
	@Test
	public void CuboidsetiWidth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		cub1.setiWidth(2);
		assertTrue(cub1.getiWidth() == 2);
	}
	
	@Test
	public void CuboidgetiDepth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.getiDepth() == 5);
	}
	
	@Test
	public void CuboidsetiDepth_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		cub1.setiDepth(6);
		assertTrue(cub1.getiDepth() == 6);
	}
	
	@Test
	public void CuboidArea_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.area() == 94.0);
	}
	
	@Test
	public void CuboidPerimeter_Test1() {
		boolean thrownE = false;
		try {
			Cuboid cub1 = new Cuboid(3, 4, 5);
			cub1.perimeter();
		} catch(UnsupportedOperationException unsupportedOperationException) {
			thrownE = true;
		}
		assertTrue(thrownE);
	}
	
	@Test
	public void CuboidVolume_Test1() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		assertTrue(cub1.volume() == 60.0);
	}
	
	@Test
	public void CuboidCompareTo_Test1() {
		Cuboid cubCompare = new Cuboid(0, 0, 0);
		Cuboid cub1 = new Cuboid(3, 4, 5);
		Cuboid cub2 = new Cuboid(4, 5, 6);
		Cuboid cub3 = new Cuboid(1, 3, 12);
		ArrayList<Cuboid> cubList1 = new ArrayList<Cuboid>();
		cubList1.add(cub1);
		cubList1.add(cub2);
		cubList1.add(cub3);
		SortByArea sortByArea;
		try {
			Class<?> clsSortbyarea = Class.forName("pkg_Shapes.Cuboid$SortByArea");
			Constructor<?> constrSortbyarea = clsSortbyarea.getDeclaredConstructor(new Class[] {Cuboid.class});
			constrSortbyarea.setAccessible(true);
			sortByArea = (SortByArea) constrSortbyarea.newInstance(cubCompare);
			Collections.sort(cubList1, sortByArea);
			assertTrue(cubList1.get(0).area() == 94.0);
			assertTrue(cubList1.get(1).area() == 102.0);
			assertTrue(cubList1.get(2).area() == 148.0);
		} catch (NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		SortByVolume sortByVolume;
		try {
			Class<?> clsSortbyvolume = Class.forName("pkg_Shapes.Cuboid$SortByVolume");
			Constructor<?> constrSortbyvolume = clsSortbyvolume.getDeclaredConstructor(new Class[] {Cuboid.class});
			constrSortbyvolume.setAccessible(true);
			sortByVolume = (SortByVolume) constrSortbyvolume.newInstance(cubCompare);
			Collections.sort(cubList1, sortByVolume);
			assertTrue(cubList1.get(0).volume() == 36.0);
			assertTrue(cubList1.get(1).volume() == 60.0);
			assertTrue(cubList1.get(2).volume() == 120.0);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void CuboidCompareTo_Test2() {
		Cuboid cub1 = new Cuboid(3, 4, 5);
		Cuboid cub2 = new Cuboid(4, 5, 6);
		Cuboid cub3 = new Cuboid(1, 3, 12);
		ArrayList<Cuboid> cubList1 = new ArrayList<Cuboid>();
		cubList1.add(cub1);
		cubList1.add(cub2);
		cubList1.add(cub3);
		Collections.sort(cubList1);
		assertTrue(cubList1.get(0).area() == 94.0);

	}

}

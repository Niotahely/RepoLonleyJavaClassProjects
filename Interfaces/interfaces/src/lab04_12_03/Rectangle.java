package lab04_12_03;

/*
 * Implementa rettangoli con lati paralleli agli assi
 */
public class Rectangle implements Shape {
	/* invariant width > 0 && height > 0 */
	public static final double defaultSize = 1;
	private double width = Rectangle.defaultSize;
	private double height = Rectangle.defaultSize;

	private final Point center = new Point();

	/*
	 * Rettangolo con centro sull'origine degli assi
	 */
	private Rectangle(double width, double height) {
	    this.width = width;
		this.height = height;
	}

	private Rectangle(double width, double height, Point center) {
		this.width = width;
		this.height = height;
		center.move(center.getX(), center.getX());
	}

	/*
	 * Rettangolo con dimensioni di default e centro sull'origine degli assi
	 */
	public Rectangle() {
	}

	/*
	 * Factory method
	 */
	public static Rectangle ofWidthHeight(double width, double height) {
	    return new Rectangle(width, height);
	}

	/*
	 * Factory method
	 */
	public static Rectangle ofWidthHeightCenter(double width, double height, Point center) {
	    return new Rectangle (width, height,center);
	}

	public void move(double dx, double dy) {
	    this.center.move(dx,dy);
	}

	public void scale(double factor) {
		this.width = width/factor;
		this.height = height/factor;
	}

	public Point getCenter() {
	    return this.center;
	}

	public double perimeter() {
		return (width*2+height*2);
	}

	public double area() {
		return (width*height);
	}
}

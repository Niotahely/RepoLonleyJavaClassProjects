package lab04_12_03;

/*
 * Classe singleton, ossia con una sola istanza.
 * 
 * Confronta le figure basandosi sulle loro aree.
 */

public class AreaComparator implements ShapeComparator {

	public static final AreaComparator instance = new AreaComparator();

	private AreaComparator() {
	}

	/* requires shape1 != null && shape2 != null */    
	public int compare(Shape shape1, Shape shape2) {

		if (shape1 == null || shape2 == null){throw new IllegalArgumentException();}
	    int comp = 0;

		if (shape1.area() > shape2.area() ){ comp = 1;}
		else if (shape1.area() < shape2.area() ){ comp = -1;}

		return comp;

	}}



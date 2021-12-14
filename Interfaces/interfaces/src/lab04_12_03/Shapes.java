package lab04_12_03;

public class Shapes {

	/*
	 * restituisce la prima figura maggiore o uguale alle altre in shapes rispetto al comparator comp,
	 * null se shapes e` vuoto
	 * requires shapes != null && comp != null
	 */    
	public static Shape max(Shape[] shapes, ShapeComparator comp) {

		Shape Max = null;
		if(shapes == null || comp == null ){ return null; }

	    for (int i = 0 ; i < shapes.length;i++){
			for (int j =i+1; j < shapes.length;j++){
				if (comp.compare(shapes[i],shapes[j])== 1 || comp.compare(shapes[i],shapes[j])== 0){Max = shapes [i];}
			}
		}
		return Max;
	}

	/*
	 * trasla tutte le figure lungo il vettore (dx,dy)
	 * requires shapes != null
	 */
	public static void moveAll(Shape[] shapes, double dx, double dy) {

		for (Shape shape : shapes) {shape.move(dx, dy);}
	}
    
	/*
	 * scala tutte le figure del fattore factor, senza traslare il loro centro
	 * requires shapes != null && factor > 0
	 */
	public static void scaleAll(Shape[] shapes, double factor) {
		for (Shape shape : shapes) {shape.scale(factor);}
	}
    
	/*
	 * restituisce l'area totale di tutte le figure in shapes
	 * requires shapes != null
	 */
	public static double totalArea(Shape[] shapes) {
		double totalA = 0;
		for (Shape shape : shapes) {
			totalA = shape.area();
		}
		return totalA;
	}}

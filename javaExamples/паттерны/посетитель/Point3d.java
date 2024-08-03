package javaExamples.паттерны.посетитель;

class Point3d extends Point {
	public Point3d ( double x, double y, double z ) {
		this.x = x;
        this.y = y;
        this.z = z;
	}
	public void accept ( Visitor v ) {
		v.visit( this );
	}
	
	private double x;
	public double getX () { return x; }
	
	private double y;
	public double getY () { return y; }
	
	private double z;
	public double getZ () { return z; }
}

package паттерны.поведенческие.посетитель;

interface Visitor {
	public void visit ( Point2d p );
	public void visit ( Point3d p );
}

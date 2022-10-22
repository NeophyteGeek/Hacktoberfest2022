// Shape Inteface
interface Shape {
	public int getArea();
}

class Rectangle implements Shape {
	
	//fields to calculate area
	private int length;
	private int breadth;

	// constructor to initialize values
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// method to calculate area
	public int getArea() {
		return length * breadth;
	}
}

class Circle implements Shape{
	//fields to calculate area
	private int radius;
	
	// constructor to initialize values
	Circle(int radius){
		this.radius = radius;
	}
	
	// method to calculate area
	public int getArea() {
		return (int) Math.PI * radius * radius;
	}
}

 
class Main {
  public static void main(String[] args) {
 
    Shape rectangle = new Rectangle(2, 16);
    System.out.println(rectangle.getArea());

    Shape circle = new Circle(2);
    System.out.println(circle.getArea());
  }
}

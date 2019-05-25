import java.lang.Math;

abstract class Shape {
  abstract void calculateArea();
  double area;
}

class Rectangle extends Shape {
  double x = 10, y = 10;
  void calculateArea() {
    area = x * y;
    System.out.println("Area Rectangle: " + area);
  }
}

class Triangle extends Shape {
  double base = 8, height = 8;
  void calculateArea() {
    area = (base * height)/2;
    System.out.println("Area Triangle: " + area);
  }
}

public class Area {
  public static void main(String args[]) {
    Rectangle rectang = new Rectangle();
    Triangle tri = new Triangle();
    rectang.calculateArea();
    tri.calculateArea();
  }
}

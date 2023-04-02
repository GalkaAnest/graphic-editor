package hw8.try3.graphicEditor;

interface Shape {
    void printName();
}
class Circle implements Shape{
    @Override
    public void printName() {
        System.out.println("Circle");
    }
}
class Square implements Shape {
    @Override
    public void printName() {
        System.out.println("Square");
    }
}
class Rectangle implements Shape{
    @Override
    public void printName() {
        System.out.println("Rectangle");
    }
}

class Triangle implements Shape{
    @Override
    public void printName() {
        System.out.println("Triangle");
    }
}

class Parallelogram implements Shape{
    @Override
    public void printName() {
        System.out.println("Parallelogram");
    }
}

class ShapeName{
    public static void main(String[] args){
        Circle c = new Circle();
        c.printName();
        Square s =new Square();
        s.printName();
        Rectangle r = new Rectangle();
        r.printName();
        Triangle t = new Triangle();
        t.printName();
        Parallelogram p = new Parallelogram();
        p.printName();

    }

}
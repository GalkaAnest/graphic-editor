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

class MainClass{
    public static void main(String[] args) {
        Shape shapeCircle = new Circle();
        Shape shapeSquare = new Square();
        Shape shapeRectangle = new Rectangle();
        Shape shapeTriangle = new Triangle();
        Shape shapeParallelogram = new Parallelogram();

        GraphicEditor.printShapeName(shapeRectangle);
        GraphicEditor.printShapeName(shapeCircle);
        GraphicEditor.printShapeName(shapeParallelogram);
        GraphicEditor.printShapeName(shapeSquare);
        GraphicEditor.printShapeName(shapeTriangle);
    }
}
class GraphicEditor {

    public static void printShapeName(Shape shape){
        shape.printName();
    }

}
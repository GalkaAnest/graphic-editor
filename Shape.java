package hw8.try2;

interface Shape {
    // Abstract methods.
    public int getArea();
    public int getCircumference();
}

class Square implements Shape {
    int side;
    Square(int side) {
        this.side = side;
    }

    public int getArea(){
        return side * side;
    }

    public int getCircumference(){
        return 4 * side;
    }
}

class Rectangle implements Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }

    public int getCircumference(){
        return 2 * (length + width);
    }
}

class JavaInterface {
    public static void main(String[] args) {
        // Create objects of Square and Rectangle class
        Square sq = new Square(10);
        Rectangle rec = new Rectangle(10, 20);

        // Print area of Shapes
        System.out.println("Area of Square: "
                + sq.getArea());
        System.out.println("Area of Rectangle: "
                + rec.getArea());

        // Print circumference of Shapes
        System.out.println("Circumference of Square: "
                + sq.getCircumference());
        System.out.println("Circumference of Rectangle: "
                + rec.getCircumference());
    }
}

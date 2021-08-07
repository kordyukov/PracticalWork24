package com.alpha.work;

public class Runner {
    public void run(){
    WriteShapes(CreateShapes());
    }

    public Shape[] CreateShapes() {
        return new Shape[]{new Rectangle("Red", 2.0, 5.0),
                new Rectangle("White", 5.0, 6.0),
                new Rectangle("blue", 1.0, 2.0),
                new Rectangle("purple", 8.0, 5.0),
                new Circle("White", 5.0),
                new Circle("Red", 4.0),
                new Circle("blue", 3.0),
                new Triangle("White", 3.1, 5.5, 8.5),
                new Triangle("Red", 4, 5, 8)};
    }
    public void WriteShapes(Shape[] shape) {
        for (Shape shape1 : shape) {
             shape1.draw();

        }
    }
}

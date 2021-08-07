package com.alpha.work;

import java.util.Arrays;

public class Runner {
    public void run() throws CloneNotSupportedException {
        Shape[] shapeSort;

    WriteShapes(CreateShapes());
    Rectangle rectangle = new Rectangle("White",25,36);
    Rectangle rectangle1 = new Rectangle("Red",22,15);
        System.out.println("------------------------------------------------------------------------");
     if(rectangle.compareTo(rectangle1)==1)
     {
         System.out.println("Площадь первого прямоугольниа больше ворого!");
     } else {
         System.out.println("Площадь первого прямоугольниа меньше ворого!");
     }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Сорировка по площади с Compaable: ");
     shapeSort = CreateShapes();
      Arrays.sort(shapeSort);
      WriteShapes(shapeSort);

      Arrays.sort(shapeSort,new ShapesComparator());
      System.out.println("----------------------------------------------------------------------");
        System.out.println("Сортировка по цвету с Comparator: ");
      WriteShapes(shapeSort);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Клонирование с использованием clone()");
       Shape shape = new Shape("Red") {
           @Override
           public double calcArea() {
               return 0;
           }
       };
       Shape shape1 = (Shape)shape.clone();
        System.out.println(shape + "hashcode: "+ shape.hashCode());
        System.out.println("clone obj: "+shape1+ "hashcode: "+ shape1.hashCode());
        shape1.setColor("White");
        System.out.println("clone obj new color : " + shape1+ "hashcode: "+ shape1.hashCode());
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Глубоое клонирование: ");
        Shape shape2 = new Shape(shape1) {
            @Override
            public double calcArea() {
                return 0;
            }
        };
        System.out.println("obj "+shape1+ "hashcode: "+ shape1.hashCode());
        System.out.println("clone obj: "+shape2+ "hashcode: "+ shape2.hashCode());




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

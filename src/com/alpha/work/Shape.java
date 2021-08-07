package com.alpha.work;

public abstract class Shape implements Drawable, Comparable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }


    public abstract double calcArea();

    @Override
    public String toString() {
        return "class= Shape " +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void draw() {
        System.out.print("class = "+ this +", color = "+color + ", area = " );
        System.out.printf("%.2f \n", calcArea());
    }

    @Override
    public int compareTo(Object o) {
        if (this.calcArea()>((Shape)o).calcArea()) return 1;
        if (this.calcArea()<((Shape)o).calcArea()) return -1;
        return 0;
    }
}

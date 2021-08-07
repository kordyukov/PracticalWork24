package com.alpha.work;

public abstract class Shape implements Drawable {
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
}

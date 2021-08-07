package com.alpha.work;

public abstract class Shape implements Drawable, Comparable, Cloneable {
    private String color;


    public Shape(String color) {
        this.color = color;
    }

    public Shape(Shape other){
       this.color = new String(other.getColor());
    }

    public Shape() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public String getColor(){
        return color;
    }

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

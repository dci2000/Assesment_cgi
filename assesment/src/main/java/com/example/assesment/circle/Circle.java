package com.example.assesment.circle;



public class Circle{
    private final  Point center;
    private final int radius;



    public Circle(int radius, Point center){
        this.center = center;
        this.radius = radius;

    }

    public boolean is_inside(Point point){
        int pointX = point.getX_coordinates();
        int pointY = point.getY_coordinates();
        int centerX = center.getX_coordinates();
        int centerY = center.getY_coordinates();
        return Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2)
                <= Math.pow(this.radius, 2);

    }

}

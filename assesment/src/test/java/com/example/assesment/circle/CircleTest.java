package com.example.assesment.circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    private Circle circle;
    private Point point;
    private boolean expectedResult;

    private void instance(int radius, Point center, Point point, boolean expectedResult){
        this.circle = new Circle(radius, center);
        this.point = point;
        this.expectedResult = expectedResult;
    }

    @Test
    void positiveValues(){
        instance(5, new Point(4,6), new Point(8,9), true);
        assertEquals(expectedResult, circle.is_inside(point));


    }
    @Test
    void negativeValues(){
        instance(8,new Point(-4,-7), new Point(-5,-3), true);
        assertEquals(expectedResult,circle.is_inside(point));

    }
    @Test
    void pointIsInside(){
        instance(5, new Point(6,7), new Point(8,9), true);
        assertEquals(expectedResult, circle.is_inside(point));

    }
    @Test
    void pointIsOnTheEdge(){
        instance(5, new Point(4,6), new Point(8,9), true);
        assertEquals(expectedResult, circle.is_inside(point));

    }
    @Test
    void pointIsOutside(){
        instance(5, new Point(20,60), new Point(8,9), false);
        assertEquals(expectedResult, circle.is_inside(point));

    }

}
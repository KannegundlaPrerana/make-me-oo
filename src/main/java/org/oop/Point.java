package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getXDistance(Point secondPoint){
        return this.x - secondPoint.x;
    }

    public double getYDistance(Point secondPoint){
        return this.y - secondPoint.y;
    }
}
package com.example.task05;

public class Point {

    private final double X;
    private final double Y;

    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public double getLength(Point point) {
        return Math.sqrt(Math.pow(X - point.X, 2) + (Math.pow(Y - point.Y, 2)));
    }

}

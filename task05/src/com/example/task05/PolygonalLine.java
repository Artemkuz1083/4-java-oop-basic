package com.example.task05;

import java.util.ArrayList;


public class PolygonalLine {

    private final ArrayList<Point> Points;

    public PolygonalLine() {
        this.Points = new ArrayList<>();
    }

    public void setPoints(Point[] points) {
        for (Point point : points) {
            addPoint(point);
        }
    }

    public void addPoint(Point point) {
        Points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        Points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0.0;
        for (int i = 0; i < Points.size() - 1; i++) {
            length += Points.get(i).getLength(Points.get(i + 1));
        }
        return length;
    }
}

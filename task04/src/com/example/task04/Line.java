package com.example.task04;

public class Line {

    private Point P1;
    private Point P2;

    public Line(Point p1, Point p2) {
        this.P1 = p1;
        this.P2 = p2;
    }

    public Point getP1() {
        return P1;
    }

    public Point getP2() {
        return P2;
    }

    public String toString() {
        return P1.toString() + " - " + P2.toString();
    }

    public boolean isCollinearLine(Point p) {
        double slope1 = (double) (P2.getY() - P1.getY()) / (P2.getX() - P1.getX());
        double slope2 = (double) (p.getY() - P1.getY()) / (p.getX() - P1.getX());
        return  slope1 == slope2;
    }
}

package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point end = new Point(3,3);
        Point start = new Point(0,0);
        Point middle = new Point(1,1);
        Line line = new Line(start,end);
        System.out.println(line.isCollinearLine(middle));
        System.out.println(line);
    }
}

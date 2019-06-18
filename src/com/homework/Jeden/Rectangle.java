package com.homework.Jeden;

public class Rectangle {
    Point p1;
    Point p2;
    Point p3;
    Point p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double perimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p4) + p4.distance(p1);
    }

    public boolean isLegal() {
        if(p1.y == p2.y && p2.x > p1.x &&
        p2.x == p3.x && p3.y == p4.y && p4.x == p1.x) {
            return true;
        }
        return false;
    }
}

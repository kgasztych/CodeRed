package com.homework.Jeden;

public class Point {
    int x;
    int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        double distance = Math.sqrt(Math.pow(p2.x-this.x,2) + Math.pow(p2.y-this.y,2));
        return distance;
    }

}

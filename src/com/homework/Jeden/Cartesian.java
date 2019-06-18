package com.homework.Jeden;

public class Cartesian {

    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(1, 3);

        System.out.println(p1.distance(p2));

        // Rectangle - obligatory homework
        Point rp1 = new Point(0, 0);
        Point rp2 = new Point(2, 0);
        Point rp3 = new Point(2, 3);
        Point rp4 = new Point(0, 3);

        Rectangle rect = new Rectangle(rp1, rp2, rp3, rp4);
        boolean isValidRect = rect.isLegal();

        System.out.println("Is it rectangle? " + isValidRect);
        if(isValidRect) {
            System.out.println(rect.perimeter());
        }
    }
}

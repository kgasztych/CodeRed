package com.company;

public class Homework {
    public static void main(String[] args) {

        int a = 60;
        long score = 1;
        long prevValue = 1;
        long prevPrevValue = 1;

        for(int i =0 ;i<a;i++) {
            if(i<=1) {
                System.out.println(1);
            } else {
                score = sumPrev(prevValue, prevPrevValue);
                System.out.println(score);
                prevPrevValue = prevValue;
                prevValue = score;
            }
        }
    }

    private static long sumPrev(long prevValue, long prevPrevValue) {
        return prevValue + prevPrevValue;
        }
    }



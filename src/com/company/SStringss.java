package com.company;

import org.jetbrains.annotations.NotNull;

public class SStringss {
    public static void main(String[] args) {

        String myvalue = "Paste";
        boolean isSecondCharacterAorB = isSecondCharacterAorB(myvalue);

        System.out.println(isSecondCharacterAorB);
        System.out.println(myvalue.charAt(0));
    }

    public static boolean isSecondCharacterAorB (@NotNull String input){

        if(input.charAt(0)== 'a' || input.charAt(2) == 'b'){
            return true;
        }
        return false;
    }
}

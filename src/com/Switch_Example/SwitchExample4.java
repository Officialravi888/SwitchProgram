package com.Switch_Example;

public class SwitchExample4 {
    public static void main(String[] args) {
        //Declaring a variable for switch expression
        int number=20;
        switch(number){
            case 10: System.out.println("10");
                break;
            case 20: System.out.println("20");
                break;
            case 30: System.out.println("30");
                break;
            default://Default case statement
                System.out.println("Not in 10, 20 or 30");
        }
    }
}
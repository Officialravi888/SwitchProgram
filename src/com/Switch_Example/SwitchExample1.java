package com.Switch_Example;

import java.util.Scanner;

public class SwitchExample1 {
    public static void main(String[] args) {
        char operator = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Two value");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("please Select any ARITHMETIC OPERATOR ");
        switch (operator){
            case '+':
                System.out.println("Add two no: %d ");
                break;
            case '-':
                System.out.println("Subtraction of two no: %d");
                break;
            default:
                System.out.println("you have entered\n");
                System.out.println("please enter the correct");
                break;
        }
    }
}

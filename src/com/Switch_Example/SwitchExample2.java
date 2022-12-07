package com.Switch_Example;

public class SwitchExample2 {
    public static void main(String[] args) {
        int num=2;
        switch (num+2){
            case 1:
                System.out.println("case:value is:" +num);
            case 2:
                System.out.println("case: value is " +num);
            case 3:
                System.out.println("case3 : value is" +num);
            default:
                System.out.println("Default: value is :" +num);
        }
    }
}

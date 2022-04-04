package org.humanbooster.myproject;

import java.util.Scanner;

public class calculette {
    public static String pickOp(){
        System.out.println("choisissez une opération +, -, *, /, Q");
        Scanner sc = new Scanner(System.in);
        String sc0 = sc.toString();
        return sc0;
    }
    public static int pickNum(){
        System.out.println("choisissez deux nombres");
        Scanner sc1 = new Scanner(System.in);
        Integer sc11 = Integer.parseInt(sc1.nextLine());
        Scanner sc2 = new Scanner(System.in);
        Integer sc22 = Integer.parseInt(sc2.nextLine());
        return sc22;
    }
    public static int addition(int a,int b){
        return a+b;
    }
    public static int substraction(int a,int b){
        return a-b;
    }
    public static int division(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        pickOp();
        pickNum();
       /* if (pickOp()=="+" || pickOp()=="add") {
            addition(sc11,sc22);
        };
        if (pickOp()=="-" || pickOp()=="subs") {
            substraction();
        };
        if (pickOp()=="/" || pickOp()=="div") {
            division();
        };
    }*/
}
}
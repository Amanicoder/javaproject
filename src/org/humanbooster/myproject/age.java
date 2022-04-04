package org.humanbooster.myproject;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        System.out.println("Quel est votre age ?");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Integer ageme = Integer.parseInt(s);
        System.out.println("Dans un an votre age sera " + ++ageme);
    }
}
package org.humanbooster.myproject;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        System.out.println("Bonjour quel est votre nom ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine() ;
        System.out.println("Merci ! Et votre âge ?");
        Scanner sc1 = new Scanner(System.in);
        String age = sc1.nextLine() ;
        System.out.println("Bienvenue " + name + " !, vous avez "+ age);
    }
}

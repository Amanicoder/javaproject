package org.humanbooster.myproject;

import java.util.Scanner;

public class colours {
    public static void main(String[] args) {
        System.out.println("Choisissez une couleur (\"vert\", \"jaune\", \"rouge\")");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("vert")){
            System.out.println("La traduction en anglais du mot vert est Green");
        }else if (s.equals("jaune")){
            System.out.println("La traduction en anglais du mot jaune est yellow");
        }else if (s.equals("rouge")){
            System.out.println("La traduction en anglais du mot rouge est red");
        }else {
            System.out.println("sorry no translation available pour le mot \" "+ s +"\" ");
        };
    }
}

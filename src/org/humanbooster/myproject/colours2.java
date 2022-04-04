package org.humanbooster.myproject;

import java.util.Scanner;

public class colours2 {
    public static void main(String[] args) {
        System.out.println("Choisissez une couleur (\"vert\", \"jaune\", \"rouge\")");
        System.out.println("\t1 / vert");
        System.out.println("\t2 / jaune");
        System.out.println("\t3 / rouge");

        Scanner sc = new Scanner(System.in);
        String choix = sc.nextLine();
        switch (choix){
            case "1":
              System.out.println("La traduction en anglais du mot vert est Green");
              break;
            case "2":
              System.out.println("La traduction en anglais du mot jaune est yellow");
              break;
            case "3":
              System.out.println("La traduction en anglais du mot rouge est red");
              break;
            default:
              System.out.println("sorry no translation available");
        };
    }
}

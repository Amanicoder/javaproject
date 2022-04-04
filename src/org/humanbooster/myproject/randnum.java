package org.humanbooster.myproject;

import java.util.Random;
import java.util.Scanner;

public class randnum {
    public static void main(String[] args) {
        System.out.println("nombre max ?");
        Scanner sc = new Scanner(System.in);
        Integer nomb = Integer.parseInt(sc.nextLine());
        System.out.println("Generation d/'une valeur entre 1 et "+nomb);

        System.out.println("A vous de deviner ce nombre ");
        Random rand = new Random();
        Integer i = rand.nextInt(nomb)+1;
        System.out.println("nombre est "+ i);
        System.out.println("nombre ?");
        Integer j =1;

        while (true){
            Scanner sc2 = new Scanner(System.in);
            Integer nomb2 = Integer.parseInt(sc2.nextLine());

            if (nomb2 < i){
             System.out.println("Trop petit");
                j++;
             continue;
            }
            else if (nomb2 > i){
             System.out.println("Trop grand");
                j++;
             continue;
            }
            else if (nomb2 == i) {
                System.out.println("Bravo vous avez devinez réussi à trouver le chiffre "+ i +"dans"+ j +"tentatives");
                j++;
                break;
            }
            System.out.println("nombre ?");

    }
}
}

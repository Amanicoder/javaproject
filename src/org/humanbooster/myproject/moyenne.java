package org.humanbooster.myproject;

import java.util.Arrays;
import java.util.Scanner;

public class moyenne {
    static Integer tot;
    public static void main(String[] args) {
        testtableau();

    }
    public static void testtableau(){
        tot=0;
        int tab[]= new int[3];
        System.out.println(tab.length);
        for (int i=0; i<tab.length; i++) {
            System.out.println("quelle est la valeur");
            Scanner sc1 = new Scanner(System.in);
            tab[i]=Integer.parseInt(sc1.nextLine());
            tot += tab[i];
        }
        float moy =tot/tab.length;
        System.out.println(moy);
        System.out.println(Arrays.toString(tab));

    }
}

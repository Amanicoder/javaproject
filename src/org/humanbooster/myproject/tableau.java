package org.humanbooster.myproject;

import com.sun.source.tree.ReturnTree;

import java.util.Arrays;
import java.util.Scanner;

public class tableau {
    public static void main(String[] args) {
        testtableau();
    }
    public static void testtableau(){
        System.out.println("quelle taille pour votre tableau ?");
        Scanner sc = new Scanner(System.in);
        Integer a =Integer.parseInt(sc.nextLine());
        int tab[]= new int[a];
        System.out.println(tab.length);
        for (int i=0; i<tab.length; i++) {
            System.out.println("quelle est la valeur");
            Scanner sc1 = new Scanner(System.in);
            tab[i]=Integer.parseInt(sc1.nextLine());
        }
        System.out.println(Arrays.toString(tab));
    }
}

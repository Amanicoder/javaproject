package org.humanbooster.myproject;

import java.util.Arrays;
import java.util.Scanner;

public class guess {
    static String s ="motorhead";
    static boolean[] answers = new boolean[s.length()];
    /*static char[] ch = s.toCharArray();*/

    public static void main(String[] args) {
        pick();
    }
    public static void pick(){
        for(int i=6; i>=0;i--){
            System.out.println("Choisissez une lettre (nombre essai restant :"+ i+")");
            Scanner sc = new Scanner(System.in);
            String a =sc.nextLine();
            /* System.out.println(s.contains(a));
            if (s.contains(a)){
            for (int j=0; j<=answers.length; j++){*/
                            if (s.contains(a)){
                                System.out.println(s.contains(a));
                                Integer pos = s.indexOf(a);
                            answers[pos]=true;
                            System.out.println(Arrays.toString(answers));
                    }

                }
        System.out.println("game is over");
            }
        }

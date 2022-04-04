package org.humanbooster.myproject;

import java.util.Arrays;
import java.util.Scanner;


public class bigger {
    public static int getLargest(int[] x, int total){
        Arrays.sort(x);
        return x[total-1];
    }
    public static void main(String[] args) {

        System.out.println("Give us 6 numbers please");
        Scanner a = new Scanner(System.in);
        Integer a1 = Integer.parseInt(a.nextLine());
        Scanner b = new Scanner(System.in);
        Integer b1 = Integer.parseInt(b.nextLine());
        Scanner c = new Scanner(System.in);
        Integer c1 = Integer.parseInt(c.nextLine());
        Scanner d = new Scanner(System.in);
        Integer d1 = Integer.parseInt(d.nextLine());
        Scanner e = new Scanner(System.in);
        Integer e1 = Integer.parseInt(e.nextLine());
        Scanner f = new Scanner(System.in);
        Integer f1 = Integer.parseInt(f.nextLine());
        int tab[]={a1,b1,c1,d1,e1,f1};
        System.out.println("Largest: " + getLargest(tab,6));

    }
}

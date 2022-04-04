package org.humanbooster.myproject;

public class hello {
    public static void main(String[] args) {
        affiche();
        affiche("toto");
    }
    public static void affiche(){
            System.out.println("hello");
        }


        public static String affiche(String a){
        if (a == null) {
                System.out.println("Hello");
            }
        else{
                System.out.println(a);
                return "hello";
            }
return "yes";
    }
}

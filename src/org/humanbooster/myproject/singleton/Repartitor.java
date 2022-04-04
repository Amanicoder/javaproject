package org.humanbooster.myproject.singleton;

import java.util.ArrayList;

public class Repartitor {
    private static Repartitor instance;
    private ArrayList<Printer> printers = new ArrayList<>();
    public int currentPrinter = 0;

    public Repartitor() {}

    // Singleton
    public static Repartitor getInstance() {
        if (instance == null){
            instance = new Repartitor();
        }
        return instance;
    }

    public void print(){
        Printer printer = printers.get(currentPrinter++);
        Printer.print();
        if (currentPrinter>= printers.size()){
            currentPrinter =0;
        }
        System.out.println("impression en cours sur "+ this.currentPrinter);
    }

    public ArrayList<Printer> getPrinters() {
        return printers;
    }
}

package com.Mykyta;

public class Main {

    public static void main(String[] args) {

// Turn Duplex ON and OF , by swithcing between TRUE and FALSE!!!

        // Change the pritning parameters here, and run the program to see the results!

        Printer printer = new Printer ( 50,false);
        System.out.println("initial page count = " + printer.getNumberPrinted());

        int pageePrinted = printer.numberOfPagesPrint(4);
        System.out.println("Pages printed was " + pageePrinted + " new total print count for printer is = " +printer.getNumberPrinted());

        pageePrinted = printer.numberOfPagesPrint(2);
        System.out.println("Pages printed was " + pageePrinted + " new total print count for printer is = " +printer.getNumberPrinted());

        pageePrinted = printer.numberOfPagesPrint(8);
        System.out.println("Pages printed was " + pageePrinted + " new total print count for printer is = " +printer.getNumberPrinted());

    }
}

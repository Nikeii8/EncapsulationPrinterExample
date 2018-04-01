package com.Mykyta;

public class Printer {

    private int tonerLevel = 100;
    private int numberPrinted;
    private boolean duplexPrinter;


    public Printer(int tonerLevel, boolean duplexPrinter) {

        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;

        }else {
            this.tonerLevel = -1;
        }

        this.duplexPrinter = duplexPrinter;
        this.numberPrinted = 0;


    }

    public void calcTonerPercentage(int toner) {
        if (toner >= 0 && toner <= 100) {
            System.out.println("There is enough ink for printing");
        } else if (toner <= 0) {
            System.out.println("There is NOT enough ink");
        }

    }

    public int fillToner(int amoutPaint) {

        if (amoutPaint > 0 && amoutPaint <= 100) {
            if( this.tonerLevel + amoutPaint > 100) {
            return -1;
            }
            this.tonerLevel += amoutPaint;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }


    public int numberOfPagesPrint (int pages) {

        int pagesToPrint = pages;
        if (this.duplexPrinter) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");

        }
        this.numberPrinted += pagesToPrint;
        return pagesToPrint;

    }


    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getNumberPrinted() {
        return this.numberPrinted;
    }

    public boolean isDuplexPrinter() {
        return this.duplexPrinter;
    }

}



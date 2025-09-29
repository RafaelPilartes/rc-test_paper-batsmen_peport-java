package com.mycompany.testpaperbatsmenreportq2;

public class BatsmanRunsScoredReport extends CricketRunsScored {
     // Constructor
    public BatsmanRunsScoredReport(String batsman, String stadium, int runsScored) {
        super(batsman, stadium, runsScored);
    }
    
     // Method to print
    public void printAccidentReport() {
        System.out.println("\nBATSMAN RUNS SCORED REPORT ");
        System.out.println("*************************");
        System.out.println("CRICKET PLAYER: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
        System.out.println("*************************");
    }
}

package com.mycompany.testpaperbatsmenreportq2;

public abstract class BatsmanRunsScoredReport extends CricketRunsScored {
     // Constructor
    public BatsmanRunsScoredReport(String batsman, String stadium, int runsScored) {
        super(batsman, stadium, runsScored);
    }
    
     // Method to print
    public void printAccidentReport() {
        System.out.println("\nBATSMAN RUNS SCORED REPORT ");
        System.out.println("*************************");
        System.out.println("CRICKET PLAYER: " + getBatsmanName());
        System.out.println("STADIUM: " + getStadiumName());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScoredTotal());
        System.out.println("*************************");
    }
}

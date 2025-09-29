package com.mycompany.testpaperbatsmenreportq2;

import java.util.Scanner;

public class TestPaperBatsmenReportQ2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inputs data
        System.out.print("The cricketer name: ");
        String batsman = scanner.nextLine();

        System.out.print("The stadium name: ");
        String stadium = scanner.nextLine();

        System.out.print("Enter the total runs scored by" + batsman + " at " + stadium + ": ");
        int runsScored = scanner.nextInt();

        // Create subclass object
        BatsmanRunsScoredReport report = new BatsmanRunsScoredReport(batsman, stadium, runsScored);

        // Print report
        report.printAccidentReport();
    }
}

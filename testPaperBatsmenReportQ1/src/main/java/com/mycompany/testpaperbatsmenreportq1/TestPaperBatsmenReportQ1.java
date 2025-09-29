package com.mycompany.testpaperbatsmenreportq1;
import java.util.Scanner;

public class TestPaperBatsmenReportQ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB De Villiers"};
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};

        // dimentional array
        int[][] runsScored = new int[3][3];
        
        System.out.println("SA CRICKETER APPLICATION");
        System.out.println("------------------------------------------------------------");
        
        // Loop input
        for (int i = 0; i < stadiums.length; i++) {
            System.out.print("Enter the number runs scored by " + batsmen[0] + " at " + stadiums[i] + ": ");
            runsScored[0][i] = sc.nextInt();
            
            System.out.print("Enter the number runs scored by " + batsmen[1] + " at " + stadiums[i] + ": ");
            runsScored[1][i] = sc.nextInt();
            
            System.out.print("Enter the number runs scored by " + batsmen[2] + " at " + stadiums[i] + ": ");
            runsScored[2][i] = sc.nextInt();
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("RUNS SCORED REPORT");
        System.out.println("------------------------------------------------------------");
        
        // Loop runs scored at
        for (int i = 0; i < stadiums.length; i++) {
            System.out.println(batsmen[i] + " runs scored at " + stadiums[0] + ": " + runsScored[i][0]);
            System.out.println(batsmen[i] + " runs scored at " + stadiums[1] + ": " + runsScored[i][1]);
            System.out.println(batsmen[i] + " runs scored at " + stadiums[2] + ": " + runsScored[i][2]);
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("------------------------------------------------------------");
        
        int[] totals = new int[stadiums.length];
        int maxTotal = 0;
        String stadiumsMostRuns = "";

        // CALCULATE TOTAL OF SCORES
        for (int i = 0; i < stadiums.length; i++) {
            totals[i] = runsScored[0][i] + runsScored[1][i] + runsScored[2][i];
            System.out.printf("%-15s %-10d%n", stadiums[i], totals[i]);

            if (totals[i] > maxTotal) {
                maxTotal = totals[i];
                stadiumsMostRuns = stadiums[i];
            }
        }

        System.out.println("");
        System.out.println("STSDIUMS WITH THE MOST RUNS: " + stadiumsMostRuns);
        System.out.println("------------------------------------------------------------");
    }
}

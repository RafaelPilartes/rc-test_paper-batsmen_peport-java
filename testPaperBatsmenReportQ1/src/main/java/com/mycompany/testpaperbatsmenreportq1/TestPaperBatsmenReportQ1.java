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

        
}

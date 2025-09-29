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

        // Criar objeto da subclasse
        BatsmanRunsScoredReport report = new BatsmanRunsScoredReport(batsman, stadium, runsScored);

        // Imprimir relatório
        report.printAccidentReport();
    }
}

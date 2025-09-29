package com.mycompany.testpaperbatsmenreportq2;

public abstract class CricketRunsScored implements ICricket{
    protected String batsman;
    protected String stadium;
    protected int runsScored;
    
    // Constructor
    public CricketRunsScored(String batsman, String stadium, int runsScored) {
        this.batsman = batsman;
        this.stadium = stadium;
        this.runsScored = runsScored;
    }

    // Method GET
    public String getBatsman() {
        return batsman;
    }

    public String getStadium() {
        return stadium;
    }

    public int getRunsScored() {
        return runsScored;
    }
}

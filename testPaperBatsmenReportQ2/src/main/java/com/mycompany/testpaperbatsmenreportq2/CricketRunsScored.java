package com.mycompany.testpaperbatsmenreportq2;

public abstract class CricketRunsScored implements ICricket{
    protected String batsman;
    protected String stadium;
    protected int runsScored;
    
    // Construtor
    public CricketRunsScored(String batsman, String stadium, int runsScored) {
        this.batsman = batsman;
        this.stadium = stadium;
        this.runsScored = runsScored;
    }

    // Metod GET
    public String getAccidentVehicleType() {
        return batsman;
    }

    public String getCity() {
        return stadium;
    }

    public int getAccidentTotal() {
        return runsScored;
    }
}

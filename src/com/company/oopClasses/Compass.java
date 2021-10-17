package com.company.oopClasses;

enum Directions {NORTH, EAST, SOUTH, WEST};

public class Compass{
    private int azimuth;


    public void setAzimuth(int azimuth) {
        this.azimuth = azimuth;
    }
    public Directions getDirect(){

        if ((azimuth > 315) || (azimuth < 45))
            return Directions.NORTH;
        else if (azimuth < 135) return Directions.EAST;
        else if (azimuth < 225) return Directions.SOUTH;
        else return Directions.WEST;
    }

}

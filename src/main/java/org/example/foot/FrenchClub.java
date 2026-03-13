package org.example.foot;

import java.util.ArrayList;
import java.util.List;

public class FrenchClub {

    private String name;

    private int classement;

    private boolean playLDC;

    private final String country = "France";

    public FrenchClub(final String name, final int classement, final boolean playLDC) {
        this.name = name;
        this.classement = classement;
        this.playLDC = playLDC;
    }

    // Club qui vont jouer la LDC automatiquement
    public FrenchClub(final String name, final int classement) {
        this(name, classement, true);
    }

    public int getClassement() {
        return classement;
    }

    public String getClassementMsg() {
        String message = "Le club %s est situé dans le classement à la place : %s";
        return String.format(message, this.name, this.classement);
    }

    public void setClassement(final int classement) {
        this.classement = classement;
    }

    public boolean isPlayLDC() {
        return playLDC;
    }

    public void setPlayLDC(final boolean playLDC) {
        this.playLDC = playLDC;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}

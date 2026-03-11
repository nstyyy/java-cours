package org.example.foot;

import java.util.Objects;

public class FrenchClub {

    String name;

    int classement;

    boolean playLDC;

    final String country = "France";

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

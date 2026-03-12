package org.example.foot;

public class EnglishClub extends FrenchClub {

    boolean isLondonClub;

    public EnglishClub(final String name, final int classement, final boolean playLDC, final boolean isLondonClub) {
        super(name, classement, playLDC);
        this.isLondonClub = isLondonClub;
    }

    public EnglishClub(final String name, final int classement) {
        super(name, classement);
    }
}

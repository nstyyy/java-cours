package org.example.practice;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Collections {

    private void tableaux() {
        int[] id = new int[3]; // Capacité max de 3
        id[0] = 2;
        id[1] = 5;
        id[2] = 77;

        out.println(id[0] - id[1]);

        String[] joueurs = new String[3]; // Capacité max de 3

        joueurs[0] = "Messi";
        joueurs[1] = "Neymar";
        joueurs[2] = "Suarez";

        for (String j : joueurs) {
            out.print(j.charAt(0)); // Afficher "MSN" --> le meilleur trio de l'histoire du football ^^
        }
    }

    private void arrayList() {

        List<String> joueurs = new ArrayList<String>();

        joueurs.add("Neymar");
        joueurs.add("Messi");
        joueurs.add("Mbappé");

        joueurs.remove(2);

        if (joueurs.get(1).toLowerCase().contentEquals("messi") && !joueurs.isEmpty()) {
            out.println("c'est Messi !");
        }

        joueurs.set(0, "Mbappé");
    }


}

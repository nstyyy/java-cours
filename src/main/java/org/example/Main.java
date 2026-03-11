package org.example;

import org.example.Enums.Ville;
import org.example.student.InfosEtudiant;

import static java.lang.System.*;


public class Main {

    private static final String initMessage = ("❤️ %s ❤️\n");

    public static void main(String[] args) {

        out.printf(String.format(initMessage, InfosEtudiant.initializeText()));

        getDay();

        sayHelloInChars();


        int[] test = {1,2,3};

        for (int i : test) {
            if (i == 3) {
                continue;
            }
            out.println(i);
        }

        // Avoir les infos d'un étudiant
        infosEtudiant();

        // Debut POO
        // TODO -> Utiliser l'objet Livre
    }

    private static void sayHelloInChars() {
        String player = "HELLO";

        for (char lettre : player.toCharArray()) {
            out.println(lettre);
        }
    }

    private static void getDay() {
        int day = 1;
        switch (day) {
            case 1,2,3 -> out.println("Nous sommes en début de semaine.");
            case 4,5 -> out.println("Nous sommes en fin de semaine.");
            case 6,7 -> out.println("Nous sommes le week-end.");
            default -> { // accolade pour plusieurs actions
                String msg = "Le jour est invalide.";
                out.println(msg);
            }
        }
    }

    private static void infosEtudiant() {
        final InfosEtudiant infosEtudiant = new InfosEtudiant();
        infosEtudiant.afficherInfo();
    }
}
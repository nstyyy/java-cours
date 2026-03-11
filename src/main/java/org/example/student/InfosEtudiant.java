package org.example.student;

import static java.lang.System.*;

// Simple classe pour gérer les variables et les conditions de base

public class InfosEtudiant {
    // Commentaire de test

    private static final String bestEcole = "IPI";

    private int age = 20;
    private float epargne = 10500;
    private String address = "11 avenue des amandiers";
    private static final String name = "Natanael";
    private boolean isMajor = true;
    private String ecole =  "IPI";

    int[] notesMath = {10,12,15};

    protected String test() {
        return "";
    }

    public static String initializeText() {
        String msg = "Initialisaiton du projet JAVA-TEST;";
        return msg;
    }

    public void afficherInfo() {

        epargne = epargne/2;

        out.println("{Personne = " + name + "} {Age = " + age + "}");
        out.println("Epargne : " + epargne);

        if (bestEcole.equals(ecole) && isMajor) {
            out.println("Cette personne est majeur et à l'école IPI !");
        }

        if (address.toLowerCase().contains("avenue")) {
            out.println("Cette personne habite dans une avenue !");
        }

        out.println("Voici la liste des notes de l'étudiant :");
        for (int nombreNotesMath : notesMath) {
            out.println(nombreNotesMath);
        }

        out.println("----------------------------------------------------------------------------------------------------------------");
    }
}

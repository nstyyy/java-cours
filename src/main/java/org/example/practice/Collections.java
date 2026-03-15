package org.example.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        List<String> joueurs = new ArrayList<>();

        joueurs.add("Neymar");
        joueurs.add("Messi");
        joueurs.add("Mbappé");

        joueurs.remove(2);

        if (joueurs.get(1).toLowerCase().contentEquals("messi") && !joueurs.isEmpty()) {
            out.println("c'est Messi !");
        }

        joueurs.set(0, "Mbappé");
        joueurs.add("Ramos");

        // Filtrage de joueur commençant par la lettre "R"
        joueurs.stream()
               .filter(j -> j.startsWith("R")) // Prends chaque joueur j, et vérifie si j.startsWith("R") est vrai. (c'est une lambda)
               .forEach(out::println);

        // Transformer les données avec map
        joueurs.stream()
               .map(String::toUpperCase)
               .forEach(out::println);


        // Vérifier si un joueur existe
        boolean messiExist = joueurs.stream()
                .anyMatch(j -> j.equalsIgnoreCase("messi")); // Prends chaque joueur j, et vérifie si j.equalsIgnoreCase("messi); est vrai. (c'est une lambda)

        // Trie les élements par ordre naturel (ici alphabétique)
        joueurs.stream()
               .sorted()
               .forEach(out::println);
    }

    private void hashSet() {
        Set<String> joueurs = new HashSet<>();

        joueurs.add("Neymar");
        joueurs.add("Messi");
        joueurs.add("Mbappé");

        joueurs.remove("Messi");
        joueurs.add("Ramos");

        // Filtrage de joueur commençant par la lettre "R"
        joueurs.stream()
               .filter(j -> j.startsWith("R")) // Prends chaque joueur j, et vérifie si j.startsWith("R") est vrai. (c'est une lambda)
               .forEach(out::println);

        // Transformer les données avec map
        joueurs.stream()
               .map(String::toLowerCase)
               .forEach(out::println);

        // Vérifier si un joueur existe
        boolean messiExist = joueurs.stream()
                                    .anyMatch(j -> j.equalsIgnoreCase("messi"));

        // Trie les élements par ordre naturel (ici alphabétique)
        joueurs.stream()
               .sorted()
               .forEach(out::println);

    }

    private void hashMap() {

    }


}

# La Programmation Orientiée Objet

La programmation orientée objet (POO) en Java consiste à créer des objets à partir de classes, qui contiennent des attributs (données) et des méthodes permettant de les manipuler<br>
Un livre pourrait être l'objet, et le titre ou l'auteur les attributs.<br><br>

**/!\ ASTUCE /!\ :** Sur intelliJ en faisant simplement un "ALT INSERT" il proposera de créer le **constructeur**, les **getters et setters** ainsi que l'implémentation
d'autres méthodes comme le **equals**, le **hashCode** etc.

# 1. Création de la classe avec constructeur
Les attributs sont toujours définis en haut de la classe, appelées aussi **attributs de classes**.<br>
Un constructeur sert à créer et initialiser un objet au moment où il est instancié. Il doit avoir le même nom que la classe et prend en paramètre les attributs.<br>
Exemple ci-dessous :
```
public class Livre {

    String titre;
    String auteur;
    int pages;
    final String paysDeSortie = "France";
    
    // Le constructeur
    public Livre(String titre, String auteur, int pages) {
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;
    }
}
```

Il est aussi possible de créer plusieurs constructeurs (ils prendront des paramètres différents) et peuvent s'appeler entre eux :
```
public class Livre {

    String titre;
    String auteur;
    int pages;
    final String paysDeSortie = "France";
    
    // Le constructeur principal
    public Livre(String titre, String auteur, int pages) {
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;
    }
    
    // Le constructeur secondaire (ex :  toujours le même auteur pour ce cas)
    public Livre(String titre, int pages) {
        this(titre, "ODA", pages);
    }
}
```

# 2. Getters and setters
TODO

# 3. Utiliser notre objet
Afin d'utiliser un objet, cela doit être fait de la manière suivante :
```
Type(NomDeLaClasse) nom_variable = new Type(NomDeLaClasse)(param1, param2, ...);
```
Dans le cas ci-dessous on va utiliser notre objet Livre créé ci-dessus.
```
public class Main {

    public static void main(String[] args) {
        Livre livre = new Livre("Dragon Ball Z", "Toriyama", 150);
    }
}
```
# Les objets et les attributs

La programmation orientée objet (POO) en Java consiste à créer des objets à partir de classes, qui contiennent des attributs (données) et des méthodes permettant de les manipuler<br>
Un livre pourrait être l'objet, et le titre ou l'auteur les attributs.<br><br>

**/!\ ASTUCE /!\ :** Sur intelliJ en faisant simplement un "ALT INSERT" il proposera de créer le **constructeur**, les **getters et setters** ainsi que l'implémentation
d'autres méthodes comme le **equals**, le **hashCode** etc.

# 1. Création de la classe avec constructeur
Les attributs sont toujours définis (pas obligé mais c'est mieux quand même) en haut de la classe, appelées aussi **attributs de classes**.<br>
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
Par définition, cela permet d'obtenir la valeur d'un attribut ou de le définir. IntelliJ permet de les définir simplement une fois les attributs déclarées avec **ALT INSERT** et de les choisir. Il n'est **pas obligatoire** de ne pas définir un 
Getter ou un Setter pour un attribut. 
<br>Ci-dessous, nous allons définir les getters et setters de la classe **Livre**.
```
    public String getTitre() {
            return titre;
        }

    public void setTitre(final String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(final String auteur) {
        this.auteur = auteur;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(final int pages) {
        this.pages = pages;
    }

    public String getPaysDeSortie() {
        return paysDeSortie;
    }
```

# 3. Utiliser notre objet
Afin d'utiliser un objet, cela doit être fait de la manière suivante :
```
NomDeLaClasse variable = new NomDeLaClasse(param1, param2, ...);
```
Dans le cas ci-dessous on va utiliser notre objet Livre créé ci-dessus.
```
public class Main {

    public static void main(String[] args) {
        Livre livre = new Livre("Dragon Ball Z", "Toriyama", 150);
    }
}
```
# Les Enum

Les énumérations sont des listes de cas prédéfinis destinés à aider pendant le développement. Elles améliorent la lisibilité du code et diminiuent les risques d'erreurs, en bloquant par exemple les valeurs que peut prendre une variable.
<br>Une *enum** en Java est en réalité une classe spéciale qui représente un groupe de constantes (des variables inchangeables, comme le mot-clé **final**).

# 1. Enum Simple
Voici la syntaxe de base. Par convention, les valeurs d'une énumération sont écrites en **MAJUSCULES**.
```
// Déclaration de l'Enum
public enum Ville {
    TOULOUSE, PARIS, MADRID
}

// Utilisation dans une autre classe
Ville maVille = Ville.PARIS;
System.out.println("Ma ville est : " + maVille);
```

# 2. Les méthodes intégrées (values et ordinal)
Les énumérations possèdent des méthodes natives très pratiques pour les manipuler :
- ```values()``` : Retourne un tableau contenant toutes les valeurs de l'enum. Très utile pour faire une boucle et tout lister
- ```ordinal()``` : Retourne l'index (la position) de la valeur dans l'enum (en comment comme les tableaux : par 0)
- ```valueOf(String)``` : Permet de transformer une chaîne de caractères en Enum (à condition que la chaîne corresponde exactement au nom de l'enum)
```
for (Ville v : Ville.values()) {
    out.println(v + " est à l'index " + v.ordinal());
}
```

# 3. Les Enum avec le Switch
Les enums s'associent parfaitement avec les **switch.** Cela permet de tester facilement tous les cas possibles de manière très lisible et sécurisée.
```
Ville destination = Ville.TOULOUSE;

switch (destination) {
    case PARIS:
        out.println("La capitale");
        break;
    case TOULOUSE:
        out.println("La ville rose");
        break;
    case MADRID:
        out.println("L'Espagne");
        break;
}
```

# 4. Enum avec attributs et constructeur
En Java, les **enums peuvent avoir des attributs, des constructeurs et des méthodes.** Exactement comme des classes classiques.
<br>Exemple :
```
public enum SoccerPlayers {

    YAMAL("Joueur du FC Barcelone"),
    DOUE("Joueur du PSG"),
    MBAPPE("Joueur du Real Madrid");
    
    // Attribut de l'enum
    private static final String description;
    
    // Constructeur
    private SoccerPlayers(String description) {
        this.description = description;
    }
    
    // Getter
    public String getDescription() {
        return description;
    }
}
```
**/!\ IMPORTANT /!\ :** Le constructeur d'une enum est **TOUJOURS privé**, car on ne peut pas instancier des nouvelles valeurs avec **new**. Les seules instances possibles sont celles définies tout en haut de l'enum.
<br><br>
*Utilisation de l'enum* **SoccerPlayers** :

```
// 1. Utilisation du Getter
SoccerPlayers player = SoccerPlayers.DOUE;
out.println("Description du joueur : " + player.getDescription());

// 2. Utilisation de l'enum comme attribut pour un objet
public class Foot {

    String club;
    SoccerPlayers joueur;
    
    public Foot(String club, SoccerPlayers joueur) {
        this.club = club;
        this.joueur = joueur;
    }
    
    public void detailsJoueur() {
        out.printn(this.joueur.getDescription());
    }
}
```
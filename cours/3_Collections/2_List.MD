# Les listes

Une **liste ordonnée** est modifiable, on peut y modifier le contenu et le nombre d'éléments. Il n'y a pas de restrictions comme les tableaux.
<br>En Java il existe plusieurs classes qui utilisent des listes, la plus utilisée est **ArrayList**.
<br>Avec les listes on peut :
- ````acceder```` : à chaque élément via son index
- ````ajouter```` : (append) un nouvel élément à la fin
- ````insérer```` : un nouvel élément à un index spécifique
- ````supprimer```` : un nouvel élément à un index spécifique

**NOTE :** C'est la valeur que nous changeons, pas le type. Le type ne peut pas être changé.

# 1. Déclaration d'ArrayList
Voici comment déclarer :
````
List<Integer> list = new ArrayList<Integer>(); // Avant Java 7 on précisait deux fois le type

List<Integer> list = new ArrayList<>(); // Depuis Java on précise que une fois le type à partir de la variable

// Le symbole '<>' s'appelle 'diamond operator'
````
Explication des mots clés :
- ```List``` : C'est le type de l'interface. List est donc une interface. On peut y assigner n'importe quel objet
- ```Integer``` : Paramètre de type pour la liste (ici on peut y stocker que des entiers et un seul type maximum). Si on ne précise pas de type ce sera des Objets par défaut.
- ```new ArrayList``` : Créé une instance de la classe ArrayList

**/!\ IMPORTANT /!\ :** Si on ne spécifie pas un paramètre de type, on pourra stocket n'importe quel objet. Néanmoins quand on voudra accèder à un élément de la liste on va devoir effectuer une **conversion de type** (ou **cast**) afin de pouvoir 
l'utiliser.<br><br>
De plus on définit des objets et non des types primitifs comme type :
- ```int, double, float``` --> Integer, Double, Float
- ```boolean``` --> Boolean

# 2. Utilisation d'ArrayList
Dans l'exemple ci-dessous on va déclarer notre liste en y ajoutant deux éléments qui va les placer automatiquement la valeur dans un objet Integer.
<br>**Le premier élément est à l'index 0**.
```
List<Integer> myList = new ArrayList<>;

myList.add(4); // add est une méthode
myList.add(1);
```

Dans l'exemple ci-dessous on va utiliser un peu plus de méthode des listes :
```
List<Integer> myList = new ArrayList<>; // []

myList.add(4); // [4]
myList.add(1); // [4, 1]
myList.add(1,2); // [4, 1, 2] --> ici on ajoute la valeur '2' à l'index '1' (qui est le deuxième car '0' est le premier)
myList.remove(1); // [4, 2] --> on supprime l'index '1'
myList.set(0,10); // [10, 2] --> on set la valeur de l'index '0' à '10'

// Afficher la taille de la liste
System.out.println(myList.size()); // 2
```

# 3. Utilisation plus poussé d'ArrayList
Pour le forEach, on utilise : L'objet::La méthode.

### 1. Utiliser les streams
**filter** Permet de sélectionner des éléments.
```
List<String> joueurs = new ArrayList<>();

joueurs.add("Neymar");
joueurs.add("Messi");
joueurs.add("Ramos");

joueurs.stream()
       .filter(j -> j.startsWith("M")) // Prends chaque joueur j, et vérifie si j.startsWith("M") est vrai. (c'est une lambda)
       .forEach(System.out::println);
```

### 2. Transformer les données
**map** Transforme les éléments
```
joueurs.stream()
       .map(String::toUpperCase)
       .forEach(System.out::println);
// Résultat : NEYMAR MESSI RAMOS
```

### 3. Vérifier les conditions
- ```anyMatch()``` : au moins un
- ```allMatch()``` : tous
- ```noneMatch``` : aucun
```
boolean messiExist = joueurs.stream()
    .anyMatch(j -> j.equalsIgnoreCase("messi"));
```

### 4. Trier une liste avec stream
**sorted()** Trie les éléments d’un stream dans leur ordre naturel (alphabétique pour les String, croissant pour les nombres) ou selon un comparateur fourni.
```
List<String> joueurs = new ArrayList<>();

joueurs.add("Neymar");
joueurs.add("Messi");

joueurs.stream()
       .sorted()
       .forEarch(out::println);
       
// Affichage : ["Neymar, Messi"]
```

### 5. Trouver un élément

```
Optional<String> joueur = joueurs.stream()
       .filter(j -> j.equals("Messi"))
       .findFirst();
```

### 6. Parallel Stream
Le Parallel stream comme son nom l'indique se fait en parallel et permer d'utiliser plusieurs threads du CPU.
<br>IL est utile surtout pour les choses suivantes (sinon il peut être plus lent) :
- Des grosses collections
- Des opérations lourdes
```
joueurs.parallelStream()
    .forEach(out::println);
```
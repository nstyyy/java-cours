# Les tableaux

Un tableau est une liste ordonnée et numérotée d'éléments du même type. Par exemple un tableau de **int** ne contiendra que des **int**, idem pour un tableau de **String** etc.
<br>Chaque élément du tableau est associé à un numéro appelé **index**. L'indexation commence par 0 (et non 1). Donc le premier élément est associé à l'index 0.

# 1. Déclarer et instancier un tableau
La déclaration d'un tableau est comme une variable classique, on y ajoute seulement les crochets **[]** à coté du type.
```
int[] players;
```
Il est également possible d'instancier un tableau avec nombres d'emplacements fixés.
```
int[] players = new int[5]; // emplacement de 5
```
Il est aussi possible de définir déjà toutes les valeurs en même temps, par exemple au moment de la création du tableau.
```
// Tableau créé avec toutes les valeurs et assignée à la variable 'players'
int[] players = new int[]{5,2,3,4,7};
```

# 2. Utilisation du tableau
Pour l'exemple ci-dessous on va reprendre le tableau ci-dessus.
```
// Attribuer la valeur 4 à l'index 3.
players[3] = 4;

// Afficher la valeur du premier index (0)
System.out.println(players[0]);

// Afficher la taille du tableau --> '1'
System.out.println(players.length);
```

# 3. Les limites
Les tableaux sont pratiques mais ils ont des limites :
- une taille fixe
- On ne peut modifier que les valeurs existantes

Par exemple si on a notre tableau, on ne pourrait pas insérer un élément supplémentaire, on peut seulement remplacer des éléments.
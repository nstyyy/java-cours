# Les ensembles (Set)

Un ensemble (ou set) est une collection d'éléments **uniques** non ordonnés. On peut les utiliser si on se soucie pas de l'ordre des éléments, comme par exemple une *liste d'ingrédients.*

# I. HashSet

## 1. Définition
Un HashSet en Java est une **structure de donnée** qui stock des **élements uniques (sans doublons)** et **sans ordre garanti.**
<br>Cela permet des opérations très rapides pour :
- ajouter (add)
- supprimer (remove)
- vérifier la présence (contains)

Pour information, **un HashSet peut aussi contenir des valeurs null**, mais le principe d'unicité va aussi s'appliquer.

## 2. Déclaration de HashSet
Voici comment déclarer un **HashSet** qui est le plus utilisé en Java :
```
Set<String> list = new HashSet<>();
```
Explication des mots clés :
- ```Set``` : C'est le type de l'interface. Set est donc une interface. On peut y assigner n'importe quel objet
- ```String``` : Paramètre de type pour la liste (ici on peut y stocker que des String et un seul type maximum). Si on ne précise pas de type ce sera des Objets par défaut.
- ```new HashSet``` : Créé une instance de la classe Set

## 3. Utilisation de HashSet
```
Set<String> joueurs = new HashSet<>();

joueurs.add("Neymar");
joueurs.add("Messi");
joueurs.add("Mbappé");

joueurs.remove("Messi");
joueurs.add("Mbappé");
```
Comme les ensembles sont non ordonnés, il est pas nécessaire d'utiliser "append" ou d'insérer des éléments à un point spécifique. On utilise simplement le **add()** , idem pour le **remove()**.
<br>L'important est de fournir l'élément exact à supprimer.

# 3. Utilisation plus poussé d'ArrayList
**-->** Voir le fichier **2_List.MD** , on y retrouve tout aussi pour les HashSet.

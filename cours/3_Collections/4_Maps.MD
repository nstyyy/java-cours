# Les Maps

Une map (ou dictionnaire) est **une liste d'éléments organisés en fonctione d'une clé.** Cette clé est un terme spécifique que l'on recherche pour trouver sa définition ou sa **valeur.** C'est ce qu'on appelle une  **association "Clé<> Valeur" 
(Key <> Value).**<br>
Toutes les clés d'un dictionnaire doivent être **uniques**. Le type de clé utilisé de la façon la plus courante est le **String.**


# 1. Déclaration de map
Voici comment déclarer une **Map** en Java, ici nous utiliserons le **HashMap** :
```
Map<String,Integer> myMap = new HashMap<>():
```
Explication des mots clés :
- ```Map``` : C'est le type de l'interface. Map est donc une interface.
- ```String, Integer``` : (Le dictionnaire) Ici, String est le **type de clé**, et Integer est le **type de la valeur**. Le type **ne peut pas être modifié.**
- ```new HashMap``` : Créé une instance de la classe Map 

Voici les actions les plus fréquentes :
- ````acceder```` : à la valeur d'un élément par sa clé
- ````ajouter```` : un nouvel élément avec une nouvelle clé et valeur
- ````supprimer```` : un nouvel élément pour une clé spécifique

Il est également possible de modifier un élement en réutilisant une clé existant avec la méthode **put()**.

# 2. Utilisation de HashMap
```
Map<String,Integer> psgPlayers = new HashMap<>():

psgPlayers.put("Dembele", 15);

psgPlayers.put("Dembele", 10);

out.println(psgPlayers.get("Dembele"); // Affiche 10

psgPlayers.remove("Dembele");

out.println(psgPlayers.size()); // 0, map vide
```
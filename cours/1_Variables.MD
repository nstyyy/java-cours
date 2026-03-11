# Les variables

Une variable est composée de trois éléments : type, nom et valeur.

# 1. Les types de variables
- String : texte
- int : nombre entier
- float, double : decimal (double est plus précis, davantage de chiffres après la virgule)
- boolean : true/false (vrai/faux)


# 2. Les modificateurs d'accès
- ```public``` : Tout le monde y a accès
- ```private``` : Seule la classe elle-même peut l'utiliser
- ```protected``` : Les classes et ses "enfants" (héritage) y ont accès

# 3. Les Modificateurs de caractèristiques
- ```static``` : (Modificateur de portée) Les variables appartiennent à la classe et non un objet spécifique. Elle est partagée par toutes les instances. On l'appelle souvent une variable de classe.
- ```final``` : (Modificateur de modification) Une fois que la valeur est assignée, elle ne peut être changée. On transforme ainsi la variable en constante.

# 4. Notes

Il est possible de modifier la valeur d'un int facilement, exemple :
```
// Avant :
int i = 5;
i = i + 1;
i = i - 1;
i = i + 10;
i = i - 10;

// Après
int i = 5;
i++;
i--;
i += 10;
i -= 10; // Idem avec les autres opérateurs / *
```

Une variable déclaré dans un bloc conditionnel ne pourra pas être utilisé en dehors de celui-ci même dans la même méthode.
La portée d'une variable est très important : Dans la classe, une méthode, une condition, dans une autre classe etc.
```
if (true) {
    int test = 50;
}
test++; // ERREUR --> test pas accessible (comme si il n'était pas déclarée)<br>
// Dans ce cas il faudrait init. test avant la condition.
```
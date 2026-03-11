# Les méthodes

Une méthode est un bloc de code qui ne s'exécute que lorsqu'il est appelé. Elle est composée de : un modificateur d'accès, un type de retour, un nom et des paramètres (optionnels).

# 1. Les types de retour
- ```void``` : La méthode fait une action mais ne renvoie rien (ex: afficher un texte)
- ```String, int, double``` : La méthode doit renvoyer une valeur de ce type à la fin avec le mot-clé return
- ```boolean``` : La méthode renvoie true ou false (souvent utilisé pour des tests)

# 2. Les modificateurs d'accès
- ```public``` : La méthode peut être appelée depuis n'importe quelle autre classe du projet
- ```private``` : La méthode ne peut être appelée que par d'autres méthodes à l'intérieur de la même classe (utile pour cacher la logique interne)
- ```protected``` : La méthode est accessible par la classe, ses "enfants" (héritage) et les classes du même package

# 3. Les Modificateurs de caractèristiques
- ```static``` : (Méthode de classe) La méthode appartient à la classe. On peut l'appeler sans créer d'objet (ex: NomDeLaClasse.maMethode()). Elle ne peut pas utiliser de variables non-static
- ```final``` : (Méthode verrouillée) La méthode ne peut pas être redéfinie (écrasée) par une classe enfant. On garantit que le comportement reste identique quoi qu'il arrive
- ```abstract``` : (Méthode sans corps) La méthode n'a pas de code { ... }. Elle force les classes enfants à écrire leur propre version de cette méthode

# 4. Informations
Il est possible de créer des méthodes pour les appeler simplement sans les instancier comme des objets. Il suffit de les définir en static, d'importer la classe concerné et aller chercher la méthode souhaitée.
# Les Exceptions (Try / Catch)

En Java, lors de l'exécution d'un programme, il peut arriver que des erreurs innatendues se produisent. Ces erreurs s'appellent des **Exceptions.**
Si on ne gère pas ces exceptions, le programme plante et s'arrête brusquement.
<br>Le mécanisme de **try / catch** permet de *tenter* d'exécuter un code et *d'attraper* l'erreur si elle survient afin que le programme puisse continuer de fonctionner ou afficher un message d'erreur propre.

# 1. Les NullPointerException (NPE)
Une exception **NullPointerException (NPE)** se produit lorsqu’une variable censée contenir une référence d’objet est nulle, et qu’une opération est effectuée sur cette variable comme si elle contenait une référence d’objet valide. Pour l’éviter, 
on peut ajouter une vérification nulle avant d’effectuer toute opération sur la variable. Voici un exemple d’extrait de code :
```
// Avant :
String text = null;
out.println(text.length()); // Le programme va planter pour NPE

// Après :
String text = null;

if (text != null) { // On gère un potentiel NPE
    out.println(text.length()); // On y rentre jamais
}

```

# 2. Le bloc try et catch

Le principe est de placé le code susceptible d'être "*cassé*" dans un bloc **try** (**essayer**). Si une erreur se produit, l'exécution saute directement dans le bloc **catch** (**attraper**) correspondant.
<br>Exemple ci-dessous avec une division par zéro :
```
public class Test {
    public static void main(String[] args) {
        
        try {
            int resultat = 10 / 0; // Cette ligne va générer une erreur
            out.println("Ce message ne s'affichera pas.");
        
        } catch (ArithmeticException e) { // en général IntelliJ propose le catch ainsi que l'exception tout seul.
            // Ce bloc s'exécute uniquement si l'erreur ArithmeticException se produit
            out.println("Impossible de diviser par zéro.");
        }
        
        out.println("Le programme continue de tourner...");
    }
}
```
**/!\ ASTUCE /!\ :** La variable **e** dans le catch contient les **informations de l'erreur**. On peut utiliser **e.getMessage()** pour afficher la cause de l'erreur, ou **e.printStackTrace()** pour voir dans la console exactement où l'erreur s'est 
produite.

# 3. Le bloc finally
Il est possible d'ajouter un bloc **finally** à la fin. Le code à l'intérieur de ce bloc s'exécutera **toujours**, qu'il y ait une erreur ou non.
<br>C'est très utile pour fermer des ressources.
```
try {
    out.println("Ouverte du fichier");
} catch (Exception e) {
    out.println("Erreur de lecture : " + e.getMessage());
} finally {
    out.println("Fermeture du fichier."); // S'exécutera dans tous les cas.
}
```

# 4. Gérer plusieurs exceptions
**Un même bloc de code peut générer différents type d'erreurs.** On peut donc enchaîner plusieurs blocs **catch** pour réagir différemment selon le problème.
```
try {
    String text = null;
    out.println(text.length()); // Va créer un NPE (NullPointerException)
} catch (ArithmeticException e) {
    System.out.println("Erreur mathématique");
} catch (NullPointerException e) {
    System.out.println("Erreur : l'objet est null (vide)");
} catch (Exception e) {
    // Exception est la classe "mère" de toutes les erreurs
    // À mettre toujours en dernier pour attraper tout le reste
    System.out.println("Une erreur inconnue est survenue");
```

# 5. Créer (lever) ses propres erreurs avec "throw"
Des fois on veut déclencher nous-mêmes une erreur si par exemple une règle métier n'est pas respectée.
<br>On utilise le mot-clé **throw** (**lancer**).
```
public void setLevel(final int lvl) {
    if (lvl < 0) {
        // On lève une exception manuellement
        throw new IllegalArgumentException("Le niveau ne peut pas être négatif");
    }
}
```

**/!\ IMPORTANT /!\ :** Il ne faut jamais laisser un bloc catch vide. Si on attrape une exception et qu'on ne fait rien (même pas un petit print), le programme cachera l'erreur et cela deviendra un enfer pour trouver d'où vient le 
bug plus tard.
# Le polymorphisme

Le principe du polymorphisme est que lorsque l'on construit une classe héritant d'une autre classe, nous avons la possibilité de redéfinir certaines méthodes de la classe mère.
<br>L'objectif étant de remplacer le comportement de la fonction qui a été définie dans la classe mère.
<br>Le concept est donc de pouvoir utiliser le même nom de méthode sur des objets différents. Cela a du sens seulement quand le comportement des méthodes est différent.

# 1. Redéfinir une méthode d'une classe parente
Ci-dessous prenons en exemple une classe Animal avec la méthode **deplacer()** dans cette classe mère :
```
class Animal {
    void deplacer() {
        System.out.println("Je me déplace");
    }
}
```
Ci-dessous, nous appliquons le principe de polymorphisme pour la même mthode dans une classe fille :
```
class Oiseau extends Animal {
    void deplacer() {
        System.out.println("Je vole");
    }
}
```
**EXEMPLE :** Ci-dessous nous allons utiliser le polymorphisme en appelant la méthode adéquate selon le **type d'objet**.
```
public class Test {

    public static void main(String[] args) {
        // Initilisation des objets avec le même type
        Animal animal = new Animal();
        Animal oiseau = new Oiseau();
        
        animal.deplacer();
        oiseau.deplacer();
    }
}
```
**Note :** Même si le type de nos deux variables sont les mêmes (**Animal**), les instances sont différentes et donc leurs comportement également.

# 2. Appeler une méthode de la classe parente
Quand on redéfinit une méthode d'une classe parente dans la classe fille cela remplace tout le code. Mais si on voudrait quand même appeler le fonctionnement de la classe mère (tout en faisant autre chose dans la classe fille) on peut accèder à 
**l'implémentation parent** grâce au mot clé **super**.
*Exemple ci-dessous :*
```
public class Chien extends Animal {
    void deplacer() {
        super.deplacer(); // Appel à la classe parente
        System.out.println("Ouaf Ouaf"); // Nouvelle implémentation
    }
}
```
**/!\ IMPORTANT /!\ :** Dans un cas d'héritage multiple, on peut accèder seulement à l'implémentation de la classe parente et pas plus.

# 3. Annotation Override
En Java il existe des types spéciaux commençant par **@** appelés **annotations**. Cela sert à préciser le comportement d'une classe, d'une méthode, d'un attribut ou même d'une variable.
<br>Les annotations donnent des infos. au compilateur pour l'exécution du code de notre programme.
<br><br>
Le **@Override** est donc utilisé en complément du polymorphisme pour indiquer que la méthode annotée est une redéfinition d'une méthode de la classe mère. La signatute doit être identique.
<br>*Exemple ci-dessous avec les mêmes classes :*
```
class Animal {
    void deplacer() {
        System.out.println("Je me déplace");
    }
}

class Oiseau extends Animal {
    
    @Override // Annotation (+ IntelliJ l'aurait detecté dans la classe mère même sans l'annotation)
    void deplacer() {
        System.out.println("Je vole");
    }
}
```
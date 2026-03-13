# Les Héritages

Quand nous avons une classe avec ses attributs, si nous voulons la re-utiliser pour en créer une autre du même type il est possible de créer une nouvelle classe qui va étendre cette classe principale. Cette classe principale s'appelle **la classe 
mère**. <br>
En effet, hériter d'une classe mère il faudra simplement définir le constructeur dans la nouvelle classe, et cette nouvelle classe **héritera d'absoluments tous les attributs de la classe mère**. 
<br> **Le seul cas** ou ce serait pas possible d'accèder à un attribut de la classe mère c'est si il est en private.
<br><br>

# 1. Accessbilité aux attributs de la classe mère
- ```public``` : Accessible
- ```private``` : Pas Accessible
- ```protected``` : Accessible

# 2. Création de la classe
Pour cette exemple, on va s'appuyer sur le fichier **1_Objets_Attributs.MD** en utilisant la classe Livre. (**voir code**)
<br> Dans cette nouvelle classe, afin d'hériter de la classe mère nous allons l'étendre avec le mot clé **extends**.
<br> Afin d'appeler le constructeur de la classe mère, nous allons utiliser le mot clé (la méthode) **super**.
<br> Il serait donc possible d'encore créé une classe qui hériterai de la **classe fille** *Roman* ci-dessous. Elle aurait donc les attributs de *Roman* ainsi que de *Livre*. Cela s'appelle **de l'héritage à plusieurs niveaux**.
```
public class Roman extends Livre {

    String genre; // Nouvel attribut --> le genre de roman (Policier etc...)
    
    public Roman(String titre, String auteur, int pages, String genre) {
        super(titre, auteur, pages); // Le super toujours en premier !
        this.genre = genre;
    }
}
```

**/!\ IMPORTANT /!\ :** La méthode **super** doit toujours être en premier dans le constructeur, sinon il y aura une erreur.
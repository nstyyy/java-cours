# Les conditions

Une condition sert a faire une verification, ayant pour objectif de venir faire une action derrière.
Le true est toujours plus fort que le false.

# 1. Les opérateurs
- ```&&``` : ET
- ```||``` : OU
- ```> <``` : Supérieur inférieur
- ```>= <=``` : Supérieur ou égal inférieur ou égal
- ```+ - / *``` : Plus Moins Divisé Multiplié
- ```!``` : Négation
- ```!=``` : Différent de

# 2. Bloc de condition simple
```
boolean isActive = true;
int note = 19;

if (isActive) {} // true
    
if (note < 10) {
    out.println("Pas la moyenne");
} else if (note >= 10 && note != 20) {
    out.println("La moyenne"); // on rentre ici
} else {
    out.println("La perfection");
}
```

# 3. Switch case
ATTENTION : Les switch sont là pour chercher une égalité parfaite.<br>
Un switch peut etre seulement fait sur :
- des valeurs littérales
- des constantes final connues à la compilation
- des enum
<br><br>
Le mot clé permet de casser le switch, pour éviter d'entrer dans d'autres cas du switch.

```
final int day = 2;

switch (day) {
    case 1:
    case 2:
    case 3:
        out.println("Nous sommes en début de semaine.");
        break;

    case 4:
    case 5:
        out.println("Nous sommes en fin de semaine.");
        break;

    case 6:
    case 7:
        out.println("Nous sommes en week-end.");
        break;

    default:
        out.println("Jour invalide.");
}
```

### Version plus propre et moderne :
Avec cette version, plus besoin d'utiliser le mot clé "**break**".
```
int day = 1;
switch (day) {
    case 1,2,3 -> out.println("Nous sommes en début de semaine.");
    case 4,5 -> out.println("Nous sommes en fin de semaine.");
    case 6,7 -> out.println("Nous sommes le week-end.");
    default -> { // accolade pour plusieurs actions
        String msg = "Le jour est invalide.";
        out.println(msg);
    }
}
```
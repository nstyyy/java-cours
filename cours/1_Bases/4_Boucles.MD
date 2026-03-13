# Les boucles

# 1. Les boucles d'énumérations

### I. Exemple 1 : Connaitre le nombre de tours
```
for (initialisation; terminaison; increment) { // DOC
}

for (int i=0; i<=5; i++) { // Exemple concret
    out.println(i);
}
```

### II. Exemple 2 : Sans connaitre le nombre de tours
```
int[] notes = {10,12,14};

for (int nombreNotes : notes) {
    out.println(nombreNotes);
}
```

# 2. Les boucles conditionnelles

### I. Exemple 1 : while simple
```
while (condition) {} // DOC

int nombre = 0; 
while (nombre <=5) { // Exemple concret
    nombre++;
}
```

### II. Exemple 2 : do while
Ce cas est similaire au "do" classique, sauf que la condition est placée à la fin du bloc de code correspondant. De cette façon le bloc de code sera toujours executé au moins une fois.
```
do { // DOC
    // instructions
} while (condition);

int pushUpGoal = 10;
do{
    pushUpGoal -= 1;
} while (pushUpGoal > 0);
```

# 3. L'utilisation d'instructions

### I. Utilisation de "continue"
En effet, il est possible d'ignorer des itérations grâce au mot clé "continue".
```
int[] notes = {10,12,14};
for (int i : notes) {
    if (i == 12) {
        continue; // on ne rentrera pas lige en dehors du bloc de condition
    }
    out.println(i);
}
```

### II. Utilisation de "break"
En effet, il est possible d'arrêter/d'interrompre une séquence d'exécution grâce au mot clé "continue".
```
int[] notes = {10,12,14};
for (int i : notes) {
    if (i < 10) {
        out.println("L'utilisateur a une note en dessous de 10.")
        break; // on ne rentrera pas lige en dehors du bloc de condition
    }
    out.println(i);
}
```

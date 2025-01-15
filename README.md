# Ejercicis amb Java

Aquesta repositori conté una sèrie d'exercicis fets amb Java per a practicar conceptes com les interfícies funcionals, els streams, lambdas, i mètodes de referència.

## Contingut dels Exercicis

### Exercici 1
A partir d'una llista de Strings, implementa un mètode que retorna una llista de totes les cadenes que contenen la lletra 'o'. Imprimeix el resultat.

### Exercici 2
Fes el mateix que en l'exercici anterior, però ara, el mètode ha de retornar una llista amb els Strings que a més de contenir la lletra 'o' també tenen més de 5 lletres. Imprimeix el resultat.

### Exercici 3
Crea una llista amb els noms dels mesos de l'any. Imprimeix tots els elements de la llista mitjançant una expressió lambda.

### Exercici 4
Realitza la mateixa impressió de l'exercici anterior, però utilitzant un *method reference*.

### Exercici 5
Crea una *Functional Interface* amb un mètode anomenat `getPiValue()` que ha de retornar un `double`. Des del `main()` de la classe principal, instancia la interfície i assigna-li el valor `3.1415`. Invoca el mètode `getPiValue()` i imprimeix el resultat.

### Exercici 6
Crea una llista amb nombres i cadenes de text i ordena la llista de les cadenes més curtes a les més llargues.

### Exercici 7
Amb la mateixa llista de l'exercici anterior, ordena-la al revés: de les cadenes més llargues a les més curtes.

### Exercici 8
Crea una *Functional Interface* que contingui un mètode anomenat `reverse()`. Aquest mètode ha de rebre i retornar un `String`. Al `main()` de la classe principal, implementa aquesta interfície mitjançant una expressió lambda que torni la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.

## Com executar els exercicis

1. **Clonar el repositori**:
   ```bash
   git clone <repositori-url>
   ```

2. **Obrir el projecte**: Importa el projecte en el teu IDE de preferència (Eclipse, IntelliJ, etc.).

3. **Executar els exercicis**: Cada exercici està implementat en una classe separada dins el paquet `Exercicis`. Pots executar cada classe des del seu mètode `main()`.

## Requisits

- **Java 8** o superior per suportar lambdas i streams.
- Un IDE com **IntelliJ IDEA**, **Eclipse**, o **VS Code** configurat amb suport per a Java.

## Exemples de sortida

### Exercici 1
```
Llista original: ["Hola", "Adéu", "Oscar", "Llum"]
Resultat: ["Hola", "Oscar"]
```

### Exercici 2
```
Llista original: ["Hola", "Adéu", "Oscuro", "Llum"]
Resultat: ["Oscuro"]
```

### Exercici 5
```
El valor de Pi és: 3.1415
```

### Exercici 8
```
Cadena original: "Hola"
Cadena invertida: "aloH"
```

## Autor
Creat per **Antonio Carrasco**. Si tens alguna pregunta o suggeriment, no dubtis a contactar-me!

## Llicència
Aquest projecte està sota la llicència MIT. Consulta el fitxer `LICENSE` per a més detalls.


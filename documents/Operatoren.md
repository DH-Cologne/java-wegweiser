# Operatoren

## Arithmetische- / Rechenoperatoren

-   Einfache: `+ - * / %`

## Post-/Preinkrement

-   Ausdruck und Operation mittels: `++` / `--`

```java
// Unterschied Post-/Preinkrement:
int i = 5;
int x = ++i; // i = 6 und x = 6 (hochzählen, dann zuweisen)

int i = 5;
int x = i++; // i = 6 und x = 5 (zuweisen, dann hochzählen)
```

## Vergleichsoperatoren

-   Ergebnis von Vergleichsoperationen ist **immer** `true` oder `false`!
-   `==`, `!=`, `>`, `<`, `>=`, `<=`

## Boolsche / Logische Operatoren

-   `&&` und `||`
-   Negation: `!` (invertiert einen Ausdruck)
-   Exklusives ODER: `!=` (wenn nur 1 Operand `true` ist)

## Operatoren zur Bit-Manipulation (erstmal weglassen?)

-   `~`, `&`, `|`, `^`
-   `>>`, `>>>`, `<<`

## Zuweisungsoperatoren

-   Einfache: `=`
-   Arithmetische: `+=`, `-=`, `/=`, `*=`, `%=`
-   Logische: `&=`, `|=`, ...

```java
// Logische Zuweisungsoperatoren
boolean t = true;
boolean f = false;
t &= f; // hiernach: t = false, weil nicht beide true
```

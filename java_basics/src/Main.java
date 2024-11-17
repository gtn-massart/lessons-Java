import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Commentaire sur une ligne
      /// Commentaire sur une ligne en vert italique
      /*
         commentaire
         multiligne
      */

      /// ********** LES VARIABLES **********

      /// Déclaration : type nomVariable assignation
      int result = 10;
      /// Le type var laisse le compilateur inférer le type
      var result2 = 20;
      /// Pour nommer une variable, on utilise le camelCase
      var nomDeVariable = 30;

      /// Affichage dans la console
      // System.out.println(String.format("Le contenu de mes variables est %s %s et %s", result, result2, nomDeVariable));
      /// ↓↑
      System.out.printf("Le contenu de mes variables est %s %s et %s", result, result2, nomDeVariable);

      /// ********** LES TYPES **********

      /// Les entiers (integer)
      byte octet = 127; /// Sur 8 bits et sert à représenter les petits nombres, valeur de -128 à 127.
      short unPeuPlusGrand = 2314;   /// Sur 16 bits, valeur de -32768 à 32767
      int entier = 843215; /// Sur 32 bits, valeur de -2147483648 à 2147483647 (type par défaut des entiers)
      long entierLong = 946134843564L;  /// Sur 64 bits, valeur de -9223372036854775808 à 9223372036854775807 (L à la fin du nombre, précise au compilateur qu'il s'agit d'un long).

      /// Les flottants (float)
      float petitFloat = 42.4f;  /// Sur 32 bits, valeur de 1.401e-045 à 3.40282e+038 (f à la fin du nombre, précise au compilateur qu'il s'agit d'un float).
      double grandFloat = 8431.4325;   /// Sur 64 bits, valeur de 2.22507e-308 à 1.79769e+308 (type par défaut des flottants)

      /// Les caractères (character)
      char uneLettre = 'f';   /// La valeur de char toujours avec les simple quote ''

      /// Les booléens (booleans)
      boolean uneCondition = true;  /// Valeurs : true ou false

      /// Les chaînes de caractères (string) !!! n'est pas un type natif, mais un objet !!!
      String uneChaine = "Hello World";   /// La valeur de String toujours avec les double quotes "" (Attention à la majuscule pour String)

      /// Inférence (Le compilateur va déduire par lui-même le type de la variable)
      var nImporteQuoi = 12;
      var nImporteQuoi2 = false;
      var nImporteQuoi3 = "Greetings";

      /// ********** LES CONVERSIONS DE TYPES **********

      /// *** Conversion implicite ***

      /// byte → int
      byte fromByte = 12;
      int toInt = fromByte;
      System.out.println(toInt);

      /// float → double
      float fromFloat = 12.43f;
      double toDouble = fromFloat;
      System.out.println(toDouble);

      /// char → int (va retourner la valeur unicode du caractère)
      char fromChar = 'f';
      int toInt2 = fromChar;
      System.out.println(toInt2);

      /// *** Conversion explicite ***

      /// Le cast
      int valeurDeF = 102;
      char f = (char) valeurDeF;
      System.out.println(f);

      /// !!! Attention à la perte d'informations !!!
      float fromFloat2 = 12.5f;
      int toInt3 = (int) fromFloat2;
      System.out.println(toInt3);   /// Retourne 12, on a perdu la précision

      /// !!! Attention au dépassement de la valeur maximale autorisée par la variable !!!
      int fromInt = 128;
      byte toByte = (byte) fromInt;
      System.out.println(toByte);   /// Retourne -128, car la valeur max de byte est 127, la différence de 1 (128 - 127 = 1) fait que l'on repart à la valeur minimale du type byte (-128)

      /// Convertir une chaine de caractères de chiffres en entiers (ne fonctionne pas si des lettres ou des caractères spéciaux se trouvent dans la chaîne de caractères à convertir)
      String fromString = "123";
      int integer = Integer.valueOf(fromString);
      System.out.println(integer);

      /// Convertir un entier en chaine de caractères
      int fromInt2 = 123;
      String toString = String.valueOf(fromInt2);
      System.out.println(toString);

      /// ********** LES OPÉRATEURS **********

      /// *** Opérateurs de calculs ***

      /// Trois types d'opérateur : unaire (-12), binaire (10 + 2) et ternaire (condition ? true : false)

      /// Addition, soustraction, multiplication, division, modulo (reste de la division entière)
      int addition = 1 + 2;
      int soustraction = 2 - 1;
      int multiplication = 2 * 3;
      int division = 15 / 5;
      int modulo = 16 % 3; /// Retourne 1

      /// Il est possible de faire des opérations avec des caractères (grâce au code Ascii qu'a chaque caractère).
      var myChar = 'A';
      /// A = 65, B = 66 → 65 + 66 = 131 → Ascii 131 = â
      System.out.println((char)(myChar + 'B'));

      /// *** Opérateurs d'assignation ***

      /// = → assignation d'une valeur
      int addition2 = 1 + 2;
      addition2 += 5; /// addition = addition + 5
      System.out.println(addition2);   /// 8
      addition2++; /// addition += 1 → addition = addition + 1
      System.out.println(addition2);   /// 9

      /// *** Opérateurs de comparaison ***

      var plusPetit = 4;
      var plusLong = 8;

      var comparaison = plusPetit == plusLong;  /// Vérifie l'égalité → false
      var comparaison2 = plusPetit < plusLong;  /// Vérifie si plus petit → true
      var comparaison3 = plusPetit > plusLong;  /// Vérifie si plus grand → false
      var comparaison4 = plusPetit <= plusLong;  /// Vérifie si plus petit OU égale → true (car l'une des deux conditions est remplie)
      var comparaison5 = plusPetit >= plusLong;  /// Vérifie si plus petit OU égale → false
      var comparaison6 = plusPetit != plusLong;  /// Vérifie si différent → true

      System.out.println(comparaison);

      /// !!! Pour vérifier l'égalité entre deux strings, on utilise la méthode String.equals("test", "test") !!!

      /// *** Opérateurs logiques ***

      /// && → ET : Les conditions doivent toutes être remplies pour retourner true
      /// || → OU : Une seule condition doit être remplie pour retourner true
      /// ! → Négation : Inverse la valeur booléenne (!true = false)

      /// *** Priorité des opérateurs ***

      /// Voir → https://developer.mozilla.org/fr/docs/Web/JavaScript/Reference/Operators/Operator_precedence

      /// ********** MUTABILITÉ ET IMMUABILITÉ **********

      var mutable = 5;
      mutable = 3;

      final var immuable = 6; /// Le mot clé final rend la variable constante
      // immuable = 4;  /// va générer une erreur

      /// ********** L'ARITHMÉTIQUE EN JAVA **********

      /// *** Avec les entiers ***

      // var devideByZero = 10 / 0; /// Retourne "ArithmeticException: / by zero" étant donné qu'on ne peut pas diviser par zéro.

      /// *** Avec les flottants ***

      /// ↓ Ces comportements avec les flottants sont l'application de la norme IEEE754. Cela permet de représenter les valeurs non finies.

      var devideFloats = 10.0 / 0.0;   /// Retourne Infinity

      var undefined = Float.NaN;
      var infinity = Float.POSITIVE_INFINITY;
      var negativeInfinity = Float.NEGATIVE_INFINITY;

      var undefined2 = Double.NaN;
      var infinity2 = Double.POSITIVE_INFINITY;
      var negativeInfinity2 = Double.NEGATIVE_INFINITY;

      /// ********** STRUCTURES DE CONTRÔLE **********

      /// *** if, else if et else ***

      var condition = true;

      /// La condition if peut être écrite sur une ligne SI et SEULEMENT SI on a une seule instruction.
      if(condition) System.out.println("Je passe dans la condition");

      /// ----------

      var saisieUtilisateur = new Scanner(System.in);

      System.out.println("Saisissez votre âge :");
      var age = saisieUtilisateur.nextInt();

      if (age <= 0) {
         System.out.println("Votre âge ne peut pas être inférieur ou égale à zéro.");
      } else if(age < 18){
         System.out.println("Vous êtes mineur.");
      } else {
         System.out.println("Vous êtes majeur.");
      }

      /// *** switch ***

      var saisieChiffre = new Scanner(System.in);

      System.out.println("Saisissez un chiffre entre 1 et 5 :");
      var chiffre = saisieChiffre.nextInt();

      switch(chiffre) {
         case 1:
            System.out.println("I");
            break;
         case 2:
            System.out.println("II");
            break;
         case 3:
            System.out.println("III");
            break;
         case 4:
            System.out.println("IV");
            break;
         case 5:
            System.out.println("V");
            break;
         default:
            System.out.println("Entrée invalide. Vous n'avez pas respecté la consigne !");
      }

      /// *** Ternaire ***

      /// Condition ? true : false (Résultat assignable à une variable, car c'est une expression)

      var saisieAge = new Scanner(System.in);

      System.out.println("Saisissez votre âge :");
      var age2 = saisieChiffre.nextInt();

      if (age2 <= 0) {
         System.out.println("Erreur : Votre âge ne peut pas être inférieur ou égale à 0");
      }
      else {
         var isMajorString = age2 >= 18 ? "Vous êtes majeur." : "Vous êtes mineur"; /// Ternaire
         System.out.println(isMajorString);
      }

      /// ********** LES ITÉRABLES **********

      /// *** Tableau ***

      /// Le nombre d'éléments est fixe.

      int[] entiers = {1, 2, 3};

      int[] entiers2 = new int[10]; /// Crée dix éléments de valeur 0 par défaut
      entiers2[0] = 2;

      /// *** Liste ***

      /// Le nombre d'éléments peut être modifiable.

      /// ↓ ArrayList<Integer> entiersListe = new ArrayList<>();
      var entiersListe = new ArrayList<Integer>();

      entiersListe.add(6);
      entiersListe.add(2);
      entiersListe.add(1);

      System.out.println(entiersListe);   /// Retourne [6, 2, 1]
      System.out.println(entiersListe.get(1));  /// Retourne 2

      /// ********** LES BOUCLES **********

      /// *** Boucle FOR ***

      /// Classique
      for (int i = 0; i < 10; i++) {
         System.out.println("i = " + i);
      }

      /// Parcourir une collection
      /// ↓ Même chose pour un tableau
      var fruitsList = new ArrayList<String>();

      fruitsList.add("pommes");
      fruitsList.add("poires");
      fruitsList.add("pêches");

      for(String fruit : fruitsList) {
         System.out.println(fruit);
      }

      /// *** Boucle WHILE ***

      /// While
      var compteur = 0;

      while (compteur < 10) {
         System.out.println(compteur);
         compteur++;
      }

      /// Do while
      compteur = 0;

      do {
         System.out.println(compteur);
         compteur++;
      }while(compteur > 10);

      /// ********** LES INSTRUCTIONS CONTINUE ET BREAK **********

      var fruits = new ArrayList<String>();
      fruits.add("Pommes");
      fruits.add("Poires");
      fruits.add("Pêches");

      for (String fruit : fruits) {
         if (fruit.equals("pommes")){
            continue;   /// Continue fera passer à l'itération suivante, pommes ne s'affichera pas
         }
         System.out.println(fruit);
      }

      for (String fruit : fruits) {
         if (fruit.equals("poires")){
            break;   /// Étant donné que "poires" est le second élément de la liste, on entre dans la condition au second tour et "break" nous fait sortir de la boucle. Seul "Pommes" s'affichera.
         }
         System.out.println(fruit);
      }

      /// ********** LES FONCTIONS **********

      ///  Il est important de retenir qu'on ne peut pas définir des fonctions en dehors des class en Java, ce qui est différent de la plupart des langages de programmation.

      /// Une fonction "public" peut être appelée par n'importe quelle autre fonction dans le code.
      /// Une fonction "private" ne peut être appelée que par des fonctions de la même class que celles de la fonction private.
      /// Il faut obligatoirement préciser si les fonctions sont "public" ou "private".

      /// Méthodes statiques : ça veut dire qu'elles sont définies obligatoirement à l'intérieur d'une class sans pour autant être des fonctions liées aux objets. Sans le mot-clé static, cela correspond alors à des méthodes pour les objets.

      /// *** Fonction statique ***

      // public static void uneFonction(int chiffre){
      //   System.out.println("Une fonction : " + chiffre);
      //}
      var result3 = uneFonction(12);
      System.out.println(result3);

      /// *** varargs ***

      /// Il est possible de définir des paramètres indéfinis en taille en utilisant la notation ... qui correspond aux varargs
      /// Un vararg est en fait un tableau techniquement parlant. Il s'agit ici d'un sucre syntaxique qui permet d'éviter de définir un tableau lors de l'invocation de la fonction : on passe alors autant d'arguments que nécessaire plutôt qu'un tableau.

      //public static void afficher(String... chaines){
      //   for (String chaine : chaines) {
      //      System.out.println(chaine);
      //   }
      // }
      afficher("Victor", "Hugo", "Jean"); ///Exemple d'invocation à utiliser dans une fonction
      
      /// *** Javadoc ***

      /// Permet de créer la définition de la fonction.
      // /**
      //   * Cette fonction additionne deux paramètres
      //   * passés en entrée et retourne le résultat de l'addition.
      //   * @param entier1 Le premier entier à additionner
      //   * @param entier2 Le second entier à additionner
      //   * @return int Le résultat de l'addition
      //   */

      /// Permet également de générer la documentation de l'application
      /// Dans le terminal → javadoc -d javadoc src/* (-d précise le dossier de sortie, ici javadoc)

      // private static int addition3(int entier1, int entier2) {
      //   return entier1 + entier2;
      // }

      var result4 = addition3(5, 12);

   }

   /// ↓ javadoc
   /**
    * Cette fonction additionne deux paramètres
    * passés en entrée et retourne le résultat de l'addition.
    * @param entier1 Le premier entier à additionner
    * @param entier2 Le second entier à additionner
    * @return int Le résultat de l'addition
    */

   public static int addition3(int entier1, int entier2) {
      return entier1 + entier2;
   }

   /// *** Fonction statique ***
   public static String uneFonction(int chiffre){
      return ("Une fonction : " + chiffre);
   }

   /// *** varargs ***
   public static void afficher(String... chaines){
      for (String chaine : chaines) {
         System.out.println(chaine);
      }
   }

}

import java.util.*;

public class Main {
   public static void main(String[] args) {

      /// ********** TABLEAUX **********

      /// *** Déclaration ***
      var entiers = new int[3];   /// Crée un nouveau tableau de trois éléments de valeur "0" par défaut → [0, 0, 0].
      var entiers2 = new int[] {1, 2, 3}; /// Crée un nouveau tableau de trois éléments → [1, 2, 3].

      for(int entier : entiers){
         System.out.println(entier);
      }
      for(int entier : entiers2){
         System.out.println(entier);
      }

      /// *** Tableau à deux dimensions ***
      /// On peut créer autant de dimensions que l'on souhaite.
      var entierDeuxDimensions = new int[][] { {1, 7, 9}, {2, 7, 1}, {2, 8, 3} };

      System.out.println(entierDeuxDimensions[0][0]); /// Retourne 1
      System.out.println(entierDeuxDimensions[2][1]); /// Retourne 8

      /// *** Modification de valeur ***

      entierDeuxDimensions[2][1] = 12;
      System.out.println(entierDeuxDimensions[2][1]); /// La valeur est passée de 8 à 12.

      /// *** Pour itérer ***

      var entierTroisDimensions = new int[][][] {
        { {1, 7, 9}, {2, 7, 1}, {2, 8, 3} },
        { {1, 7, 9}, {2, 7, 1}, {2, 8, 3} },
      };

      for ( int[][] premiereDimension  : entierTroisDimensions) {

         for ( int[] deuxiemeDimension : premiereDimension ) {

            for (int troisiemeDimension  : deuxiemeDimension ) {
               System.out.println(troisiemeDimension );
            }
         }
      }

      /// ********** COLLECTIONS **********

      /// *** Les collections de type List et Set ***

      /// Les collections qui implémentent List et Set héritent de Collection et Iterable.
      /// La raison de ces héritages vient de la grande similarité des deux types de collections :
      /// → Les instances de List sont des collections ordonnées dont l'ordre est défini par l'ordre dans lequel les éléments ont été ajoutés.
      /// → Les instances de Set sont similaires à List mais elles assurent que chaque valeur des Set est unique
      ///   * Assure l'unicité des éléments grâce à la fonction equals du type de la collection
      /// Le cas de SortedSet : Permet la définition de collections de type Set avec un mécanisme de tri pour que tous les éléments ajoutés suivent un certain ordre.

      /// *** Les collections de type Map ***

      /// Ces collections un peu particulières ne peuvent pas hériter de l'interface Collection, car leur fonctionnement de base diffère des List et Set.
      /// En effet, les éléments des Map sont stockées grâce à une clé + une valeur. Il y a donc deux composantes différentes pour chaque élément. Les méthodes de lecture et écriture sont donc forcément différentes des Collection.
      /// Le cas de SortedMap : Permet la définition de collections de type Map avec un mécanisme de tri pour que tous les éléments ajoutés suivent un certain ordre.

      /// *** Type List ***

      var liste = new ArrayList<Integer>();

      liste.add(2);
      liste.add(9);
      liste.add(1);
      liste.add(8);
      liste.add(55);

      /// Ajouter une valeur à la liste
      liste.add(2, 10); /// Ajoute 10 à l'index 2 de la liste

      /// Remplacer une valeur de la liste
      liste.set(3, 11); /// Remplace la valeur 1 du troisième élément par la valeur 11

      /// Retirer un élément de la liste à l'index donné
      liste.remove(3);  /// Le troisième élément de la liste est retiré. (11)

      /// Vérifier si une valeur est présente au moins une fois dans la liste
      liste.contains(55);  /// true

      if(liste.contains(55)){
         System.out.println("La liste contient la valeur 55");
      }

      for (int item : liste) {
         System.out.println(item);
      }

      /// !!! À l'instar des tableaux, on peut créer des listes à plusieurs dimensions !!!
      var listeMultiDimensions = new ArrayList<ArrayList<ArrayList<Integer>>>();

      listeMultiDimensions.add(new ArrayList<>()); /// Ajoute une liste à la première dimension de liste listeMultiDimensions
      listeMultiDimensions.add(new ArrayList<>()); /// Ajoute une deuxième liste à la première dimension de liste listeMultiDimensions
      listeMultiDimensions.add(new ArrayList<>()); /// Ajoute une troisième liste à la première dimension de liste listeMultiDimensions

      listeMultiDimensions.get(1).add(new ArrayList<>());   /// Ajoute une liste à la deuxième dimension de liste listeMultiDimensions
      listeMultiDimensions.get(1).add(new ArrayList<>());   /// Ajoute une deuxième liste à la deuxième dimension de liste listeMultiDimensions

      listeMultiDimensions.get(1).get(1).add(123); /// Ajoute la valeur 123 à la deuxième liste de la seconde dimension

      /// *** Type Set (Les ensembles) ***

      /// Les Set permettent de définir des ensembles : il n'est donc pas possible d'avoir des valeurs dupliquées dans les Set.

      // var ensemble = new HashSet<String>();

      /// ↓ TreeSet<> fait la même chose que HashSet<>, mais en le triant, par défaut, dans l'ordre naturel.
      // var ensemble = new TreeSet<String>();

      /// ↓ On peut modifier le comportement par défaut de tri du TriSet<>. Ici, on inverse le tri.
      var ensemble = new TreeSet<String>(new Comparator<String>() {
         @Override
         public int compare(String o1, String o2) {
            return o2.compareTo(o1);
         }
      });

      ensemble.add("abc");
      ensemble.add("abc");
      ensemble.add("djziao");
      ensemble.add("ddd");
      // ensemble.add(null);
      ensemble.add("ddd");
      ensemble.add("ddd");
      ensemble.add("aaaaaa");
      // ensemble.add(null);

      System.out.println(ensemble); /// Ne retourne pas les duplicatas

      if(ensemble.contains("ddd")) {
         System.out.println("La valeur existe");
      }

      for(String value : ensemble) {
         System.out.println(value);
      }

      /// *** Type Map ***

      /// Les Map sont des collections qui fonctionnent par clé / valeur. Chaque enregistrement dans les Map possèdent donc deux éléments.
      /// Ces types de collections sont très puissants, car ils permettent de relier des valeurs à des index et de rendre l'accès aux données plus performant.
      /// !!! Important : Les Map requièrent deux types différents dans l'opérateur diamant<>. Ils sont nécessaires pour typer les clés et les valeurs de la collection. !!!

      // var departements = new HashMap<Integer, String>();

      /// ↓ TreeMap<> fait la même chose que HashMap<>, mais en le triant, par défaut, dans l'ordre naturel.
      // var departements = new TreeMap<Integer, String>();

      /// ↓ On peut modifier le comportement par défaut de tri du TreeMap<>. Ici, on inverse le tri.
      var departements = new TreeMap<Integer, String>(new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {
            return o2 - o1;
         }
      });

      /// ↓ La méthode put permet l'ajout ou la modification d'un enregistrement de la collection en se basant sur la clé pour l'identifier
      departements.put(1, "Ain");
      departements.put(2, "Aisnes");
      departements.put(111, "fzfzfc");

      departements.put(1, "Ain modifié");

      System.out.println(departements);

      /// Il est également possible de lire ou de supprimer des valeurs en se basant sur la clé
      // departements.remove(2);
      System.out.println(departements.get(2));

      if(departements.containsKey(1)) {
         System.out.println("La clé existe");
      }
      if(departements.containsValue("Ain modifié")) {
         System.out.println("La valeur existe");
      }

      /// !!! Attention pour l'itération !!!
      for(Map.Entry departement : departements.entrySet()){
         System.out.println("Clé: " + departement.getKey() + " Valeur: " + departement.getValue());
      }

      /// *** HashCode ***

      /// La méthode hashCode() est essentiellement utilisée par les collections pour optimiser le classement et la recherche de leurs éléments.
      /// Il faut s'assurer que les valeurs de hash des objets qui sont utilisées comme clés dans une Map soient suffisamment diversifiées pour ne pas avoir
      /// de problèmes de performances notamment si le nombre d'occurrences dans la collection est important.
      /// Il est aussi très important que la valeur du hashcode ne change pas pour une instance qui est utilisée comme clé dans une collection de type Map.
      /// Pour s'éviter des ennuis difficilement détectables, il faut absolument utiliser des objets immuables comme clés dans une collection de type Map.

      /// * Optimisation des collections *

      /// Pour retrouver une instance dans une collection, le plus simple est de parcourir tous les éléments jusqu'à ce que l'on trouve l'élément ou que tous les éléments aient été parcourus.
      /// Malheureusement, cette solution n'est pas la plus performante puisque son temps d'exécution maximum est proportionnel au nombre d'éléments dans la collection.

      /// Pour optimiser cette recherche, les collections utilisent la valeur de la méthode hashCode() pour regrouper les éléments ayant la même valeur ou appartenant à une plage de valeurs.
      /// Le test d'égalité est ainsi fait sur l'ensemble des éléments qui font partis du même groupe. D'où le besoin de redéfinir equals et hashCode en même temps, ces deux méthodes sont en fait très liées.

      /// Lors de la recherche d'un élément, sa valeur de hachage est utilisée pour déterminer son groupe d'appartenance, l'objet est recherché dans ce groupe plutôt que dans toute la collection.
      /// L'algorithme de recherche est ainsi optimisé.

   }
}
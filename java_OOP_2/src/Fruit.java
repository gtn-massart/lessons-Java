/// ********** RECORD **********

/// *** AVANTAGES ***

/// Les records sont un type de classe Java qui proposent une syntaxe compacte pour la déclaration de classes aux fonctionnalités restreinte qui agrègent des valeurs de manière immuable.

/// !!! Il est conseillé de définir des records plutôt que des classes à chaque fois que c'est possible, car cela simplifie grandement le code à produire. !!!

/// Les records répondent aux besoins suivants :
/// → Créer facilement des objets qui expriment une simple agrégation de valeurs immuables.
/// → Implémenter automatiquement des méthodes orientées données telles que les accesseurs (uniquement get) et les méthodes equals(), hashCode() et toString().

/// *** LIMITATIONS ***

/// Les records sont donc des classes simplifiées, mais avec les limitations suivantes :
/// → C'est une classe finale qui ne peut donc pas être enrichie par héritage d'un autre record ou d'une autre classe.
/// → Chaque élément de la description est encapsulé dans un attribut private et final pour garantir l'immuabilité.
/// → Un getter public existe pour chaque élément. (Pas de setter)
/// → Un constructeur public qui possède la même signature que celle de la description du record.
/// → une redéfinition des méthodes equals() et hashCode() qui garantit que deux instances sont égales si elles sont du même type et qu'elles contiennent les mêmes éléments.

// public record Fruit(String nom, String couleur, String origine) {}

/// ********** CLASSE INTERNE **********
public class Fruit {

   public FruitInterne fruitInterne;

   public Fruit() {
     fruitInterne = new FruitInterne();
   }

   public class FruitInterne {
      public String nomInterne = "nom interne";
   }
}

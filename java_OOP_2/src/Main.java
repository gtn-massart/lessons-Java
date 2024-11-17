public class Main {
   public static void main(String[] args) {

      /// ********** RECORD **********

      // var pomme = new Fruit("Pomme", "Verte", "Belgique");
      // var pomme2 = new Fruit("Pomme", "Verte", "Belgique");

      // System.out.println(pomme);
      // System.out.println(pomme.equals(pomme2));
      // System.out.println(pomme.origine());


      /// ********** INTERFACE **********

      var voiture = new Voiture();

      /// Méthode implémentée par défaut via l'Interface Motorise
      voiture.pleinEssence();

      /// ********** CLASSE INTERNE **********

      var fruit = new Fruit();
      System.out.println(fruit.fruitInterne.nomInterne);

   /// ********** ÉNUMÉRATION **********

      Jour jour = Jour.Lundi;
      System.out.println(jour);

   }
}
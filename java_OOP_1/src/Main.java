public class Main {
   public static void main(String[] args) {

      /// ↓ Création d'une nouvelle instance de Fruit et assignation à la variable fruit.
      Fruit fruit = new Fruit("Poire", "Verte", "Belgique");
      /// ↓ Par inférence
      // var fruit = new Fruit("Poire", "Verte", "Belgique");

      // System.out.println(fruit.nom);
      // System.out.println(fruit.couleur);
      // System.out.println(fruit.origine);

      /// ↓ Grâce à la surcharge de constructeur, nous pouvons instancier un Fruit avec comme seul attribut, "nom".
      Fruit fruit2 = new Fruit("Pommes");

      // System.out.println(fruit2.nom);
      // System.out.println(fruit2.couleur);
      // System.out.println(fruit2.origine);

      /// ↓ Je peux utiliser pi de la classe Constante sans créer de nouvel objet, car l'attribut pi est public final static.
      // System.out.println(Constant.pi);

      /// *** MÉTHODES ***

      Fruit fruit3 = new Fruit("Banane", "Jaune", "Inde");

      // System.out.println(fruit.estBelge());  /// true
      // System.out.println(fruit3.estBelge()); /// false

      /// ↓ Surcharge de méthode
      // System.out.println(fruit.estBelge(6)); /// 6 true

      /// *** ACCESSEUR (get, set) ***

      Fruit fruit4 = new Fruit("Fraise", "Rouge", "France");

      /// ↓ Si on essaye d'accéder directement à une propriété en private de l'objet, ça ne fonctionne pas.
      // System.out.println(fruit4.private_nom);   /// Retourne une erreur car on n'y a pas accès

      /// ↓ Il faut pour cela passer par une méthode get
      System.out.println(fruit4.getPrivateNom());

      /// Via la méthode set, nous pouvons modifier la propriété couleur
      System.out.println(fruit4.getPrivateCouleur());
      fruit4.setPrivateCouleur("Vert");
      System.out.println(fruit4.getPrivateCouleur());

      /// *** HÉRITAGE ***

      /// ↓ Création d'une nouvelle instance de la classe Banane (qui hérite de la classe Fruit)
      Banane myBanane = new Banane("Brésil");

      /// ↓ On peut utiliser les méthodes de la classe dont elle hérite (Fruit)
      System.out.println(myBanane.getPrivateOrigine());

      /// ↓ Override de la méthode getPrivateNom() venant de la classe dont elle hérite (Fruit)
      System.out.println(myBanane.getPrivateNom());

   }
}
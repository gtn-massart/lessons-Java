public class Fruit {

   /// Une classe privée peut être créée uniquement dans une autre classe qui, elle, est publique
   // private class MyPrivateClass { }

   /// Attributs (ou propriétés) → variables de classe
   public String nom;
   public String couleur;
   public String origine;

   private String private_nom;
   private String private_couleur;
   private String private_origine;

   /// Constructeur → Fonction qui a pour vocation de créer des objets grâce au mot-clé "new"
   // public Fruit(String nom, String couleur, String origine){
   //    /// this fait référence à l'objet instancié
   //    this.nom = nom;
   //    this.couleur = couleur;
   //    this.origine = origine;
   // }

   /// Surcharge de constructeur
   public Fruit (String nom) {
      this.nom = nom;
   }

   /// Constructeur pour private
   public Fruit(String nom, String couleur, String origine){
      /// this fait référence à l'objet instancié
      this.private_nom = nom;
      this.private_couleur = couleur;
      this.private_origine = origine;
   }


   /// *** MÉTHODES ***

   public boolean estBelge(){
      /// ↓ Pas besoin du mot-clé this devant origine, car celui-ci est implicite
      if(origine.equals("Belgique")) return true;
      return false;
   }

   /// ↓ Surcharge de méthode
   public boolean estBelge(int entier){
      System.out.println(entier);
      if(origine.equals("Belgique")) return true;
      return false;
   }

   /// *** ACCESSEUR (get, set) ***

   /// Les getters sont des accesseurs de lecture. Il est possible de définir le getter de l'attribut private_nom de la manière suivante :
   public String getPrivateNom() {
      return private_nom;
   }
   public String getPrivateCouleur() {
      return private_couleur;
   }
   public String getPrivateOrigine() {
      return private_origine;
   }

   /// ↓ !!! Attention au set qui rend l'objet mutable !!!
   // public void setPrivate_nom(String nom) {
   //    this.private_nom = nom;
   // }

   /// ↓ On préfèrera l'écriture ci-dessous, en retournant l'objet instancié.
   /// Les setters sont des accesseurs d'écriture. Il est possible de définir le setter de l'attribut private_nom de la manière suivante :
   public Fruit setPrivateNom(String nom){
      this.private_nom = nom;
      return this;
   }
   public Fruit setPrivateCouleur(String couleur){
      this.private_couleur = couleur;
      return this;
   }
   public Fruit setPrivateOrigine(String origine){
      this.private_origine = origine;
      return this;
   }

   /// *** HÉRITAGE ***

   /// L'héritage permet de créer des classes "enfants" d'autres classes afin d'hériter automatiquement de leurs comportements.
   /// !!! L'héritage multiple n'existe pas en Java, ce qui signifie qu'une classe ne peut pas hériter de plusieurs classes parentes, mais d'une seule. !!!

   /// Cf classe Banane

   /// !!! On ne peut pas hériter d'une classe déclarée avec le mot-clé "final" !!!

   /// *** ABSTRACT ***

   /// Rendre une classe abstraite empêche l'instanciation de celle-ci.
   /// Cependant, les classes qui héritent de la classe abstraite sont instanciables et auront accès aux propriétés et aux méthodes de ladite classe abstraite.

   /// On peut également abstract une méthode SEULEMENT SI la classe elle-même est abstract
   /// Pour ce faire, on va seulement la déclarer sans corp.
   /// !!! S'il y a une méthode abstract dans la classe parente, les classes héritées devront OBLIGATOIREMENT l'implémenter en faisant un Override de la méthode.
   // public abstract void methodeAbstraite();
}

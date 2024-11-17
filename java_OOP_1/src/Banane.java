public class Banane extends Fruit{

   /// Constructeur
   public Banane(String origine){
      /// super() invoque le constructeur de la classe parente et permet d'utiliser les propriétés de celle-ci. Ici, la classe parente est Fruit.
      super("Banane", "Jaune", origine);
   }

   @Override
   /// On peut Override uniquement les méthodes public de la classe dont elle hérite
   public String getPrivateNom() {
      /// super. permet d'utiliser les méthodes de la classe héritée, ici, Fruit.
      return "Je viens de l'Override de la méthode getPrivateNom(). Je suis appelé depuis une instance de la classe Banane. " + super.getPrivateNom();
   }

   /// *** ABSTRACT ***
   // @Override
   // public void methodeAbstraite() {
   //    System.ou.println("Ma méthode abstraite")
   // }

}

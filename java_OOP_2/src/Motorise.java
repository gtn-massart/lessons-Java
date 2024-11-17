/// ********** INTERFACE **********

/// Une classe peut hériter que d'une seule autre classe, mais peut implémenter plusieurs interfaces.

public interface Motorise {

   /// Déclarée de la sorte, nous devrons Override la méthode dans la classe implémentant l'interface
   // void pleinEssence();

   /// On peut leur donner un comportement par défaut. Nous pourrons quand-même la surcharger (Override).
   default void pleinEssence() {
      System.out.println("Plein d'essence");
   }

}

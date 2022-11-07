/**
 * personnel( classe representant tous le personelle) ,
 */

class Personnel {

  private String Matricule, Nom;
  private final int indice = 3;
  private double sal;

  Personnel(String Matricule, String Nom, double sal) {
    this.Matricule = Matricule;
    this.Nom = Nom;
    this.sal = sal;
  }

  /* */
  double Salaire() { //fonction qui me permet de calculer le salaire
    return sal * indice;
  }

  /**
   *
   */
  public void Display() { //fonction d'affichage des information relatif à chaque employer
    System.out.println("...............................................");
    System.out.println("bienvenue Mr/Mme " + this.Nom);
    System.out.println("votre Matricule: " + this.Matricule);
    System.out.println("Indice Salarial : " + this.indice);
    System.out.println("Salaire " + Salaire());
    System.out.println("...............................................");
  }
}

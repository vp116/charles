/* question 2 */

public class Cadre extends Personnel {

  Personnel[] sub; // les subalterne

  Cadre(Personnel[] sub, String Matricule, String Nom, double sal) {
    super(Matricule, Nom, sal);
    this.sub = sub;
  }
}

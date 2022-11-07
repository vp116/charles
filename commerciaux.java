;

class Commerciaux extends Personnel { /*declaration de la classe attribut de la classe commercial*/
    int ventes ;
    double interressement;

    Commerciaux ( int ventes, String Matricule, String Nom, double sal, double inter) {
        super(Matricule, Nom,  sal);
        this.ventes = ventes;
        this.interressement = inter;

    }

    void listVentes() {
        System.out.println(ventes);
    }

    void modifVente(int v ){
        ventes = v ;
    }

    @Override// ceux-ci permet de redefinire la classe vente
    double Salaire(){
        return super.Salaire() + interressement;
    }
}
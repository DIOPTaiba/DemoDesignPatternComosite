public class Developpeur extends Employe {


    public Developpeur(String nom, double salaire) {
        super(nom, salaire);
    }


    @Override
    public void print() {

        String tab = tabulation();
        System.out.println(tab + "Nom = " + nom);
        //System.out.println(tab+"Salaire = "+salaire);

    }
}

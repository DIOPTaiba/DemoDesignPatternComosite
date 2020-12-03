public abstract class Employe {

    protected String nom;
    protected double salaire;
    protected int niveau;

    public Employe(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public abstract void print();

    public String tabulation() {
        String tab = "";
        for (int i = 0; i < niveau; i++) {
            tab += "\t";
        }
        return tab;
    }
}

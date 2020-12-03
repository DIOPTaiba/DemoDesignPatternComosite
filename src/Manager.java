import java.util.ArrayList;
import java.util.List;

public class Manager extends Employe {


    private List<Employe> employes = new ArrayList<>();

    public Manager(String nom, double salaire) {
        super(nom, salaire);
    }

    public Employe addEmploye(Employe employe) {
        employe.niveau = this.niveau + 1;
        this.employes.add(employe);
        return employe;
    }

    public void removeEmploye(Employe employe) {
        employes.remove(employe);
    }


    @Override
    public void print() {

        String tab = tabulation();
        System.out.println(tab + "Nom = " + nom);
        //System.out.println(tab+"Salaire = "+ salaire);

        for (Employe employe : employes) {
            employe.print();
        }

    }
}

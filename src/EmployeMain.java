public class EmployeMain {

    public static void main(String[] args) {

        Manager generalManager = new Manager("generalManager", 1000000);

        Manager manager1 = new Manager("manager1", 500000);
        Manager manager2 = new Manager("manager2", 500000);
        Manager manager3 = new Manager("manager3", 500000);
        Manager manager4 = new Manager("manager4", 500000);

        generalManager.addEmploye(manager1);
        generalManager.addEmploye(manager2);
        generalManager.addEmploye(manager3);

        manager1.addEmploye(new Developpeur("Developpeur1", 300000));
        manager1.addEmploye(new Developpeur("Developpeur2", 250000));

        manager2.addEmploye(new Developpeur("Developpeur3", 150000));
        Developpeur dev2 = (Developpeur) manager2.addEmploye(new Developpeur("Developpeur4", 350000));
        Developpeur dev3 = (Developpeur) manager2.addEmploye(new Developpeur("Developpeur5", 200000));

        manager3.addEmploye(new Developpeur("Developpeur6", 300000));
        manager3.addEmploye(manager4);
        manager4.addEmploye(new Developpeur("Developpeur7", 300000));

        generalManager.print();

        manager2.removeEmploye(dev2);
        manager2.removeEmploye(dev3);

        System.out.println("==========================================");
        generalManager.print();

        generalManager.removeEmploye(manager1);
        System.out.println("==========================================");
        generalManager.print();


    }
}

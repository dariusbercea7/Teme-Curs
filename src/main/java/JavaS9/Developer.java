package JavaS9;

public class Developer extends Angajat {
    private String tipDevelopment;

    public String getTipDevelopment() {
        return tipDevelopment;
    }

    Developer(String nume, double salariu, String tipDevelopment) {
        // super apeleaza constructorul parintelui
        super(nume, salariu);
        this.tipDevelopment = tipDevelopment;

    }

    public void scrieBug() {
        System.out.println(nume + " a gasit un defect in aplicatie!");
    }
}


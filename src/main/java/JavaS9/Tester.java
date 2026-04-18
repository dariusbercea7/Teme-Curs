package JavaS9;

public class Tester extends Angajat {
    private String tipTestare;

    public String getTipTestare() {
        return tipTestare;
    }

    Tester(String nume, double salariu, String tipTestare) {
        // super apeleaza constructorul parintelui
        super(nume, salariu);
        this.tipTestare = tipTestare;
        System.out.println("A fost apelat constructorul din clasa Copil");
    }
    @Override
    public void lucreaza(){
        System.out.println(nume + "are rolul de tester " + " a gasit un defect in aplicatie!");}

    public void scrieBug() {
        System.out.println(nume + " a gasit un defect in aplicatie!");
    }
}

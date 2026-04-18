package JavaS9;

public class Angajat {
    String nume;
    double salariu;

    Angajat(){
        this.nume = "Marian";
        this.salariu = 5000;
    }

    Angajat(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
        System.out.println("A fost apelat constructorul din parinte");
    }

    public void lucreaza() {
        System.out.println(nume + " isi indeplineste sarcinile. Salarius este : " + salariu);
    }
}


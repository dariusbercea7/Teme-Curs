package JavaS9;

public class AngajatTest {
    public static void main(String[] args) {
//        Tester tester = new Tester("Darius", 5000, "QA Automation");
//
//
//        System.out.println("tipTestare: " + tester.getTipTestare() + " nume: " + tester.nume + " salariu: " + tester.salariu);
//        tester.scrieBug();
//        tester.lucreaza();
//        Angajat angajat = new Angajat();
//        angajat.lucreaza();
//        Angajat developer = new Developer("Marius", 2000, "FrontEnd");
//        angajat.lucreaza();
//    }
        Angajat angajat = new Angajat();
        Angajat tester =  new Tester("LAra", 2000, "manual");
        angajat.lucreaza();
        tester.lucreaza();





}}

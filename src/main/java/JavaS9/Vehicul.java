package JavaS9;

abstract class Vehicul {
    // Metoda fara corp - copiii SUNT OBLIGATI sa o implementeze
    abstract void accelereaza();

    // Metoda concreta - poate fi mostenita direct
    void claxoneaza() {
        System.out.println("Beep! Beep!");
    }
}


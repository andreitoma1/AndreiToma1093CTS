package decorator.main;

import decorator.clase.PrinterBilet;
import decorator.clase.PrinterBiletConcret;
import decorator.clase.decorator.Decorator;
import decorator.clase.decorator.PrinterMesajPaste;
import decorator.clase.decorator.PrinterMesajSpecial;

public class Main {
    public static void main(String[] args) {
        PrinterBilet printerBilet = new PrinterBiletConcret("1/12/2022", 10);
        printerBilet.afiseazaDescriere();

        Decorator decorator = new PrinterMesajSpecial(printerBilet);
        decorator.afiseazaDescriere();
        decorator.afiseazaVerso();

        PrinterBilet printerBilet2 = new PrinterBiletConcret("17/04/2022", 5);
        printerBilet2.afiseazaDescriere();

        Decorator decorator1 = new PrinterMesajPaste(printerBilet2);
        decorator1.afiseazaDescriere();
        decorator1.afiseazaVerso();
    }
}

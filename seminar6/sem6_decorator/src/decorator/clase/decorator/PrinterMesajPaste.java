package decorator.clase.decorator;

import decorator.clase.PrinterBilet;

public class PrinterMesajPaste extends Decorator{
    public PrinterMesajPaste(PrinterBilet printerBilet) {
        super(printerBilet);
    }

    @Override
    public void afiseazaVerso() {
        System.out.println("Paste fericit!");
        System.out.println("iepuras si cos de oua");
    }
}

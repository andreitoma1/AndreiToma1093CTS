package clase.metrou;

public class ValidatorScanare implements ValidatorMetrou {

    @Override
    public void valideazaBiletMetrou() {
        System.out.println("Biletul de metrou a fost validat");
    }

    @Override
    public void valideazaAbMetrou() {
        System.out.println("Abonamentul de metrou a fost validat");
    }

    @Override
    public void valideazaBilet2Calatorii() {
        System.out.println("Au fost validate 2 calatorii");
    }
}

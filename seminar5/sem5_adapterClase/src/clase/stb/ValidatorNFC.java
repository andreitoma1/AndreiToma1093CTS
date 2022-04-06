package clase.stb;

public class ValidatorNFC implements ValidatorSTB{
    @Override
    public void valideazaBilet() {
        System.out.println("Biletul de STB a fost validat");
    }

    @Override
    public void valideazaAb() {
        System.out.println("Ab de STB a fost validat");
    }
}

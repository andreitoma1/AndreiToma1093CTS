package clase;

public class Sms implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata a fost efectuata cu sms: " + suma + " lei");
    }
}

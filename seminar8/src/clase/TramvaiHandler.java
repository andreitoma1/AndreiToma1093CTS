package clase;

public class TramvaiHandler extends Handler {

    public TramvaiHandler(int limita) {
        super(limita);
    }
    @Override
    public void afisareMijlTransp(int distanta) {
        if(distanta < limita) {
            System.out.println("Poti folosi tramvaiul");
        } else {
            //pasarea responasabilitatii
            super.handler.afisareMijlTransp(distanta);
        }
    }
}

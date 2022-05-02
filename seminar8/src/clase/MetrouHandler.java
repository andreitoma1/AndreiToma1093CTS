package clase;

public class MetrouHandler extends Handler{
    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlTransp(int distanta) {
        if(distanta < limita) {
            System.out.println("Poti folosi metroul");
        } else {
            //pasarea responasabilitatii
            super.handler.afisareMijlTransp(distanta);
        }
    }
}

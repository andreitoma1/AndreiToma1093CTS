package clase;

public class AutobuzHandler extends Handler {

    public AutobuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareMijlTransp(int distanta) {
        if(distanta < limita) {
            System.out.println("Poti folosi autobuzul");
        } else {
            //pasarea responasabilitatii
            super.handler.afisareMijlTransp(distanta);
        }
    }

}

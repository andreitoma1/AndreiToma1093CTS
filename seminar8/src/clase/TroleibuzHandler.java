package clase;

public class TroleibuzHandler extends Handler{
    public TroleibuzHandler(int limita) {
        super(limita);
    }
    @Override
    public void afisareMijlTransp(int distanta) {
        if(distanta < limita) {
            System.out.println("Poti folosi troleibuzul");
        } else {
            //pasarea responasabilitatii
            super.handler.afisareMijlTransp(distanta);
        }
    }
}

package clase;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    private List<ICalator> lista;
    private String nrLinie;

    public MijlocTransport(String nrLinie) {
        this.lista = new ArrayList<>();
        this.nrLinie = nrLinie;
    }

    public void adaugaCalator(ICalator calator) {
        lista.add(calator);
    }

    public void stergeCalator(ICalator calator) {
        lista.remove(calator);
    }

    public void trimiteMesaj(String mesaj) {
        for(ICalator c : lista) {
            c.primireMesaj(mesaj);
        }
    }

    public void trimiteMesajPlecareCapatLinie() {
        trimiteMesaj("Am plecat de la capatul liniei " + this.nrLinie);
    }
}

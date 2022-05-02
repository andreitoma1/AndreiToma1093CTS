package clase;

public class Autobuz implements AutobuzLinie {
    private String model;
    private int an;
    private int nrLocuri;

    public Autobuz(String model, int an, int nrLocuri) {
        this.model = model;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "model='" + model + '\'' +
                ", an=" + an +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    @Override
    public void afiseazaDescriere(Linie linie) {
        System.out.println(this.toString() + linie.toString());
    }
}

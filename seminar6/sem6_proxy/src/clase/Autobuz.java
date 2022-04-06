package clase;

public class Autobuz implements MijlocDeTransport{
    private int nrCalatori;
    private int nrLinie;

    public Autobuz(int nrCalatori, int nrLinie) {
        this.nrCalatori = nrCalatori;
        this.nrLinie = nrLinie;
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul " + this.nrLinie + " a oprit in statie cu " + this.nrCalatori + " calatori");
    }
}

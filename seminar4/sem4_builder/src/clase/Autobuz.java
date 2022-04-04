package clase;

public class Autobuz {
    private String numeSofer;
    private String nrInamtriculare;
    private String nrLinie;
    private boolean deschideUsile;
    private boolean oprireCapatLinie;
    private String textDerulat;
    private int nrLocuri;

     Autobuz() {
        this.numeSofer = "Doru";
        this.nrInamtriculare = "B-123-ASD";
        this.nrLinie = "336";
        this.deschideUsile = true;
        this.oprireCapatLinie = true;
        this.textDerulat = "textul derulat";
        this.nrLocuri = 30;
    }

     void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

     void setNrInamtriculare(String nrInamtriculare) {
        this.nrInamtriculare = nrInamtriculare;
    }

     void setNrLinie(String nrLinie) {
        this.nrLinie = nrLinie;
    }

     void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

     void setOprireCapatLinie(boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
    }

     void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

     void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", nrInamtriculare='" + nrInamtriculare + '\'' +
                ", nrLinie='" + nrLinie + '\'' +
                ", deschideUsile=" + deschideUsile +
                ", oprireCapatLinie=" + oprireCapatLinie +
                ", textDerulat='" + textDerulat + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}

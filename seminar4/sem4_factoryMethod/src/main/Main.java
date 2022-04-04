package main;

import clase.*;

public class Main {
    public static void afisareMijlocTransport(Factory factory, String nrInmatriculare) {
        MijlocTransport mijlocTransport = factory.getMijlocTransport("");
        mijlocTransport.afiseazaDescriere();
    }

    public static void main(String[] args) {
        afisareMijlocTransport(new AutobuzFactory(), "B-100-ASD");
        MijlocTransport troleibuz = new TroleibuzFactory().getMijlocTransport("B-999999");
        troleibuz.afiseazaDescriere();
        new TramvaiFactory().getMijlocTransport("B-111111").afiseazaDescriere();
    }
}

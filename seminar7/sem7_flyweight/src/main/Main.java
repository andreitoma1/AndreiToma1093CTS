package main;

import clase.Autobuz;
import clase.AutobuzLinie;
import clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie a1 = new Autobuz("modelVechi", 2010, 20);
        AutobuzLinie a2 = new Autobuz("modelNou", 2015, 25);
        AutobuzLinie a3 = new Autobuz("modelSiMaiNou", 2020, 30);
        AutobuzLinie a4 = new Autobuz("modelFoarteVechi", 2000, 30);

        FlyweightFactory factory = new FlyweightFactory();

        a1.afiseazaDescriere(factory.getLinie(168));
        a2.afiseazaDescriere(factory.getLinie(226));
        a3.afiseazaDescriere(factory.getLinie(168));
        a4.afiseazaDescriere(factory.getLinie(137));
    }
}

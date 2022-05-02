package main;

import clase.AutobuzHandler;
import clase.MetrouHandler;
import clase.TramvaiHandler;
import clase.TroleibuzHandler;

public class Main {
    public static void main(String[] args) {
        TroleibuzHandler troleibuz = new TroleibuzHandler(3);
        AutobuzHandler autobuz = new AutobuzHandler(5);
        TramvaiHandler tramvai = new TramvaiHandler(10);
        MetrouHandler metrou = new MetrouHandler(999);

        troleibuz.setHandler(autobuz);
        autobuz.setHandler(tramvai);
        tramvai.setHandler(metrou);

        troleibuz.afisareMijlTransp(7);
        troleibuz.afisareMijlTransp(20);
        troleibuz.afisareMijlTransp(2);
        troleibuz.afisareMijlTransp(4);

        System.out.println("CLUJ");

        AutobuzHandler autobuzCluj = new AutobuzHandler(999);
        TroleibuzHandler troleibuzCluj = new TroleibuzHandler(5);
        TramvaiHandler tramvaiCluj = new TramvaiHandler(2);

        tramvaiCluj.setHandler(troleibuzCluj);
        troleibuzCluj.setHandler(autobuzCluj);

        tramvaiCluj.afisareMijlTransp(1);
        tramvaiCluj.afisareMijlTransp(3);
        tramvaiCluj.afisareMijlTransp(10);
    }
}

package main;

import clase.Calator;
import clase.ICalator;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport mijlocTransport = new MijlocTransport("434");
        ICalator c1 = new Calator("Andrei");
        ICalator c2 = new Calator("Mihai");
        ICalator c3 = new Calator("Alex");

        mijlocTransport.adaugaCalator(c1);
        mijlocTransport.adaugaCalator(c2);

        mijlocTransport.trimiteMesajPlecareCapatLinie();

        mijlocTransport.stergeCalator(c2);
        mijlocTransport.adaugaCalator(c3);

        mijlocTransport.trimiteMesaj("Am ajuns in statia X");
    }
}

package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Gigi");
        autobuzBuilder.setNrInmatriculare("B-999-ASD");

        Autobuz autobuz = autobuzBuilder.build();
        System.out.println(autobuz);
    }
}

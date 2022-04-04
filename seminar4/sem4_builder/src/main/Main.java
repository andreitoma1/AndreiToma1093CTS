package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Main {

    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNrInamtriculare("B-999-XYZ");
        autobuzBuilder.setOprireCapatLinie(false);
        autobuzBuilder.setNrLocuri(50);

        Autobuz autobuz1 = new AutobuzBuilder().setDeschideUsile(false).build();
        Autobuz autobuz2 = autobuzBuilder.build();

        System.out.println(autobuz1);

        System.out.println(autobuz2);
    }
}

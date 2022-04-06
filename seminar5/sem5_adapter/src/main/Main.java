package main;

import clase.metrou.ValidatorScanare;
import clase.stb.ValidatorAdapter;

public class Main {
    public static void main(String[] args) {
        ValidatorScanare scanare = new ValidatorScanare();
        ValidatorAdapter adapter = new ValidatorAdapter(scanare);
        adapter.valideazaAb();
        adapter.valideazaBilet();
    }
}

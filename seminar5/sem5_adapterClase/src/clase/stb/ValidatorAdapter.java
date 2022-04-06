package clase.stb;

import clase.metrou.ValidatorMetrou;
import clase.metrou.ValidatorScanare;

public class ValidatorAdapter extends ValidatorScanare implements ValidatorMetrou {
    @Override
    public void valideazaBiletMetrou() {
        super.valideazaBiletMetrou();
    }

    @Override
    public void valideazaAbMetrou() {
        super.valideazaAbMetrou();
    }
}

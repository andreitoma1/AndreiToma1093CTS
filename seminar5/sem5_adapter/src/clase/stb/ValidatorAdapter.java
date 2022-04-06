package clase.stb;

import clase.metrou.ValidatorMetrou;

public class ValidatorAdapter implements ValidatorSTB{
    private ValidatorMetrou validatorMetrou;

    public ValidatorAdapter(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaBiletMetrou();
    }

    @Override
    public void valideazaAb() {
        validatorMetrou.valideazaAbMetrou();
    }
}

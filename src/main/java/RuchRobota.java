public enum RuchRobota {

    KROK_LEWA (0.05),
    KROK_PRAWA(0.05),
    RUCH_REKA_LEWA(0.07),
    RUCH_REKA_PRAWA(0.07),
    SKOK(30.00);

    private double zuzycieEnergii;

    RuchRobota (double zuzycieEnergii){
        this.zuzycieEnergii = zuzycieEnergii;
    }

    public double getZuzycieEnergii() {
        return zuzycieEnergii;
    }


}

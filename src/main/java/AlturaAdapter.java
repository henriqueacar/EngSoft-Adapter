public class AlturaAdapter extends AlturaCentimetro {
    private IAltura alturaMetro;

    public AlturaAdapter (IAltura alturaMetro){
        this.alturaMetro = alturaMetro;
    }

    public void salvarAltura(){
        Float alt = alturaMetro.getAltura()*100;
        this.setAltura(alt.intValue());
    }

    public Float retornaAltura(){
        Float alt = Float.valueOf(this.getAltura());
        return alt/100;
    }
}

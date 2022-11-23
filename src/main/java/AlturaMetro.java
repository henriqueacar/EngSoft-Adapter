public class AlturaMetro implements IAltura{

    private Float altura;

    @Override
    public Float getAltura(){
        return this.altura;
    }

    @Override
    public void setAltura(Float altura){
        this.altura = altura;
    }

}

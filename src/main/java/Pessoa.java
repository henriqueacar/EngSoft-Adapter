public class Pessoa {
    IAltura altura;
    AlturaAdapter adapter;

    public Pessoa(){
        altura = new AlturaMetro();
        adapter = new AlturaAdapter(altura);
    }

    public void setAltura(Float alturaM){
        altura.setAltura(alturaM);
        adapter.salvarAltura();
    }

    public Float getAltura(){
        return adapter.retornaAltura();
    }

    public Integer getAlturaCM(){
        return adapter.getAltura();
    }

}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveRetornarAlturaMetro(){
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura(1.75F);

        assertEquals(1.75F, pessoa.getAltura());
    }

    @Test
    void deveRetornarAlturaCentimetro(){
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura(1.75F);

        assertEquals(175, pessoa.getAlturaCM());
    }

}
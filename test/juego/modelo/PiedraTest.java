package juego.modelo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by german.shokida on 7/7/2016.
 */
public class PiedraTest {
    @Test
    public void piedraPierdeContraPapel() {
        Papel papel = new Papel();
        Piedra piedra = new Piedra();

        assertTrue("Pierde" == piedra.interactuar(papel));
    }

    @Test
    public void piedraEmpataConPiedra() {
        Piedra piedra2 = new Piedra();
        Piedra piedra = new Piedra();

        assertTrue("Empate" == piedra.interactuar(piedra2));
    }

    @Test
    public void piedraGanaConTijera() {
        Piedra piedra = new Piedra();
        Tijera tijera = new Tijera();

        assertTrue("Gana" == piedra.interactuar(tijera));
    }
}

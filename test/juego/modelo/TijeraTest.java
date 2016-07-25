package juego.modelo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by german.shokida on 6/7/2016.
 */
public class TijeraTest {
    @Test
    public void tijeraVenceAPapel() {
        Tijera tijera = new Tijera();
        Papel papel = new Papel();

        assertTrue("Gana" == tijera.versus(papel));
    }

    @Test
    public void tijeraEmpataTijera() {
        Tijera tijera = new Tijera();
        Tijera tijeraDos = new Tijera();

        assertTrue("Empate" == tijera.versus(tijeraDos));
    }

    @Test
    public void tijeraPierdeConPiedra() {
        Tijera tijera = new Tijera();
        Piedra piedra = new Piedra();

        assertTrue("Pierde" == tijera.versus(piedra));
    }
}

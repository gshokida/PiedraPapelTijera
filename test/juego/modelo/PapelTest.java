package juego.modelo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by german.shokida on 7/7/2016.
 */
public class PapelTest {
    @Test
    public void papelEmpataConPapel() {
        Papel papel1 = new Papel();
        Papel papel2 = new Papel();

        assertTrue("Empate" == papel1.versus(papel2));
    }

    @Test
    public void papelPierdeConTijera() {
        Papel papel = new Papel();
        Tijera tijera = new Tijera();

        assertTrue("Pierde" == papel.versus(tijera));
    }

    @Test
    public void papelGanaConPiedra() {
        Papel papel = new Papel();
        Piedra piedra = new Piedra();

        assertTrue("Gana" == papel.versus(piedra));
    }
}

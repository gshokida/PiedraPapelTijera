package juego.modelo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by german.shokida on 7/7/2016.
 */
public class JuegoTest {
    @Test
    public void papelEmpataConPapel() {
        Jugada jugadaUno = new Papel();
        Jugada jugadaDos = new Papel();

        Juego juego = new Juego();

        String resultado = juego.evaluarJugada(jugadaUno, jugadaDos);

        assertEquals("Empate", resultado);
    }

    @Test
    public void papelGanaContraPiedra() {
        Jugada jugadaUno = new Papel();
        Jugada jugadaDos = new Piedra();

        Juego juego = new Juego();

        String resultado = juego.evaluarJugada(jugadaUno, jugadaDos);

        assertEquals("Gana", resultado);
    }

    @Test
    public void papelPierdeContraTijera() {
        Jugada jugadaUno = new Papel();
        Jugada jugadaDos = new Tijera();

        Juego juego = new Juego();

        String resultado = juego.evaluarJugada(jugadaUno, jugadaDos);

        assertEquals("Pierde", resultado);
    }

    @Test
    public void piedraEmpataConPiedra() {
        Jugada jugadaUno = new Piedra();
        Jugada jugadaDos = new Piedra();

        Juego juego = new Juego();

        String resultado = juego.evaluarJugada(jugadaUno, jugadaDos);

        assertEquals("Empate", resultado);
    }

    @Test
    public void piedraGanaContraTijera() {
        Jugada jugadaUno = new Piedra();
        Jugada jugadaDos = new Tijera();

        Juego juego = new Juego();

        String resultado = juego.evaluarJugada(jugadaUno, jugadaDos);

        assertEquals("Gana", resultado);
    }

    @Test
    public void piedraPierdeContraPapel() {
        Jugada jugadaUno = new Piedra();
        Jugada jugadaDos = new Papel();

        Juego juego = new Juego();

        String resultado = juego.evaluarJugada(jugadaUno, jugadaDos);

        assertEquals("Pierde", resultado);
    }

    @Test
    public void tijeraEmpataConTijera() {
        Jugada jugadaUno = new Tijera();
        Jugada jugadaDos = new Tijera();

        Juego juego = new Juego();

        String resultado = juego.evaluarJugada(jugadaUno, jugadaDos);

        assertEquals("Empate", resultado);
    }

    @Test
    public void tijeraGanaContraPapel() {
        Jugada jugadaUno = new Tijera();
        Jugada jugadaDos = new Papel();

        Juego juego = new Juego();

        String resultado = juego.evaluarJugada(jugadaUno, jugadaDos);

        assertEquals("Gana", resultado);
    }

    @Test
    public void tijeraPierdeContraPiedra() {
        Jugada jugadaUno = new Tijera();
        Jugada jugadaDos = new Piedra();

        Juego juego = new Juego();

        String resultado = juego.evaluarJugada(jugadaUno, jugadaDos);

        assertEquals("Pierde", resultado);
    }
}

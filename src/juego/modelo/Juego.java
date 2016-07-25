package juego.modelo;

/**
 * Created by german.shokida on 7/7/2016.
 */
public class Juego {
    public String evaluarJugada(Jugada jugadaUno, Jugada jugadaDos) {
        String resultado;

        resultado = jugadaUno.versus(jugadaDos);

        return resultado;
    }
}

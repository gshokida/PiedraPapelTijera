package juego.modelo;

/**
 * Created by german.shokida on 6/7/2016.
 */
public interface Jugada {
    String interactuar(Jugada jugada);
    String interactuarJugada(Papel papel);
    String interactuarJugada(Tijera tijera);
    String interactuarJugada(Piedra piedra);
}
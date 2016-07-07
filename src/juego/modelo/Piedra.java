package juego.modelo;

/**
 * Created by german.shokida on 7/7/2016.
 */
public class Piedra implements Jugada {

    public String interactuar(Jugada jugada) {
        return jugada.interactuarJugada(this);
    }

    public String interactuarJugada(Papel papel) {
        return "Gana";
    }

    public String interactuarJugada(Tijera tijera) {
        return "Pierde";
    }

    public String interactuarJugada(Piedra piedra) {
        return "Empate";
    }
}

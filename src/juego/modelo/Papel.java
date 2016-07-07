package juego.modelo;

/**
 * Created by german.shokida on 6/7/2016.
 */
public class Papel implements Jugada {

    public String interactuar(Jugada jugada) {
        return jugada.interactuarJugada(this);
    }

    public String interactuarJugada(Papel papel) {
        return "Empate";
    }

    public String interactuarJugada(Tijera tijera) {
        return "Gana";
    }

    public String interactuarJugada(Piedra piedra) {
        return "Pierde";
    }
}

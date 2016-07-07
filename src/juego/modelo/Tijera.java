package juego.modelo;

/**
 * Created by german.shokida on 6/7/2016.
 */
public class Tijera implements Jugada {

    public String interactuar(Jugada jugada) {
        return jugada.interactuarJugada(this);
    }

    public String interactuarJugada(Papel papel){
        return "Pierde";
    }

    public String interactuarJugada(Tijera tijera){
        return "Empate";
    }

    public String interactuarJugada(Piedra piedra) {
        return "Gana";
    }
}

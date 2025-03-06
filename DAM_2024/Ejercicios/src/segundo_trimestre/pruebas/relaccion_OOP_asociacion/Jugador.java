package segundo_trimestre.pruebas.relaccion_OOP_asociacion;

public class Jugador {

    private final String nick;

    private final String nivel;

    Jugador(String nick, String nivel) {

        this.nick = nick;

        this.nivel = nivel;

    }

    public String getNivel() {

        return nivel;

    }

    public String getNick() {

        return nick;

    }

}
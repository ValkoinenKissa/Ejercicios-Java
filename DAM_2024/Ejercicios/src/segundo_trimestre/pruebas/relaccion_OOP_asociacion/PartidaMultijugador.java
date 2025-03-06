package segundo_trimestre.pruebas.relaccion_OOP_asociacion;

public class PartidaMultijugador {


    Jugador[] jugadores;

    int numeroJugadores;

    int numeroJugadoresMax;


    PartidaMultijugador(int numeroJugadoresMax) {

        this.numeroJugadores = 0;

        this.numeroJugadoresMax = numeroJugadoresMax;

        this.jugadores = new Jugador[numeroJugadoresMax];

    }

    public boolean anyadirJugador(Jugador j) {

        if (numeroJugadores < numeroJugadoresMax) {

            jugadores[numeroJugadores] = j;

            numeroJugadores++;

            return true;

        } else {

            System.out.println(

                    "No se pudo añadir " + j.getNick() + ", la partida está completa."

            );

            return false;

        }

    }

    public void mostrarJugadores() {

        System.out.println("Lista de jugadores");

        for (int i = 0; i < numeroJugadores; i++) {

            System.out.println(jugadores[i].getNick());

        }

    }

}
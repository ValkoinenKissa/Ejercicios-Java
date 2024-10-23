package tres_en_raya;

import java.util.Scanner;

public class TicTacToe {
 
    private final char J1 = 'X';
    private final char J2 = 'O';
    private final char VACIO = '-';
 
    private boolean turno;
 
    private char tablero[][];
 
    public TicTacToe() {
        this.turno = true;
        this.tablero = new char[3][3];
        this.inicializarTablero();
    }
 
    private void inicializarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = VACIO;
            }
        }
    }
 
    public boolean finPartida() {
        return (tableroLleno() || coincidenciaLinea() != VACIO || coincidenciaColumna() != VACIO || coincidenciaDiagonal() != VACIO);
    }
 
    public boolean tableroLleno() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == VACIO) {
                    return false;
                }
            }
        }
        return true;
    }
 
    private char coincidenciaLinea() {
        char simbolo;
        boolean coincidencia;
 
        for (int i = 0; i < tablero.length; i++) {
            coincidencia = true;
            simbolo = tablero[i][0];
            if (simbolo != VACIO) {
                for (int j = 1; j < tablero[0].length; j++) {
                    if (simbolo != tablero[i][j]) {
                        coincidencia = false;
                        break;
                    }
                }
                if (coincidencia) {
                    return simbolo;
                }
            }
        }
        return VACIO;
    }
 
    private char coincidenciaColumna() {
        char simbolo;
        boolean coincidencia;
 
        for (int j = 0; j < tablero.length; j++) {
            coincidencia = true;
            simbolo = tablero[0][j];
            if (simbolo != VACIO) {
                for (int i = 1; i < tablero[0].length; i++) {
                    if (simbolo != tablero[i][j]) {
                        coincidencia = false;
                        break;
                    }
                }
                if (coincidencia) {
                    return simbolo;
                }
            }
        }
        return VACIO;
    }
 
    private char coincidenciaDiagonal() {
        char simbolo;
        boolean coincidencia = true;
 
        // Diagonal principal
        simbolo = tablero[0][0];
        if (simbolo != VACIO) {
            for (int i = 1; i < tablero.length; i++) {
                if (simbolo != tablero[i][i]) {
                    coincidencia = false;
                    break;
                }
            }
            if (coincidencia) {
                return simbolo;
            }
        }
 
        coincidencia = true;
 
        // Diagonal inversa
        simbolo = tablero[0][2];
        if (simbolo != VACIO) {
            for (int i = 1, j = 1; i < tablero.length; i++, j--) {
                if (simbolo != tablero[i][j]) {
                    coincidencia = false;
                    break;
                }
            }
            if (coincidencia) {
                return simbolo;
            }
        }
 
        return VACIO;
    }
 
    public void mostrarGanador() {
        char simbolo = coincidenciaLinea();
 
        if (simbolo != VACIO) {
            ganador(simbolo, 1);
            return;
        }
 
        simbolo = coincidenciaColumna();
 
        if (simbolo != VACIO) {
            ganador(simbolo, 2);
            return;
        }
 
        simbolo = coincidenciaDiagonal();
 
        if (simbolo != VACIO) {
            ganador(simbolo, 3);
            return;
        }
 
        System.out.println("Hay empate");
    }
 
    private void ganador(char simbolo, int tipo) {
        switch (tipo) {
            case 1:
                if (simbolo == J1) {
                    System.out.println("Ha ganado el Jugador 1 por línea");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por línea");
                }
                break;
            case 2:
                if (simbolo == J1) {
                    System.out.println("Ha ganado el Jugador 1 por columna");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por columna");
                }
                break;
            case 3:
                if (simbolo == J1) {
                    System.out.println("Ha ganado el Jugador 1 por diagonal");
                } else {
                    System.out.println("Ha ganado el Jugador 2 por diagonal");
                }
                break;
        }
    }
 
    public void insertarEn(int fila, int columna) {
        if (turno) {
            this.tablero[fila][columna] = J1;
        } else {
            this.tablero[fila][columna] = J2;
        }
    }
 
    public void mostrarTablero() {
        System.out.println("  1 2 3");
        for (int i = 0; i < this.tablero.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < this.tablero[0].length; j++) {
                System.out.print(this.tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }
 
    public void mostrarTurnoActual() {
        if (turno) {
            System.out.println("Le toca al jugador 1");
        } else {
            System.out.println("Le toca al jugador 2");
        }
    }
 
    public void cambiaTurno() {
        this.turno = !this.turno;
    }
 
    public boolean validarPosicion(int fila, int columna) {
        if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero.length) {
            return true;
        }
        return false;
    }
 
    public boolean hayValorPosicion(int fila, int columna) {
        if (this.tablero[fila][columna] != VACIO) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TicTacToe juego = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        int fila, columna;

        while (!juego.finPartida()) {
            juego.mostrarTablero();
            juego.mostrarTurnoActual();
            System.out.println("Ingrese fila y columna separadas por espacio (por ejemplo, 1 1): ");
            fila = scanner.nextInt() - 1;
            columna = scanner.nextInt() - 1;

            if (juego.validarPosicion(fila, columna) && !juego.hayValorPosicion(fila, columna)) {
                juego.insertarEn(fila, columna);
                juego.cambiaTurno();
            } else {
                System.out.println("Posición no válida o ya ocupada. Inténtelo de nuevo.");
            }
        }

        juego.mostrarTablero();
        juego.mostrarGanador();
        scanner.close();
    }
}

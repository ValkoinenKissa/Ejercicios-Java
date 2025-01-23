package segundo_trimestre.poo.ejercicio_banco;

public class Cuenta {
    String dni;
    double saldoDisponible;

    public Cuenta(String dni) {
        this.dni = dni;
    }

    public Cuenta(String dni, double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
        this.dni = dni;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "dni='" + dni + '\'' +
                ", saldoDisponible=" + saldoDisponible +
                '}';
    }

    public void ingresar(double saldo) {
        if (saldo < 0) {
            System.out.println("El saldo no puede ser negativo");
        } else {
            setSaldoDisponible(getSaldoDisponible() + saldo);
            System.out.println("El saldo se ha ingresado exitosamente, el nuevo balance es:  "
                    + getSaldoDisponible());
        }
    }

    public void retirar(double saldo) {
        if (saldo < 0) {
            System.out.println("La cantidad a retirar no puede ser negativa");
        } else if (this.saldoDisponible - saldo < 0) {
            setSaldoDisponible(0);
            System.out.println("No hay suficiente saldo para efectuar la operacion, el nuevo balance es: 0");
        } else {
            setSaldoDisponible(this.saldoDisponible - saldo);
            System.out.println("El saldo se ha retirado exitosamente, el nuevo balance es: " +
                    getSaldoDisponible());

        }
    }
}



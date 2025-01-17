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

    public void setDni(String dni) {
        this.dni = dni;
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
        }else {
            setSaldoDisponible(saldo);
        }
    }

    public void retirar(double saldo) {
        double cantidad = this.saldoDisponible - saldo;

        if (cantidad < 0) {
            System.out.println("No tienes suficiente saldo para efectuar la operacion");
        }else {
            double retirada = getSaldoDisponible() - saldo;
            setSaldoDisponible(retirada);

        }
    }
}



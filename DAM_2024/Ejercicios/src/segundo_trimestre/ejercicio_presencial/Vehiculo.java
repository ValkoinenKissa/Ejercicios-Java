package segundo_trimestre.ejercicio_presencial;

public class Vehiculo {
    protected String marca, modelo, bastidor, matricula;
    protected double precio;

    protected boolean disponible;

    public Vehiculo() {
    }

    public Vehiculo(double precio, String matricula, String bastidor, String marca, String modelo) {
        this.precio = precio;
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bastidor='" + bastidor + '\'' +
                ", matricula='" + matricula + '\'' +
                ", precio=" + precio +
                ", disponible=" + disponible +
                '}';
    }
}

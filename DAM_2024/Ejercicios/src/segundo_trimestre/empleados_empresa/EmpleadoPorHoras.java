package segundo_trimestre.empleados_empresa;
/*
Crea dos clases que hereden de Empleado e implementen calcularSalario() de manera diferente:
EmpleadoTiempoCompleto: Recibe un bono adicional del 10% sobre el salarioBase.
EmpleadoPorHoras: Recibe un pago basado en la cantidad de horas trabajadas (horasTrabajadas)
y una tarifa por hora (tarifaPorHora).


Ambas clases (EmpleadoTiempoCompleto y EmpleadoPorHoras) deben implementar Beneficios, pero cada una devolverá beneficios distintos:
EmpleadoTiempoCompleto: "Seguro médico y vacaciones pagadas".
EmpleadoPorHoras: "Bonos por horas extras trabajadas".

 */
public class EmpleadoPorHoras extends Empleado implements Beneficios {
    //CYa que no se utilizan los getters y setters de estos atributos, se han hecho final para evitar su manipulacion
    private final int horasTrabajadas;
    private final double tarifaPorHora;


    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    protected double calcularSalario() {
        //Recibe un pago basado en la cantidad de horas trabajadas (horasTrabajadas) y una tarifa por hora (tarifaPorHora).
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String obtenerBeneficios() {
        return "Bonos por horas extras trabajadas";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + " EmpleadoPorHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", tarifaPorHora=" + tarifaPorHora +
                '}';
    }
}

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
public class EmpleadoTiempoCompleto extends Empleado implements Beneficios {

    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    protected double calcularSalario() {
        double bonusSalario = this.getSalarioBase();
        bonusSalario += bonusSalario * 0.10;
        return bonusSalario;
    }

    @Override
    public String obtenerBeneficios() {
        return "Seguro médico y vacaciones pagadas";
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion();
    }
}

package segundo_trimestre.pruebas;

class Coche {
    private String matricula;
    private String color;
    private String marca;

    public void agregarMatricula(String matricula){
        this.matricula = matricula;
    }

    public void agregarColor(String color){
        this.color = color;
    }

    public void agregarMarca(String marca){
        this.marca = marca;
    }

    public String devolverDescripcion(){
        String plantilla = "Marca: %s, color %s y matrícula %s";
        return String.format(plantilla, marca, color, matricula);
    }

    public Boolean equals(Coche c){
        if (c.matricula == matricula &&
                c.color == color &&
                c.marca == marca) return true;
        else return false;
    }
}

public class CasoPractico3 {
    public static void main(String[] args) {
        Coche c1 = new Coche();
        c1.agregarMarca("Seat");
        c1.agregarColor("rojo");
        c1.agregarMatricula("1234 ABC");

        Coche c2 = new Coche();
        c2.agregarMarca("Seat");
        c2.agregarColor("rojo");
        c2.agregarMatricula("1234 ABC");

        Coche c3 = c1;

        System.out.println(c1.devolverDescripcion());
        System.out.println(c2.devolverDescripcion());
        System.out.println(c3.devolverDescripcion());
        System.out.println("\n * Comparando con ==\n");
        System.out.println("c1==c2?" + (c1 == c2));
        System.out.println("c1==c3?" + (c1 == c3));
        System.out.println("\n * Comparando con equals\n");
        System.out.println("c1.equals(c2)?" + (c1.equals(c2)));
        System.out.println("c1.equals(c3)?" + (c1.equals(c3)));
    }

}

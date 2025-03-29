package segundo_trimestre.simulacro_examen.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
Tenéis que realizar una aplicación para llevar a cabo la gestión de una biblioteca.
Dicha aplicación, la usan los trabajadores para la gestión de artículos y clientes

1.- Dar de alta un usuario, siempre y cuando, no exista ya.

2.- Dar de alta un artículo. Los artículos pueden ser libros, revistas y películas.

3.- Hacer un pŕestamo

4.- Salir

Tiempo maximo 30 mins
 */
public class Ejecutable {
    //Se declara el escaner como variable estatica para poder acceder a el desde cualquier lugar dentro de la clase
    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        ArrayList<Articulos> listaArticulos = new ArrayList<>();
        HashMap<String, String> listaPrestamos  = new HashMap<>();

        int opcion;

        do {
            System.out.println("Introduce la opcion que desees ejecutar: ");

            System.out.println("1.- Dar de alta un usuario, siempre y cuando, no exista ya.");
            System.out.println("2.- Dar de alta un artículo. Los artículos pueden ser libros, revistas y películas.");
            System.out.println("3.- Hacer un pŕestamo");
            System.out.println("4.- Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    darAltaUsuario(listaUsuarios);
                    break;
                case 2:
                    altaArticulo(listaArticulos);
                    break;
                case 3:
                    prestamoArticulo(listaArticulos, listaUsuarios, listaPrestamos);
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicacion...");
                    break;
            }

        } while (opcion != 4);

    }


    protected static void darAltaUsuario(ArrayList<Usuarios> listaUsuarios) {
        int decision;
        System.out.println("Elige el usuario que quieras dar de alta: \n 1- Cliente \n 2- Trabajador");
        decision = teclado.nextInt();
        if (decision == 1) {
            altaCliente(listaUsuarios);

        } else if (decision == 2) {

            altaTrabajador(listaUsuarios);

        } else {
            System.out.println("La decision no es correcta");
        }
    }


    private static void altaTrabajador(ArrayList<Usuarios> listaUsuarios) {
        //String nombre, String correo, String apellido, int idTrabajador, double salario
        String nombre, correo, apellido;
        int idTrabajador;
        double salario;
        Usuarios usuario;
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = teclado.next();
        System.out.println("Ingrese el correo del trabajador: ");
        correo = teclado.next();
        System.out.println("Ingrese el apellido del trabajador: ");
        apellido = teclado.next();
        System.out.println("Ingrese el salario del trabajador: ");
        salario = teclado.nextDouble();
        System.out.println("Ingrese el id del trabajador: ");
        idTrabajador = teclado.nextInt();

        if (comprobarIdExixte(listaUsuarios, idTrabajador)) {
            System.out.println("El trabajador ya se encuentra registrado, introduce otro ID");
        } else {
            usuario = new Trabajadores(nombre, correo, apellido, idTrabajador, salario);
            listaUsuarios.add(usuario);
            teclado.nextLine();
        }

    }

    private static void altaArticulo(ArrayList<Articulos> listaArticulos) {
        System.out.println("Que articulo quieres dar de alta? \n 1- Libros \n 2- Peliculas \n 3- Revistas ");
        int decision = teclado.nextInt();
        teclado.nextLine();
        switch (decision) {
            case 1:
                altaLibro(listaArticulos);
                break;
            case 2:
                altaPelicula(listaArticulos);
                break;
            case 3:
                altaRevista(listaArticulos);
                break;

            default:
                System.out.println("Error, opcion no correcta.");
        }

    }

    private static void altaRevista(ArrayList<Articulos> listaArticulos) {
        //String nombreArticulo, String descripcionArticulo, String tipoRevista
        String nombreArticulo, descripcionArticulo, tipoRevista;
        Revistas revista;
        System.out.println("Introduce el nombre de la revista");
        nombreArticulo = teclado.nextLine();
        System.out.println("Introduce el descripcion de la revista");
        descripcionArticulo = teclado.nextLine();
        System.out.println("Introduce el tipo de revista");
        tipoRevista = teclado.nextLine();
        revista = new Revistas(nombreArticulo, descripcionArticulo, tipoRevista);
        listaArticulos.add(revista);
        System.out.println("ALta realizada con exito");
        teclado.nextLine();
    }

    private static void altaLibro(ArrayList<Articulos> listaArticulos) {
        //String nombreArticulo, String descripcionArticulo, int isbn, String genero
        String nombreArticulo, descripcionArticulo, genero;
        int isbn;
        Libros libro;
        System.out.println("Introduce el nombre de la libro");
        nombreArticulo = teclado.nextLine();
        System.out.println("Introduce el descripcion de la libro");
        descripcionArticulo = teclado.nextLine();
        System.out.println("Introduce el tipo de libro");
        genero = teclado.nextLine();
        System.out.println("Introduce el ISBN del libro");
        isbn = teclado.nextInt();
        libro = new Libros(nombreArticulo, descripcionArticulo, isbn, genero);
        listaArticulos.add(libro);
        System.out.println("ALta realizada con exito");
        teclado.nextLine();
    }

    private static void altaPelicula(ArrayList<Articulos> listaArticulos) {
        //String nombreArticulo, String descripcionArticulo, int duraccionPelicula, String clasificacionPelicula
        String nombreArticulo, descripcionArticulo, clasificacionPelicula;
        int duraccionPelicula;
        Peliculas pelicula;
        System.out.println("Introduce el nombre de la pelicula");
        nombreArticulo = teclado.nextLine();
        System.out.println("Introduce el descripcion de la pelicula");
        descripcionArticulo = teclado.nextLine();
        System.out.println("Introduce el clasificacion de la pelicula");
        clasificacionPelicula = teclado.nextLine();
        System.out.println("Introduce el duraccion de la pelicula");
        duraccionPelicula = teclado.nextInt();
        pelicula = new Peliculas(nombreArticulo, descripcionArticulo, duraccionPelicula, clasificacionPelicula);
        listaArticulos.add(pelicula);
        System.out.println("ALta realizada con exito");
        teclado.nextLine();

    }

    private static void altaCliente(ArrayList<Usuarios> listaUsuarios) {
        //String nombre, String correo, String apellido, int idCliente, String fechaNacimiento
        String nombre, correo, apellido, fechaNacimiento;
        int idCliente;
        Clientes cliente;
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = teclado.next();
        System.out.println("Ingrese el correo del cliente: ");
        correo = teclado.next();
        System.out.println("Ingrese el apellido del cliente: ");
        apellido = teclado.next();
        System.out.println("Ingrese el fecha del cliente: ");
        fechaNacimiento = teclado.next();
        System.out.println("Ingrese el id del cliente: ");
        idCliente = teclado.nextInt();

        if (comprobarIdExixte(listaUsuarios, idCliente)) {
            System.out.println("El cliente ya se encuentra registrado, introduce otro ID");
        } else {
            cliente = new Clientes(nombre, correo, apellido, idCliente, fechaNacimiento);
            listaUsuarios.add(cliente);
            teclado.nextLine();
        }

    }

    private static void prestamoArticulo(ArrayList<Articulos> listaArticulos, ArrayList<Usuarios> listaUsuarios, HashMap<String, String> listaPrestamos) {
        String idArticulo, idCliente;
        System.out.println("Mostrando articulos para prestamo: ");
        verArticulos(listaArticulos);
        System.out.println("Mostrando clientes del sistema: ");
        verClientes(listaUsuarios);
        System.out.println("Ahora ingresa el DNI del cliente al que le quieres prestar el articulo: ");
        idCliente = teclado.nextLine();
        System.out.println("Ahora ingresa el id del articulo que quieres prestar: ");
        idArticulo = teclado.nextLine();
        listaPrestamos.put(idCliente, idArticulo);
        System.out.println("Prestamos realizado con exito");
        teclado.nextLine();



    }

    private static boolean comprobarIdExixte(ArrayList<Usuarios> listaUsuarios, int idUsuario) {
        for (Usuarios usuario : listaUsuarios) {
            if (usuario instanceof Clientes) {
                if (idUsuario == ((Clientes) usuario).getIdCliente()) {
                    return true;
                }
            }

            if (usuario instanceof Trabajadores) {
                if (idUsuario == ((Trabajadores) usuario).getIdTrabajador()) {
                    return true;
                }
            }
        }

        return false;
    }

    private static void verArticulos(ArrayList<Articulos> listaArticulos) {
        for (Articulos articulos : listaArticulos){
            System.out.println(articulos);
        }
    }

    private static void verClientes(ArrayList<Usuarios> listaUsuarios) {
        for (Usuarios clientes : listaUsuarios){
            if (clientes instanceof Clientes) {
                System.out.println(clientes);
            }
        }
    }
}

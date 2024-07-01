import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaz {
    private static final ListaUsuarios listaUsuarios = new ListaUsuarios();
    private static final ListaSalas listaSalas = new ListaSalas();
    private static final ListaReservas listaReservas = new ListaReservas();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        int opcion;

        while (!salir) {
            opcionesMenuPrincipal();
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        menuUsuarios();
                        break;
                    case 2:
                        menuSalas();
                        break;
                    case 3:
                        menuReservas();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número para seleccionar la opción.");
                scanner.nextLine();
            }
        }
    }

    private static void opcionesMenuPrincipal() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. CRUD Usuarios");
        System.out.println("2. CRUD Salas");
        System.out.println("3. CRUD Reservas");
        System.out.println("4. Salir");
        System.out.print("Ingrese opción: ");
    }

    private static void menuUsuarios() {
        boolean salir = false;
        int opcion;

        while (!salir) {
            opcionesMenuUsuarios();
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        crearUsuario();
                        break;
                    case 2:
                        eliminarUsuario();
                        break;
                    case 3:
                        editarUsuario();
                        break;
                    case 4:
                        verUsuarios();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número para seleccionar la opción.");
                scanner.nextLine();
            }
        }
    }

    private static void opcionesMenuUsuarios() {
        System.out.println("\n--- Menú de Usuarios ---");
        System.out.println("1. Crear Usuario");
        System.out.println("2. Eliminar Usuario");
        System.out.println("3. Editar Usuario");
        System.out.println("4. Ver Usuarios");
        System.out.println("5. Volver al Menú Principal");
        System.out.print("Ingrese opción: ");
    }

    private static void crearUsuario() {
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el departamento del usuario: ");
        String departamento = scanner.nextLine();
        System.out.print("Ingrese la descripción del usuario: ");
        String descripcion = scanner.nextLine();

        Usuario nuevoUsuario = new Usuario(nombre, departamento, descripcion);
        listaUsuarios.agregarUsuario(nuevoUsuario);
        System.out.println("Usuario creado exitosamente con ID: " + nuevoUsuario.getUserID());
    }

    private static void eliminarUsuario() {
        System.out.print("Ingrese el ID del usuario a eliminar: ");
        int userID = scanner.nextInt();
        scanner.nextLine();

        listaUsuarios.eliminarUsuario(userID);
        System.out.println("Usuario con ID " + userID + " eliminado correctamente.");
    }

    private static void editarUsuario() {
        System.out.print("Ingrese el ID del usuario a editar: ");
        int userID = scanner.nextInt();
        scanner.nextLine();

        Usuario usuarioExistente = listaUsuarios.buscarUsuario(userID);
        if (usuarioExistente != null) {
            System.out.print("Ingrese el nuevo nombre del usuario: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el nuevo departamento del usuario: ");
            String departamento = scanner.nextLine();
            System.out.print("Ingrese la nueva descripción del usuario: ");
            String descripcion = scanner.nextLine();

            listaUsuarios.editarUsuario(userID, nombre, departamento, descripcion);
            System.out.println("Usuario editado correctamente.");
        } else {
            System.out.println("Usuario con ID " + userID + " no encontrado.");
        }
    }

    private static void verUsuarios() {
        listaUsuarios.listarUsuarios();
    }

    private static void menuSalas() {
        boolean salir = false;
        int opcion;

        while (!salir) {
            opcionesMenuSalas();
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        crearSala();
                        break;
                    case 2:
                        eliminarSala();
                        break;
                    case 3:
                        editarSala();
                        break;
                    case 4:
                        verSalas();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número para seleccionar la opción.");
                scanner.nextLine();
            }
        }
    }

    private static void opcionesMenuSalas() {
        System.out.println("\n--- Menú de Salas ---");
        System.out.println("1. Crear Sala");
        System.out.println("2. Eliminar Sala");
        System.out.println("3. Editar Sala");
        System.out.println("4. Ver Salas");
        System.out.println("5. Volver al Menú Principal");
        System.out.print("Ingrese opción: ");
    }

    private static void crearSala() {
        System.out.print("Ingrese el número de la sala: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre de la sala: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el edificio de la sala: ");
        String edificio = scanner.nextLine();

        Sala nuevaSala = new Sala(numero, nombre, edificio);
        listaSalas.agregarSala(nuevaSala);
        System.out.println("Sala creada exitosamente con número: " + nuevaSala.getNumero());
    }

    private static void eliminarSala() {
        System.out.print("Ingrese el número de la sala a eliminar: ");
        int numeroSala = scanner.nextInt();
        scanner.nextLine();

        listaSalas.eliminarSala(numeroSala);
        System.out.println("Sala con número " + numeroSala + " eliminada correctamente.");
    }

    private static void editarSala() {
        System.out.print("Ingrese el número de la sala a editar: ");
        int numeroSala = scanner.nextInt();
        scanner.nextLine();

        Sala salaExistente = listaSalas.buscarSala(numeroSala);
        if (salaExistente != null) {
            System.out.print("Ingrese el nuevo nombre de la sala: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el nuevo edificio de la sala: ");
            String edificio = scanner.nextLine();

            listaSalas.editarSala(numeroSala, nombre, edificio);
            System.out.println("Sala editada correctamente.");
        } else {
            System.out.println("Sala con número " + numeroSala + " no encontrada.");
        }
    }

    private static void verSalas() {
        listaSalas.listarSalas();
    }

    private static void menuReservas() {
        boolean salir = false;
        int opcion;

        while (!salir) {
            mostrarMenuReservas();
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        crearReserva();
                        break;
                    case 2:
                        eliminarReserva();
                        break;
                    case 3:
                        verReservas();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número para seleccionar la opción.");
                scanner.nextLine();
            }
        }
    }

    private static void mostrarMenuReservas() {
        System.out.println("\n--- Menú de Reservas ---");
        System.out.println("1. Crear Reserva");
        System.out.println("2. Eliminar Reserva");
        System.out.println("3. Ver Reservas");
        System.out.println("4. Volver al Menú Principal");
        System.out.print("Ingrese la opción deseada: ");
    }

    private static void crearReserva() {
        System.out.print("Ingrese el ID del usuario que realizará la reserva: ");
        int userID = scanner.nextInt();
        scanner.nextLine();

        Usuario usuario = listaUsuarios.buscarUsuario(userID);
        if (usuario == null) {
            System.out.println("Usuario con ID " + userID + " no encontrado.");
            return;
        }

        System.out.print("Ingrese el número de la sala para la reserva: ");
        int numeroSala = scanner.nextInt();
        scanner.nextLine();

        Sala sala = listaSalas.buscarSala(numeroSala);
        if (sala == null) {
            System.out.println("Sala con número " + numeroSala + " no encontrada.");
            return;
        }

        if (sala.getReserva() != null) {
            System.out.println("La sala ya tiene una reserva.");
            return;
        }

        if (usuario.getReserva() != null) {
            System.out.println("El usuario ya tiene una reserva.");
            return;
        }

        System.out.print("Ingrese el detalle de la reserva: ");
        String detalleReserva = scanner.nextLine();

        LocalDateTime inicio = LocalDateTime.now();
        LocalDateTime fin = inicio.plusHours(2);

        Reserva nuevaReserva = new Reserva(inicio, fin, usuario, sala, detalleReserva);
        listaReservas.agregarReserva(nuevaReserva);
        System.out.println("Reserva creada exitosamente con ID: " + nuevaReserva.getReservaID());
    }

    private static void eliminarReserva() {
        System.out.print("Ingrese el ID de la reserva a eliminar: ");
        int reservaID = scanner.nextInt();
        scanner.nextLine();

        listaReservas.eliminarReserva(reservaID);
        System.out.println("Reserva con ID " + reservaID + " eliminada correctamente.");
    }

    private static void verReservas() {
        listaReservas.listarReservas();
    }
}
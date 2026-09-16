import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Obj> pila = new Stack<>();
        Metodos m = new Metodos();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido al sistema de deshacer acciones del videojuego");
            System.out.println("Que desea realizar");
            System.out.println("1) Registrar acción");
            System.out.println("2) Deshacer la última acción");
            System.out.println("3) Consultar la última acción (peek)");
            System.out.println("4) Mostrar el historial");
            System.out.println("5) Buscar acciones por tipo");
            System.out.println("6) Salir");

            int opt = m.validarEntero(sc);
            sc.nextLine(); // limpiar el salto de línea que deja nextInt()

            switch (opt) {
                case 1:
                    pila = m.registrarAccion(pila, sc);
                    break;
                case 2:
                    pila = m.deshacerUltimaAccion(pila);
                    break;
                case 3:
                    m.consultarUltimaAccion(pila);
                    break;
                case 4:
                    m.mostrarHistorial(pila);
                    break;
                case 5:
                    m.buscarPorTipo(pila, sc);
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;
                default:
                    System.out.println("Esta opción no existe");
                    break;
            }
        }
        sc.close();
    }
}
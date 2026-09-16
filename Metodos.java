import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    
    public Stack<Obj> registrarAccion(Stack<Obj> pila, Scanner sc) {
        Obj accion = new Obj();

        System.out.println("Ingrese el id de la acción: ");
        accion.setId(validarEntero(sc));
        sc.nextLine();
        System.out.println();
        System.out.println("Ingrese el tipo de acción (ej: MOVER, SALTAR, ATACAR, RECOGER, USAR ): ");
        accion.setTipoAccion(sc.nextLine());
        System.out.println();
        System.out.println("Ingrese la descripción de la acción: ");
        accion.setDescripcion(sc.nextLine());
        System.out.println();
        System.out.println("Ingrese la fecha de la acción (ej: 15-09-2026): ");
        accion.setFecha(sc.nextLine());
        System.out.println();
        pila.push(accion);
        System.out.println("Acción registrada correctamente");
        return pila;
    }

  
    public Stack<Obj> deshacerUltimaAccion(Stack<Obj> pila) {
        if (pila.isEmpty()) {
            System.out.println("No hay acciones para deshacer");
        } else {
            Obj deshecha = pila.pop();
            System.out.println("Se deshizo la acción: " + deshecha);
        }
        return pila;
    }

    public void consultarUltimaAccion(Stack<Obj> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila esta vacia, no hay acciones registradas");
        } else {
            Obj ultima = pila.peek();
            System.out.println("La última acción registrada es: " + ultima);
        }
    }

    public void mostrarHistorial(Stack<Obj> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila esta vacia, no hay historial para mostrar");
        } else {
            System.out.println("Historial de acciones (Del ultimo al primero registrado) :");
            for (Obj accion : pila) {
                System.out.println(accion);
            }
        }
    }

    
    public void buscarPorTipo(Stack<Obj> pila, Scanner sc) {
        System.out.println("Ingrese el tipo de acción a buscar: ");
        String tipoBuscado = sc.nextLine();

        Stack<Obj> pilaAux = new Stack<>();
        boolean encontrada = false;

        while (!pila.isEmpty()) {
            Obj a = pila.pop();
            if (a.getTipoAccion().equalsIgnoreCase(tipoBuscado)) {
                System.out.println(a);
                encontrada = true;
            }
            pilaAux.push(a);
        }

       
        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.pop());
        }

        if (!encontrada) {
            System.out.println("No se encontraron acciones del tipo: " + tipoBuscado);
        }
    }

   
    public int validarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un valor numerico valido");
            sc.next();
        }
        return sc.nextInt();
    }
}
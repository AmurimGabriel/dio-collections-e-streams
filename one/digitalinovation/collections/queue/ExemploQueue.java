package one.digitalinovation.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        // add elementos
        filaBanco.add("Patrica");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        // get head element and remove it from queue or null if empty
        String clienteASerAtendido = filaBanco.poll();

        // get head element without remove this element or return a exeption
        String clienteASerAtendido1 = filaBanco.element();

        // get head element without remove this element or return null
        String clienteASerAtendido2 = filaBanco.peek();

    }
}

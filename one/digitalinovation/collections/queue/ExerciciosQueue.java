package one.digitalinovation.collections.queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ExerciciosQueue {

    public static void main(String[] args) {

        LinkedList<String> nomes = new LinkedList<>();

        nomes.addAll(Arrays.asList("Juliana", "Pedro", "Carlos", "Larissa", "João"));

        Iterator<String> i = nomes.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Primeiro item sem remover: " + nomes.element());
        System.out.println("Primeiro item e remove: " + nomes.poll());

        nomes.add("Daniel");
        System.out.println("Posicao Daniel: " + nomes.indexOf("Daniel"));

        System.out.println("Tamanho: " + nomes.size());

        System.out.println("Tamanho: " + nomes.isEmpty());

        System.out.println("Tamanho: " + nomes.contains("Carlos"));
    }
}

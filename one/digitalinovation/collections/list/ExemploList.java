package one.digitalinovation.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        // Add elements to list
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);

        // sorting list with Collections
        Collections.sort(nomes);
        System.out.println(nomes);

        // set a element in specific index
        nomes.set(2, "Wesley");
        System.out.println(nomes);

        // remove an element from list
        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Wesley");
        System.out.println(nomes);

        // return a element by index or return IndexOutOfBoundException
        System.out.println(nomes.get(2));

        // return list size
        System.out.println(nomes.size());

        // more list methods
        boolean temWesley = nomes.contains("Wesley");
        boolean estaVazia = nomes.isEmpty();
        // nomes.clear();
        int posicao = nomes.indexOf("Maria"); // retorna o index do elementou ou -1 caso n exista

        // Iterator
        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println("Iterator ---> " + iterator.next());
        }
    }
}
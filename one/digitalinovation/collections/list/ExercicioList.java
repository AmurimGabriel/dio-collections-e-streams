package one.digitalinovation.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        
        // add elements
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");
        
        // show elements
        for (String string : nomes) {
            System.out.println(string);    
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //replace element
        nomes.set(nomes.indexOf("Carlos"), "Roberto");
        
        //get element
        System.out.println(nomes.get(1));

        //remove element
        nomes.remove(4);
        nomes.remove("Joao");

        //list size
        nomes.size();

        //consulting elements
        System.out.println(nomes.contains("Juliano"));

        //new list
        List<String> novosNomes = new ArrayList<>();
        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        nomes.addAll(novosNomes);
        System.out.println(nomes);

        // sorting list
        Collections.sort(nomes);
        System.out.println(nomes);

        // empty list?
        System.out.println(nomes.isEmpty());
    }
}

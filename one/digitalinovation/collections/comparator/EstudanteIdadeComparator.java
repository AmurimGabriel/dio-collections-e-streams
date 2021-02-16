package one.digitalinovation.collections.comparator;

import java.util.Comparator;

public class EstudanteIdadeComparator implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }

}
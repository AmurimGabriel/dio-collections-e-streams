package one.digitalinovation.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

    public static void main(String[] args) {

        // não mantem a ordem
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.addAll(Arrays.asList(5.8, 9.3, 6.5, 10.0, 5.4));
        System.out.println(notasAlunos);

        // mantem a ordem de inserção
        Set<Double> sequenciaNumeros = new LinkedHashSet<>();
        sequenciaNumeros.addAll(Arrays.asList(5.8, 9.3, 6.5, 10.0, 5.4));
        System.out.println(sequenciaNumeros);

        // exemplo treeset

        TreeSet<String> treeCapitais = new TreeSet<>();

        // Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        // Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        // Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        // Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        // Retorna a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);
    }
}

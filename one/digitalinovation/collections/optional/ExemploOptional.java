package one.digitalinovation.collections.optional;

import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente:");
        optional.ifPresentOrElse(
            (valor) -> System.out.println(valor), 
            () -> System.out.println("Nao está presente")
        );

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente:");
        optionalNull.ifPresentOrElse(
            (valor) -> System.out.println(valor), 
            () -> System.out.println("null = Nao está presente")
        );

        Optional<String> optionalEmpty = Optional.empty();

        System.out.println("Valor opcional que não está presente:");
        optionalEmpty.ifPresentOrElse(
            (valor) -> System.out.println(valor), 
            () -> System.out.println("empty = Nao está presente")
        );

        System.out.println(optional);
        System.out.println(optionalNull);
        System.out.println(optionalEmpty);

        optional.map(
            (valor) -> valor.concat(" no Optional!")
        ).ifPresent(
            (valor) -> System.out.println(valor)
        );

    }    
}
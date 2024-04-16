package br.com.vvatte;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Pessoa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digiter um nome e o sexo(-m ou -f) da pessoa separados por traço, faça isso para tres pessoas");

        String frase = entrada.nextLine().toLowerCase();

        System.out.println(" ");
        System.out.println("Você digitou:");
        System.out.println(frase);


        System.out.println(" ");
        System.out.println("As pessoas do sexo feminino são:");

        mulheres(frase);

    }

    public static String mulheres(String frase) {
        String[] arrayNomes = frase.split(",");
        Stream<String> pessoas = List.of(arrayNomes).stream()
                .filter(pessoa -> pessoa.endsWith("-f"));

        pessoas.forEach(System.out::println);
        return pessoas.toString();
    }
}

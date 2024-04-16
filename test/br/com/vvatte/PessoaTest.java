package br.com.vvatte;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PessoaTest {
    @Test
    public void testeClassePessoa() {
        Pessoa pessoa = new Pessoa();
        List<String> mulheres = pessoa.mulheres("Luciano-m,Angela-f,ana-f");

        for ( String mulher :mulheres) {
            Assert.assertTrue(mulher.endsWith("-f"));
        }
    }
}
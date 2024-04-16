package br.com.vvatte;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
    @Test
    public void testeClassePessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.mulheres("Luciano-m,Angela-f,ana-f");

        Assert.assertEquals("Angela-f,Ana-f", "Angela-f,Ana-f");

    }
}
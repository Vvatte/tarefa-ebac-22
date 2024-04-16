package br.com.vvatte;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
    @Test
    public void testeClassePessoa() {
        Pessoa pessoa = new Pessoa();
        String mulher = pessoa.mulheres("Luciano-m,Angela-f,ana-f");

        Assert.assertEquals(true , mulher.endsWith("-f"));
    }
}
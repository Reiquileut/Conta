package com.nossobanco.br;

import com.nossobanco.br.model.Conta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NossoBancoApplicationTests {

    @Test
    void contextLoads() {

    }
    @Test
    void testandoMensagem(){
        Assertions.assertEquals("teste1","teste1");
    }

    @Test
    void testDepositar(){
        Conta c = new Conta();
        Assertions.assertEquals(100.0, c.deposita(100));
    }
}

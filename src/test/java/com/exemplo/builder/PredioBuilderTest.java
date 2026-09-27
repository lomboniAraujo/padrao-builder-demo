package com.exemplo.builder;

import com.exemplo.builder.builder.PredioBuilder;
import com.exemplo.builder.model.Predio;
import com.exemplo.builder.model.TipoConstrucao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PredioBuilderTest {

    @Test
    void deveConstruirPredioComCoberturaEPortaria() {
        Predio predio = new PredioBuilder()
                .setEndereco("Av. Brasil, 500")
                .setAndaresComuns(3)
                .setCobertura(true)
                .getResultado();

        assertEquals("Av. Brasil, 500", predio.endereco);
        assertEquals(3, predio.andares_comuns);
        assertTrue(predio.cobertura);
        assertEquals(5, predio.andares.size());
        assertEquals(TipoConstrucao.CT_PORTARIA, predio.andares.get(0).tipo);
        assertEquals(TipoConstrucao.CT_COBERTURA, predio.andares.get(4).tipo);
    }
}

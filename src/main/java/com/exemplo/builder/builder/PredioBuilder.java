package com.exemplo.builder.builder;

import com.exemplo.builder.model.Predio;

public class PredioBuilder {
    private String endereco = "";
    private int andares_comuns = 1;
    private boolean cobertura = false;

    public PredioBuilder setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public PredioBuilder setAndaresComuns(int andares_comuns) {
        this.andares_comuns = andares_comuns;
        return this;
    }

    public PredioBuilder setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
        return this;
    }

    public Predio getResultado() {
        Predio predio = new Predio();
        predio.cobertura = cobertura;
        predio.endereco = endereco;
        predio.andares_comuns = andares_comuns;

        predio.andares.add(new ConstrucaoPortariaBuilder().getResultado());

        for (int i = 0; i < andares_comuns; i++) {
            predio.andares.add(new ConstrucaoAndarBuilder()
                    .setApartamentos(8)
                    .getResultado());
        }

        if (cobertura) {
            predio.andares.add(new ConstrucaoCoberturaBuilder().getResultado());
        }

        return predio;
    }
}

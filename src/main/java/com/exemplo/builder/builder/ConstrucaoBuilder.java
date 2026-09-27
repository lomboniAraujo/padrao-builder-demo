package com.exemplo.builder.builder;

import com.exemplo.builder.model.Construcao;
import com.exemplo.builder.model.TipoConstrucao;

public abstract class ConstrucaoBuilder {
    private int apartamentos = 0;
    protected abstract TipoConstrucao getTipo();

    public ConstrucaoBuilder setApartamentos(int apartamentos) {
        if (getTipo() == TipoConstrucao.CT_ANDAR_COMUM) {
            this.apartamentos = apartamentos;
        }
        return this;
    }

    public Construcao getResultado() {
        Construcao construcao = new Construcao(getTipo());
        construcao.apartamentos = apartamentos;
        return construcao;
    }
}

package com.exemplo.builder.builder;

import com.exemplo.builder.model.TipoConstrucao;

public class ConstrucaoAndarBuilder extends ConstrucaoBuilder {
    @Override
    protected TipoConstrucao getTipo() {
        return TipoConstrucao.CT_ANDAR_COMUM;
    }
}

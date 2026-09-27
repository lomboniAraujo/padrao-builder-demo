package com.exemplo.builder;

import com.exemplo.builder.builder.PredioBuilder;
import com.exemplo.builder.model.Predio;

public class ExemploBuilder {
    public static void main(String[] args) {
        Predio predio = new PredioBuilder()
                .setCobertura(true)
                .setAndaresComuns(7)
                .setEndereco("Rua das Marrecas, 1313")
                .getResultado();

        System.out.println("--- PRÉDIO CONSTRUÍDO ---");
        System.out.println("Endereço: " + predio.endereco);
        System.out.println("Andares comuns: " + predio.andares_comuns);
        System.out.println("Possui Cobertura? " + predio.cobertura);
        System.out.println("Total de construções/andares montados: " + predio.andares.size());
    }
}

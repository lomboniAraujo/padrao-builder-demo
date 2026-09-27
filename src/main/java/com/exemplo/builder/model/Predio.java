package com.exemplo.builder.model;

import java.util.ArrayList;

public class Predio {
    public String endereco = "";
    public int andares_comuns = 1;
    public boolean cobertura = false;
    public ArrayList<Construcao> andares = new ArrayList<>();
}

package edu.utn.frba.dds.tutorial;

import java.util.List;

public class Documento {

    private TipoDeDocumento tipoDeDocumento;
    private Integer valor;
    private String id;

    public Documento(TipoDeDocumento tipoDeDocumento, Integer valor, String id) {

        this.tipoDeDocumento = tipoDeDocumento;
        this.valor = valor;
        this.id = id;
    }


}

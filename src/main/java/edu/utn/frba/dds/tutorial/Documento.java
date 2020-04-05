package edu.utn.frba.dds.tutorial;

import java.util.List;

public class Documento {

    public TipoDeDocumento getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    private TipoDeDocumento tipoDeDocumento;
    private long valor;
    private String id;

    public Documento(TipoDeDocumento tipoDeDocumento, long valor, String id) {

        this.tipoDeDocumento = tipoDeDocumento;
        this.valor = valor;
        this.id = id;
    }


}

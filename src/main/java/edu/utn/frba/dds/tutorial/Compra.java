package edu.utn.frba.dds.tutorial;

import java.util.List;

public class Compra extends Operacion {


    public Compra(Documento documento, List<Item> articulos, boolean abierto, Integer precio) {
        super(documento, articulos, abierto, precio);
    }


    @Override
    public void generarDocumento(String id) {
        boolean anyServicio = false;
        for (Item item : articulos) {
            if (item.getTipoDeItem().equals(TipoDeItem.SERVICIO)) {
                anyServicio = true;
                break;
            }

        }

        if (!anyServicio) {
            this.documento = new Documento(TipoDeDocumento.REMITO, precio, id);
        } else {
            this.documento = new Documento(TipoDeDocumento.FALTANTE, precio, id);


        }

    }

}
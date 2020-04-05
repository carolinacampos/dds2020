package edu.utn.frba.dds.tutorial;

import java.util.*;

public class Item {

    private TipoDeItem tipoDeItem;

    private Integer precio;

    public Item(TipoDeItem tipoDeItem, Integer precio) {

        this.precio = precio;
        this.tipoDeItem =tipoDeItem;
    }



    public Integer getPrecio() {
        return precio;
    }

    public void modificarPrecio(Integer precio) {
        this.precio = precio;
    }


    public TipoDeItem getTipoDeItem() {
        return tipoDeItem;
    }

    public void setTipoDeItem(TipoDeItem tipoDeItem) {
        this.tipoDeItem = tipoDeItem;
    }
}

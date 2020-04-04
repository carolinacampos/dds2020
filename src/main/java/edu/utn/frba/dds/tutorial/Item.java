package edu.utn.frba.dds.tutorial;

import java.util.*;

public class Item {

    private TipoDeItem tipoDeItem;

    private Integer precio;
    private boolean precioModificado;
    public List<Operacion> operacionesAsociadas = new ArrayList<Operacion>();




    public Integer getPrecio() {
        return precio;
    }

    public void modificarPrecio(Integer precio) {
        this.precio = precio;
        for(Operacion operacion:operacionesAsociadas){

            operacion.calcularValor();
        }
    }

    public void agregarOperacion(Operacion operacion){
        operacionesAsociadas.add(operacion);
    }

    public TipoDeItem getTipoDeItem() {
        return tipoDeItem;
    }

    public void setTipoDeItem(TipoDeItem tipoDeItem) {
        this.tipoDeItem = tipoDeItem;
    }
}

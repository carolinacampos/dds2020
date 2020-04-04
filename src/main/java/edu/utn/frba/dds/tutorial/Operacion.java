package edu.utn.frba.dds.tutorial;



import java.util.*;


public abstract class Operacion {


    public List<Item> articulos = new ArrayList<Item>();
    public Documento documento;
    public boolean abierto;
    public Integer precio;


    public Operacion(Documento documento,List<Item> articulos, boolean abierto, Integer precio) {
        this.documento = documento;
        this.articulos = articulos;
        this.abierto = abierto;


    }

    public void agregarItems(Item item){

        articulos.add(item);

        item.agregarOperacion(this);

    }


    public void calcularValor(){
        if(this.abierto){
            precio = 0;

            for(Item item:articulos){
                precio =+ item.getPrecio();
            }
        }
        //ver de tirar una ex

    }



    public abstract void generarDocumento(Integer valor, String id);





}

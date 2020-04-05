package edu.utn.frba.dds.tutorial;



import java.util.*;


public abstract class Operacion {


    public List<Item> articulos = new ArrayList<Item>();

    public Documento getDocumento() {
        return documento;
    }

    public Documento documento;
    public boolean abierto;

    public long getPrecio() {
        return precio;
    }

    public long precio;


    public Operacion(Documento documento,List<Item> articulos, boolean abierto, long precio) {
        this.documento = documento;
        this.articulos = articulos;
        this.abierto = abierto;
        this.precio = precio;



    }

    public void agregarItems(Item item){

        articulos.add(item);

    }


    public void calcularValor() throws Exception {
        if(this.abierto){
            precio = 0;

            for(Item item:articulos){
                precio += item.getPrecio();
            }
        }
        else{
            throw new  cambiarPrecioException("no se puede modificar el precio de una oepración cerrada");
        }

    }





    public abstract void generarDocumento( String id);





}

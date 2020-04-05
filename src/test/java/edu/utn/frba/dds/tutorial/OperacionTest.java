package edu.utn.frba.dds.tutorial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import edu.utn.frba.dds.tutorial.cambiarPrecioException;



import static org.junit.Assert.assertTrue;

public class OperacionTest {


    private Compra primerCompra;
    private Compra segundaCompra;
    private Compra terceraCompra;

    private Documento remito;
    private Documento faltante;

    private Documento otroRemito;
    private Item carpeta;
    private Item hoja;
    private Item recoleccion;
    private List<Item> articulos = new ArrayList<>();
    private List<Item> articulosServicio = new ArrayList<>();



    @Before
    public void init(){

        carpeta = new Item(TipoDeItem.COMUN,20);
        hoja = new Item(TipoDeItem.COMUN, 50);
        recoleccion = new Item(TipoDeItem.SERVICIO, 50);
        articulos.add(carpeta);
        articulos.add(hoja);
        articulosServicio.add(recoleccion);
        remito = new Documento(TipoDeDocumento.REMITO, 400, "1234");
        otroRemito = new Documento(TipoDeDocumento.REMITO, 200, "545");
        faltante = new Documento(TipoDeDocumento.FALTANTE, 0, "0");


        primerCompra = new Compra(remito, articulos, false, 600);
        segundaCompra = new Compra(remito, articulos, true, 300);
        terceraCompra = new Compra(faltante, articulosServicio, true, 10);



    }



    @Test(expected= cambiarPrecioException.class)
    public void modificarPrecioOperacionCerrada() throws Exception {
        primerCompra.calcularValor();

    }

    @Test
    public void modificarPrecioOperacionAbierta() throws Exception {
        segundaCompra.calcularValor();
        Assert.assertEquals( 70,segundaCompra.getPrecio());

    }



    @Test
    public void generarRemito(){
        segundaCompra.generarDocumento("123456");
        Assert.assertEquals( TipoDeDocumento.REMITO,segundaCompra.getDocumento().getTipoDeDocumento());

    }

    @Test
    public void generarDocumentoFaltante() {
        terceraCompra.generarDocumento("123456");
        Assert.assertEquals( TipoDeDocumento.FALTANTE ,terceraCompra.getDocumento().getTipoDeDocumento());

    }


}

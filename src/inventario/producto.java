/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author bramdon
 */
public class producto {
    
    private final SimpleStringProperty id_producto;
    private final SimpleStringProperty nombre_producto;
    private final SimpleStringProperty marca_producto;
    private final SimpleStringProperty cantidad_producto;
    
    public producto(String id, String nombre, String marca, String cantidad)
    {
        id_producto=new SimpleStringProperty(id);
        nombre_producto=new SimpleStringProperty(nombre);
        marca_producto=new SimpleStringProperty(marca);
        cantidad_producto=new SimpleStringProperty(cantidad);
    }

    public producto(String text, String text0, String text1, String text2, String text3, String text4, String text5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getId_producto()
    {
        return id_producto.get();
    }
    public String getNombre_producto()
    {
        return nombre_producto.get();
    }
    public String getMarca_producto()
    {
        return marca_producto.get();
    }
    public String getCantidad_producto()
    {
        return cantidad_producto.get();
    }
    
    public void setNombre_producto(String nombre)
    {
        nombre_producto.set(nombre);
    }
    public void setMarca_producto(String marca)
    {
        marca_producto.set(marca);
    }
    public void setCantidad_producto(String cantidad)
    {
        cantidad_producto.set(cantidad);
    }
}

package org.doo.model;

public interface IBuilder {
    IBuilder buildNombre(String nombre);
    IBuilder buildPrecio(float precio);
    IBuilder buildMarca(String marca);
    IBuilder buildModelo(String modelo);
    IBuilder buildColor(String color);
    IBuilder buildStock(int stock);
    IBuilder buildDimension(String dimension);
    IBuilder buildOrigen(String origen);
    IBuilder buildPeso(String peso);
    IBuilder buildCapacidad(String capacidad);
    IBuilder buildEficiencia(String eficiencia);
    IBuilder buildDescripcion(String descripcion);
    IBuilder buildGarantia(int garantia);
    Producto build();
}

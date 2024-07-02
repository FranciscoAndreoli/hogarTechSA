package org.doo.services;

public enum EnumGarantiaExtendida {
    UN_ANIO(20.0f),
    DOS_ANIOS(40.0f),
    TRES_ANIOS(60.0f);

    private final float precio;

    EnumGarantiaExtendida(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
}

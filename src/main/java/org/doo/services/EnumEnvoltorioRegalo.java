package org.doo.services;

public enum EnumEnvoltorioRegalo {
    BASICO(5.0f),
    PREMIUM(10.0f),
    LUJO(15.0f);

    private final float precio;

    EnumEnvoltorioRegalo(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
}

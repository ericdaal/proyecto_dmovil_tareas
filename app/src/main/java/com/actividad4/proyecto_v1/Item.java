package com.actividad4.proyecto_v1;

public class Item {
    private boolean tener;
    private String nombre;
    private String descripcion;
    private TipoActividad tipo;
    private EstatusActividad estatus;

    public enum TipoActividad {
        TRABAJO, CASA, NEGOCIOS
    }

    public enum EstatusActividad {
        PENDIENTE, COMPLETADA
    }

    // Constructor
    public Item(boolean tener, String nombre, String descripcion, TipoActividad tipo, EstatusActividad estatus) {
        this.tener = tener;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.estatus = estatus;
    }

    // Getters y Setters
    public boolean isTener() {
        return tener;
    }

    public void setTener(boolean tener) {
        this.tener = tener;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoActividad getTipo() {
        return tipo;
    }

    public void setTipo(TipoActividad tipo) {
        this.tipo = tipo;
    }

    public EstatusActividad getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusActividad estatus) {
        this.estatus = estatus;
    }

    // Métodos adicionales si son necesarios...
}


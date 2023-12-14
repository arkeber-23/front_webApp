package org.proyecto.models;

public class Area {

    private Long idArea;
    private String descripcion;

    public Area() {
    }

    public Area(Long idArea, String descripcion) {
        this.idArea = idArea;
        this.descripcion = descripcion;
    }

    public Long getIdArea() {
        return idArea;
    }

    public void setIdArea(Long idArea) {
        this.idArea = idArea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}

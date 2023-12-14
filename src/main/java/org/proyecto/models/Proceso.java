package org.proyecto.models;

public class Proceso {

    private Long idProceso;
    private String descripcion;

    public Proceso() {
    }

    public Proceso(Long idProceso, String descripcion) {
        this.idProceso = idProceso;
        this.descripcion = descripcion;
    }

    public Long getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Long idProceso) {
        this.idProceso = idProceso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

}

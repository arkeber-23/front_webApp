package org.proyecto.models;

import java.math.BigDecimal;
import java.util.Date;

public class Proyecto {

    private Long idProyecto;
    private String detalleArrastre;
    private String denominacion;
    private String objetivo;
    private Character estados;
    private BigDecimal costoProyecto;
    private String descripcionBreve;
    private String tipo;
    private Boolean recurrente;
    private Boolean arrastre;
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuarioCreacion;
    private String usuarioModificacion;

    private Area area;
    private Persona persona;
    private Proceso proceso;

    public Proyecto() {
    }

    public Proyecto(Long idProyecto, String detalleArrastre, String denominacion, String objetivo, Character estados, BigDecimal costoProyecto, String descripcionBreve, String tipo, Boolean recurrente, Boolean arrastre, Date fechaInicio, Date fechaFin, Date fechaCreacion, Date fechaModificacion, String usuarioCreacion, String usuarioModificacion, Area area, Persona persona, Proceso proceso) {
        this.idProyecto = idProyecto;
        this.detalleArrastre = detalleArrastre;
        this.denominacion = denominacion;
        this.objetivo = objetivo;
        this.estados = estados;
        this.costoProyecto = costoProyecto;
        this.descripcionBreve = descripcionBreve;
        this.tipo = tipo;
        this.recurrente = recurrente;
        this.arrastre = arrastre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.area = area;
        this.persona = persona;
        this.proceso = proceso;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getDetalleArrastre() {
        return detalleArrastre;
    }

    public void setDetalleArrastre(String detalleArrastre) {
        this.detalleArrastre = detalleArrastre;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Character getEstados() {
        return estados;
    }

    public void setEstados(Character estados) {
        this.estados = estados;
    }

    public BigDecimal getCostoProyecto() {
        return costoProyecto;
    }

    public void setCostoProyecto(BigDecimal costoProyecto) {
        this.costoProyecto = costoProyecto;
    }

    public String getDescripcionBreve() {
        return descripcionBreve;
    }

    public void setDescripcionBreve(String descripcionBreve) {
        this.descripcionBreve = descripcionBreve;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getRecurrente() {
        return recurrente;
    }

    public void setRecurrente(Boolean recurrente) {
        this.recurrente = recurrente;
    }

    public Boolean getArrastre() {
        return arrastre;
    }

    public void setArrastre(Boolean arrastre) {
        this.arrastre = arrastre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

}

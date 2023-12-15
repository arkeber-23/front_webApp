package org.proyecto.managedbeans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.proyecto.config.Constantes;
import org.proyecto.models.Area;
import org.proyecto.models.Persona;
import org.proyecto.models.Proceso;
import org.proyecto.models.Proyecto;
import org.proyecto.services.interfaces.AppServices;

@ViewScoped
@Named
public class ProyectoMB implements Serializable {

    @Inject
    private AppServices appServices;

    private List<Area> areas;
    private List<Proceso> procesos;
    private List<Persona> personas;

    private Proyecto proyecto;

    @PostConstruct
    public void init() {
        proyecto = new Proyecto();
        areas = appServices.methodListGET(Constantes.appURL + "/areas", Area[].class);
        procesos = appServices.methodListGET(Constantes.appURL + "/procesos", Proceso[].class);
        personas = appServices.methodListGET(Constantes.appURL + "/personas", Persona[].class);

    }

    public void save() {
        proyecto = (Proyecto) appServices.methodPOST(proyecto, Constantes.appURL + "/proyectos", Proyecto.class);
    }

    public AppServices getAppServices() {
        return appServices;
    }

    public void setAppServices(AppServices appServices) {
        this.appServices = appServices;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public List<Proceso> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<Proceso> procesos) {
        this.procesos = procesos;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

}

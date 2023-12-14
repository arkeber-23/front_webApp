package org.proyecto.managedbeans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.proyecto.config.Constantes;
import org.proyecto.models.Persona;
import org.proyecto.services.interfaces.AppServices;

@ViewScoped
@Named
public class PersonaMB implements Serializable {

    @Inject
    private AppServices appServices;

    private List<Persona> personas;

    @PostConstruct
    public void init() {
        personas = appServices.methodListGET(Constantes.appURL + "/personas", Persona[].class);
    }

    public AppServices getAppServices() {
        return appServices;
    }

    public void setAppServices(AppServices appServices) {
        this.appServices = appServices;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

}

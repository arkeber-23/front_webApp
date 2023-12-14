
package org.proyecto.managedbeans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.proyecto.config.Constantes;
import org.proyecto.models.Area;
import org.proyecto.services.interfaces.AppServices;


@ViewScoped
@Named
public class AreaMB implements Serializable  {
    
    @Inject
    private AppServices appServices;
    
    private List<Area> areas;
    
    @PostConstruct
    public void init(){
        areas =  appServices.methodListGET(Constantes.appURL+"/areas", Area[].class);
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
    
    
    
    
    
    
    
}

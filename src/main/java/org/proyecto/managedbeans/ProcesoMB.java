
package org.proyecto.managedbeans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.proyecto.config.Constantes;
import org.proyecto.models.Proceso;
import org.proyecto.services.interfaces.AppServices;

@ViewScoped
@Named
public class ProcesoMB implements Serializable {

     
    @Inject
    private AppServices appServices;
    
    private List<Proceso> procesos;

    @PostConstruct
    public void init(){
        procesos = appServices.methodListGET(Constantes.appURL+"/procesos", Proceso[].class);
    }
    
    
    public AppServices getAppServices() {
        return appServices;
    }

    public void setAppServices(AppServices appServices) {
        this.appServices = appServices;
    }

    public List<Proceso> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<Proceso> procesos) {
        this.procesos = procesos;
    }
    
    
    
    
    
}

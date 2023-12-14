package org.proyecto.services.interfaces;

import java.util.List;
import javax.ejb.Local;

@Local
public interface AppServices {
    

public Object methodGET(String url, Class cls); 
    
public List methodListGET(String url, Class cls);

public Object methodPOST(Object obj,String url, Class cls); 
    
public List methodListPOST(Object obj, String url, Class cls);
    
    
}

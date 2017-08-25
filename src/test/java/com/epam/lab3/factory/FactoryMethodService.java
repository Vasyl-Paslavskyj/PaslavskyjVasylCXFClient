package com.epam.lab3.factory;

import com.epam.lab3.ws.NewspaperService;
import com.epam.lab3.ws.NewspaperServiceRESTImplClient;
import com.epam.lab3.ws.NewspaperServiceSOAPImplService;

public class FactoryMethodService {

    public NewspaperService getService(String serviceType){
        if(serviceType.equalsIgnoreCase("SOAP"))
            return new NewspaperServiceSOAPImplService().getNewspaperServiceSOAPImplPort();
        if(serviceType.equalsIgnoreCase("REST"))
            return new NewspaperServiceRESTImplClient();
        return null;
    }
}

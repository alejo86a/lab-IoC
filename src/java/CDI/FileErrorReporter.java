/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author camilo.posadaa
 */
public class FileErrorReporter implements ItemErrrorHandler{
    @PostConstruct
    public void init(){
        System.out.println("Creando el archivo de reporte");
    }
    
    @PreDestroy
    public void release(){
        System.out.println("Cerrando el archivo de reporte");
    }
    
    @Override
    public void handleItem(Item item) {
        System.out.println("Guardando ---" + item +  " al archivo");
    }
    
}

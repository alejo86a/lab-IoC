/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import sun.awt.X11.XConstants;

/**
 *
 * @author camilo.posadaa
 */

@Named
@RequestScoped
public class ItemProcessor {
    
    @Inject @Demo
    private  ItemDAO itemDAO;
    
    
    @Inject 
    private ItemValidator itemValidator;
    
    @Inject
    private ItemErrrorHandler itemErrorHandler;
    
    
         
    
    public void execute(){
        List<Item> items = itemDAO.fetchItems();
        for (Item item:items){
            //System.out.println("Item encontrado "+ item);
            //System.out.println("Item = " + item + " valido = "+ itemValidator.isValid(item));   
            if(!itemValidator.isValid(item)){
                itemErrorHandler.handleItem(item);
            }
        }
    }
    
}

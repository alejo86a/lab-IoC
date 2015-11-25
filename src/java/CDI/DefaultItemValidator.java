/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import javax.enterprise.inject.Alternative;

/**
 *
 * @author camilo.posadaa
 */
@Alternative
public class DefaultItemValidator implements ItemValidator {

    @Override
    public boolean isValid(Item item) {
        return item.getValue()< item.getLimit();
    }
    
}

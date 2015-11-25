/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camilo.posadaa
 */
@Demo
public class DefaultItemDAO implements ItemDAO{

    @Override
    public List<Item> fetchItems() {
        List<Item> results = new ArrayList<Item>();
        results.add(new Item(34,7));
        results.add(new Item(4,37));
        results.add(new Item(24,19));
        results.add(new Item(89,32));
        return results;
    }
    
}

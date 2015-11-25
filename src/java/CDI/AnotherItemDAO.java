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
public class AnotherItemDAO implements ItemDAO{

    @Override
    public List<Item> fetchItems() {
        List<Item> results = new ArrayList<Item>();
        results.add(new Item(99,9));
        return results;
    }
    
}

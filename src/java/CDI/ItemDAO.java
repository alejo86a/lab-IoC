/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

import java.util.List;

/**
 *
 * @author camilo.posadaa
 */
public interface ItemDAO {
    List<Item> fetchItems();
    
}

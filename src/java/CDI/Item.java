/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDI;

/**
 *
 * @author camilo.posadaa
 */
public class Item {

    public Item(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }
    
    
    private int value;
    private int limit;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        if(this.getValue()>this.getLimit()){
            return super.toString() + String.format("[Valor =  %d , Limite = %d]", value, limit);
        }else{
            return "Alerta Items agotados valor Acutal = " + this.getValue()
                    +" Limite = "+ this.getLimit();
        }
    }
    
    
    
}

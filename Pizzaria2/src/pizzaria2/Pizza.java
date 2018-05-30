/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria2;

import java.util.Calendar;

/**
 *
 * @author Rafael.Soares
 */
public abstract class Pizza {
    public String tamanho;
    
    public abstract void preparar();
    
    public float calcularPreco(){
        float preco = 10;
        
        if(tamanho.equals("G")){
            preco = preco * 1.2F;
        }
        
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        
        if(dayOfMonth >= 20){
            preco = preco * 0.5F;
        }
        
        return preco;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_dao;
import class_dao.CalculadoraCls;
/**
 *
 * @author vivia
 */
public class CalculadoraDao {
    
    
    public String Mais(CalculadoraCls cls, float Numero){
        
        float todo;

            
        todo =  cls.getCalculo() + Numero;

        cls.setCalculo(0);
                
        return todo+"";

    }
    
    public float Menos(float Numero){
    

    
    
        return 0;
    
    
    
    
    }
    
    
    public float Div(float Numero){
    
    
    
    
        return 0;
    
    
    
    
    }
    
    public float Vezes(float Numero){
    
    
    
    
        return 0;
    
    
    
    
    }
    
    
}

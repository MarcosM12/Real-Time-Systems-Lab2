
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teixe
 */
public class Switch1Thread extends Thread{
    
    public boolean gate1State(boolean state) { 
        
        if(SplitterLine.getSwitch1state() == 1){
            if(state == false) state=true;
            else state=false;
            System.out.print(state);
        
        }
        return state;
    } 
    
    @Override
    public void run(){
    
        while(true){
            
        
        }
    
    }
}

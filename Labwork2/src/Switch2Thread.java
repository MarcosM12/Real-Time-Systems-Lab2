
import static java.lang.Thread.sleep;
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
public class Switch2Thread extends Thread{
    
    public boolean gate2State(boolean state) { 

        if(SplitterLine.getSwitch2state() == 1){
            if(state == false) state=true;
            else state=false;
            System.out.print(state);
        
        }
        return state;
    } 
    
    public void run(){
    
        while(true){
            
            try {
                sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Switch1Thread.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    
    }
    
}

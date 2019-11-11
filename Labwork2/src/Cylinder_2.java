/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cylinder_2 implements Cylinder {

    
    @Override
    public void moveFoward() {
        SplitterLine.cylinder2MoveForward();
    }
    
    @Override
    public void moveBackward() {
        SplitterLine.cylinder2MoveBackward();
    }
    
    @Override
    public void stop() {
        SplitterLine.cylinder2Stop();
    }
    
    @Override
    public int getPosition() {
        return SplitterLine.getCylinder2Position();
    }
    
    @Override
    public boolean luggageDetected(){
        return SplitterLine.getHeadsensor1() == 1;
    }
    
    @Override
    public void go_to(int position){
        int p_act = SplitterLine.getCylinder2Position();
        
        if(p_act!=position){
           
            if (p_act > position) {
                SplitterLine.cylinder2MoveBackward();
            }
            else {
                if (p_act < position) {
                    SplitterLine.cylinder2MoveForward();
                }
            }
            while (SplitterLine.getCylinder2Position() != position) {		
                try {
                    sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cylinder_2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            SplitterLine.cylinder2Stop();
        }    
        
    }
    
    
    
    
    
    
    
    
    
    
}

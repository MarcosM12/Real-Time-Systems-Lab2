
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
public class Cylinder_3 implements Cylinder{
    
    @Override
    public void moveFoward() {
        SplitterLine.cylinder3MoveForward();
    }
    
    @Override
    public void moveBackward() {
        SplitterLine.cylinder3MoveBackward();
    }
    
    @Override
    public void stop() {
        SplitterLine.cylinder3Stop();
    }
    
    @Override
    public int getPosition() {
        return SplitterLine.getCylinder3Position();
    }
    
    @Override
    public boolean luggageDetected(){
        return SplitterLine.getHeadsensor2() == 1;
    }
    
    @Override
    public void go_to(int position){
        int p_act = SplitterLine.getCylinder3Position();
        
        if(p_act!=position){
           
            if (p_act > position) {
                SplitterLine.cylinder3MoveBackward();
            }
            else {
                if (p_act < position) {
                    SplitterLine.cylinder3MoveForward();
                }
            }
            while (SplitterLine.getCylinder3Position() != position) {		
                try {
                    sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cylinder_3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            SplitterLine.cylinder3Stop();
        }    
        
   
    }
    
    
}

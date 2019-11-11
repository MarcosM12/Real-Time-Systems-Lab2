
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
public class Cylinder_1 implements Cylinder {
    
    @Override
    public void moveFoward() {
        SplitterLine.cylinder1MoveForward();
    }
    
    @Override
    public void moveBackward() {
        SplitterLine.cylinder1MoveBackward();
    }
    
    @Override
    public void stop() {
        SplitterLine.cylinder1Stop();
    }
    
    @Override
    public int getPosition() {
        return SplitterLine.getCylinder1Position();
    }
    
     @Override
    public boolean luggageDetected(){
        return false;
    }
    
    
    @Override
    public void go_to(int position){
        int p_initial = SplitterLine.getCylinder1Position();
     
        if(p_initial!=position){
           
            if (p_initial> position) {
                SplitterLine.cylinder1MoveBackward();
            }
            else {
                if (p_initial < position) {
                    SplitterLine.cylinder1MoveForward();
                }
            }
            while (SplitterLine.getCylinder1Position() != position) {		
                try {
                    sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Cylinder_1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            SplitterLine.cylinder1Stop();
        }    
       
   
    }
}
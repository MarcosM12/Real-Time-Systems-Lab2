
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Mechanism {
    
    public void moveConveyor(){
        SplitterLine.conveyorMove();
    } 
    
    public void stopConveyor(){
        SplitterLine.conveyorStop();
    } 
    
    public boolean switchStation1Pressed() {

        return (SplitterLine.getSwitch1state()==1);
    }
    
 
    public boolean switchStation2Pressed() { 
        
        return (SplitterLine.getSwitch2state() == 1);
    } 
    
    public boolean switchStation3Pressed() { 
   
        return (SplitterLine.getSwitch3state() == 1);

    }

     public int luggageIdentify(){
         int luggage = 0;
         int B=0,C=0;
         while(SplitterLine.getHeadsensor1() == 0){
             
            if(SplitterLine.getIdentificationSensor1() == 1) C=1;
            if(SplitterLine.getIdentificationSensor2()==1) B=1;

            try {
                sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mechanism.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        luggage += (C + B);
        return luggage; 
    }
     
  
     
}


import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.ArrayBlockingQueue;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teixe
 */
public class MainThread extends Thread {
    private boolean interrupted;
    private ArrayBlockingQueue<Integer> queue = null;
     
    public MainThread(){
        this.queue = new ArrayBlockingQueue(1);

    }
    
    public boolean isInterrupted() { return interrupted;};
    
   
    public void run(){
        
        Cylinder cy1_1 = new Cylinder_1();
        Cylinder cy2 = new Cylinder_2();
        Cylinder cy3 = new Cylinder_3();
        Mechanism mech = new Mechanism();
        
        // LuggageIdentifyThread lit = new    LuggageIdentifyThread();
        //   lit.start();
      
        CylinderThread ct = new CylinderThread(cy1_1);
        //Switch1Thread sw1 = new Switch1Thread();
        //Switch2Thread sw2 = new Switch2Thread();
        //Switch3Thread sw3 = new Switch3Thread();
        
        
        // ct.join();
        //lit.join();
        
        
        if(mech.switchStation1Pressed() && mech.switchStation2Pressed() && mech.switchStation3Pressed()){
            try {  
                mech.stopConveyor();
                queue.take();
            } catch (InterruptedException ex) {
                Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        } 
        mech.moveConveyor();
        ct.start();
        int identifiedLuggage = mech.luggageIdentify();
        queue.add(1);
        
        if(identifiedLuggage == 0){//Luggage A
            
            if(!mech.switchStation1Pressed()){
                try {
                    queue.take();
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                mech.stopConveyor();
                CylinderThread ct2 = new CylinderThread(cy2);
                ct2.start();
                try {
                    ct2.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                mech.moveConveyor();
                //queue.add(1);
            }
        }
        else{
            
            if(mech.switchStation2Pressed() && !mech.switchStation1Pressed() && identifiedLuggage == 1){
                try {
                queue.take();
                mech.stopConveyor();
                CylinderThread ct2 = new CylinderThread(cy2);
                ct2.start();
                ct2.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                mech.moveConveyor();
                queue.add(1);
            } 
            
             if(mech.switchStation3Pressed() && !mech.switchStation1Pressed() && identifiedLuggage == 2){
               try { 
                    queue.take();
                    mech.stopConveyor();
                    CylinderThread ct2 = new CylinderThread(cy2);
                    ct2.start();
                    ct2.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                mech.moveConveyor();
                queue.add(1);
            } 
            
        }
            
        if(identifiedLuggage == 1 ){//Luggage B
            if(!mech.switchStation2Pressed()){
                while(SplitterLine.getHeadsensor2() != 1){
                    try {
                        sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Mechanism.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    queue.take();
                    mech.stopConveyor();
                    CylinderThread ct3 = new CylinderThread(cy3);
                    ct3.start();             
                    ct3.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                mech.moveConveyor();
                queue.add(1);
            }    
        }
        else{
        
            if(mech.switchStation1Pressed() && !mech.switchStation2Pressed() && identifiedLuggage == 0){
                while(SplitterLine.getHeadsensor2() != 1){
                    try {
                        sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Mechanism.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                mech.stopConveyor();
                CylinderThread ct3 = new CylinderThread(cy3);
                ct3.start();
                try {
                    ct3.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                mech.moveConveyor();
            } 
            
            if(mech.switchStation3Pressed() && mech.switchStation1Pressed() && !mech.switchStation2Pressed() && identifiedLuggage == 2){
                 while(SplitterLine.getHeadsensor2() != 1){
                    try {
                        sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Mechanism.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } 
                mech.stopConveyor();
                CylinderThread ct3 = new CylinderThread(cy3);
                ct3.start();
                try {
                    ct3.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                mech.moveConveyor();
            }
        
            
             
        }
        
    }
}   
    


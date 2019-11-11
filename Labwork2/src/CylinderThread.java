
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
public class CylinderThread extends Thread {
    
      private Cylinder cylinder;
      
      public CylinderThread(Cylinder cylinder) {
            this.cylinder = cylinder;
      }
      
      @Override
      public void run(){

        cylinder.go_to(1);
        cylinder.stop();
        cylinder.go_to(0);
      
      }
}

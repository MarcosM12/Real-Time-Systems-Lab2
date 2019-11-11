/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */
public class SplitterLine {
  
   static{
       System.load("D:\\Users\\Marcos\\Documents\\Faculdade\\STR\\str\\SplitterLine\\x64\\Debug\\SplitterLine.dll");
   
   
   }
   
   static synchronized native public void initializeHardwarePorts();
   static synchronized native public void cylinder2MoveForward();
   static synchronized native public void cylinder2MoveBackward();
   static synchronized native public void cylinder2Stop ();
   static synchronized native public void cylinder1MoveForward();
   static synchronized native public void cylinder1MoveBackward();
   static synchronized native public void cylinder1Stop ();
   static synchronized native public void cylinder3MoveForward();
   static synchronized native public void cylinder3MoveBackward();
   static synchronized native public void cylinder3Stop ();
   static synchronized native public void conveyorMove();
   static synchronized native public void conveyorStop();


   static native public int getCylinder1Position();
   static native public int getCylinder2Position();
   static native public int getCylinder3Position();
   static native public int getIdentificationSensor1();
   static native public int getIdentificationSensor2();
   static native public int getSwitch1state();
   static native public int getSwitch2state();
   static native public int getSwitch3state();
   static native public int getHeadsensor1();
   static native public int getHeadsensor2();
   
 
}

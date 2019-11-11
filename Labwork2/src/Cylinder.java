/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public interface Cylinder {
    
    public void moveFoward();
    
    public void moveBackward();
    
    public void stop();  
    
    public int getPosition(); // returns 0,1 or   -1(between)

    public void go_to(int position);
    
    public boolean luggageDetected();

    /*  
    public boolean isMoving();
    
    public boolean isMovingForward();
    
    public boolean isMovingBackward();
    
    public boolean isStopped();
*/
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.util.Scanner;

public class TestDemo {
    
    static public void main(String[] args) throws IOException, InterruptedException {
        int t=-1;
        SplitterLine.initializeHardwarePorts();
        Cylinder_1 cylinder1 = new Cylinder_1();
        Cylinder_2 cylinder2 = new Cylinder_2();
        Cylinder_3 cylinder3 = new Cylinder_3();
        
        Mechanism mech = new Mechanism();
        while(t != '0') {
            System.out.print("Enter an option then enter: ");
            Scanner scan = new Scanner(System.in);
            t = System.in.read(); scan.nextLine();
            switch(t){
                case 'i': SplitterLine.initializeHardwarePorts();break;
                case 'q': cylinder2.moveFoward();break;
                case 'w': cylinder2.moveBackward();break;
              //  case 'e': cylinder2.stop();break;
                case 'a': cylinder3.moveFoward();break;
                case 's': cylinder3.moveBackward();break;
                case 'd': cylinder3.stop();break;
                case 'z': cylinder1.moveFoward();break;
                case 'x': cylinder1.moveBackward();break;
                case 'c': cylinder1.stop();break;
                case 'l': MainThread mt = new MainThread(); mt.start();break;
                case 'e' : System.exit(0);
            }
                    
        }
    
    }
    
}
    
    
    


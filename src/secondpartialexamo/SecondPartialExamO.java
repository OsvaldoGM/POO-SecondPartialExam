/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpartialexamo;

import java.util.LinkedList;

/**
 *
 * @author Alumno
 */
public class SecondPartialExamO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    IVehicle[] myArray = new IVehicle[4];
    LinkedList<IVehicle> myVehicle = new LinkedList<IVehicle>();

    myArray[0] = new Jeep("Fred's Jeep");
    myArray[1] = new Jeep("Frank's Jeep");
    myArray[2] = new HoverCraft("Sue's Hover-craft");
    myArray[3] = new Frigate("Money Waster");
    myArray[4] = new PoliceCar("Doctor Speed");

    for (int i=0; i<myArray.length; i++) {

        System.out.println(myArray[i].getName());

        if (myArray[i] instanceof ILandVehicle) {
            ILandVehicle lv = (ILandVehicle)myArray[i];
            lv.drive();
            }
        
        if (myArray[i] instanceof IEmergency) {
            IEmergency lc = (IEmergency)myArray[i];
            lc.soundSiren();
            }
        }
    for(IVehicle temp : myVehicle){
        if(temp instanceof ILandVehicle){
            ((ILandVehicle) temp).drive();
            }
    
        if(temp instanceof IEmergency){
            ((IEmergency) temp).soundSiren();
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondpartialexamo;

/**
 *
 * @author Alumno
 */
public interface ILandVehicle extends IVehicle {
    int  getNumWheels();
    void setNumWheels(int numWheels);
    void drive();
}

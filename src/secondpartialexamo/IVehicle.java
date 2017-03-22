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
public interface IVehicle {
    String getName();
    void   setName(String name);
    int    getMaxPassengers();
    void   setMaxPassengers(int maxP);
    double    getMaxSpeed();
    void   setMaxSpeed(double maxS);
}

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
public class PoliceCar implements ILandVehicle, IEmergency{
    private String name;
    private int maxPassangers;
    private double maxSpeed;
    private int numWheels;

    public PoliceCar(String name, int maxPassangers, double maxSpeed, int numWheels) {
        this.name = name;
        this.maxPassangers = maxPassangers;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }

    public PoliceCar(String name) {
        this.name = name;
    }
    
    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Respetar la ley a toda costa");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassangers;
    }

    @Override
    public void setMaxPassengers(int maxP) {
        this.maxPassangers = maxP;
    }

    @Override
    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(double maxS) {
        this.maxSpeed = maxS;
    }

    @Override
    public void soundSiren() {
        System.out.println("WIIIIUUUU WIIIIIUUUU - ALOOOOO POLICIA");
    }
    
    public void shutRiffle(){
        System.out.println("RAAAAAAATATTAATATTATATTAAT");
    }
}

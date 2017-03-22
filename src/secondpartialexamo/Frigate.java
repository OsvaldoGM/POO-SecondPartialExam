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
public class Frigate implements IFrigate{
    private String name;
    private int maxPassangers;
    private double maxSpeed;
    private int displacement;

    public Frigate(String name, int maxPassangers, double maxSpeed, int displacement) {
        this.name = name;
        this.maxPassangers = maxPassangers;
        this.maxSpeed = maxSpeed;
        this.displacement = displacement;
    }

    public Frigate(String name) {
        this.name = name;
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
    public int getDisplacement() {
        return this.displacement;
    }

    @Override
    public void setDisplacement(int dis) {
        this.displacement = dis;
    }

    @Override
    public void launch() {
        System.out.println("FUUUUUUUUUUUUUMMMMMMM");
    }

    @Override
    public void fireGun() {
        System.out.println("RUUUUUUN HE HAS A GUN");
    }
    
}

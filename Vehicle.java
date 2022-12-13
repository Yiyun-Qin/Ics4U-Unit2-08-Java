/*
* This program is a vehicle class.
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
*/

public class Vehicle {
  public String color;
  protected int speedCar = 0;
  private final int maxinumSpeed;

  // constructor
  public Vehicle (String color, int maxSpeed) {
    this.color = color;
    this.maxinumSpeed = maxSpeed;
  }

  // getters
  public void status () {
    System.out.println(" -> Speed: " + this.speedCar);
    System.out.println(" -> MaxSpeed: " + this.maxinumSpeed);
    System.out.println(" -> Color: " + this.color);
  }

  // setters

  // methods
  public void accelerate (int accelerationPower, int accelerationTime) {
    this.speedCar = accelerationPower * accelerationTime + this.speedCar;
  }

  public void Break (int breakPower, int breakTime) {
    this.speedCar = this.speedCar - breakPower * breakTime;
  }
}
/* You are designing a system for a greenhouse. The ClimateControl class manages the targetTemperature. If the temperature is set too high (above 40°C) or too low (below 10°C), the plants will die. By using encapsulation, you prevent any external program from accidentally setting a "lethal" temperature. */

class ClimateControl {
private double targetTemperature;

ClimateControl(double initialTemp) {
this.targetTemperature = initialTemp;
}

public double getTargetTemperature() {
return targetTemperature;
}

public void setTargetTemperature(double newTemp) {
if (newTemp >= 10.0 && newTemp <= 40.0) {
this.targetTemperature = newTemp;
System.out.println("System: Temperature updated to " + newTemp + "°C.");
} else {
System.out.println("Error: " + newTemp + "°C is outside safe greenhouse limits!");
}
}
}

public class GreenhouseSystem {
public static void main(String[] args) {
ClimateControl controller = new ClimateControl(22.0);

controller.setTargetTemperature(28.5);

// controller.targetTemperature = 100.0; 
controller.setTargetTemperature(100.0); 

System.out.println("Current Operating Temp: " + controller.getTargetTemperature());
}
}